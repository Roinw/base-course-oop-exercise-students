package AerialVehicles;

import Missions.BdaMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;
import lombok.Getter;
import lombok.Setter;

import static Shard.ShardConstants.HERMES_MAX_FLIGHT_HOURS_SINCE_LAST_REPAIR;

@Setter
@Getter
public class Hermes extends AerialVehicle implements AerialBdaVehicle, AerialIntelligenceVehicle {

    String sensorType;
    String cameraType;

    public Hermes(String sensorType, String cameraType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
        this.sensorType = sensorType;
        this.cameraType = cameraType;
    }

    @Override
    public String preformBda() throws MissionTypeException {
        if (this.mission instanceof BdaMission) {
            BdaMission bdaMission = (BdaMission) mission;
            return this.pilotName + ": " +
                    this.getClass().getSimpleName() + " taking pictures of " +
                    bdaMission.getObjective() + " with: " +
                    this.cameraType;
        } else {
            throw new MissionTypeException("Failed to preformBda, because mission isn't BdaMission");
        }
    }

    @Override
    public String collectIntelligence() throws MissionTypeException {
        if (this.mission instanceof IntelligenceMission) {
            IntelligenceMission intelligenceMission = (IntelligenceMission) mission;
            return this.pilotName + ": " +
                    this.getClass().getSimpleName() + " Collecting Data in " +
                    intelligenceMission.getRegion() + " with sensor type: " +
                    this.sensorType;
        } else {
            throw new MissionTypeException("Failed to collect intelligence, because mission isn't IntelligenceMission");
        }
    }

    @Override
    public void check() {
        if (hoursOfFlightSinceLastRepair >= HERMES_MAX_FLIGHT_HOURS_SINCE_LAST_REPAIR) {
            repair();
        }
    }
}
