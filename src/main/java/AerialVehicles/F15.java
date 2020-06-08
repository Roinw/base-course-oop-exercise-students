package AerialVehicles;

import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class F15 extends FightJet implements AerialIntelligenceVehicle {

    String sensorType;

    public F15(int numOfMissiles, String missileType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(numOfMissiles, missileType, pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
        this.sensorType = sensorType;
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
}
