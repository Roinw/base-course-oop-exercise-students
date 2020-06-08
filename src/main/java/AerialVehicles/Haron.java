package AerialVehicles;

import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;
import lombok.Getter;
import lombok.Setter;

import static Shard.ShardConstants.HARON_MAX_FLIGHT_HOURS_SINCE_LAST_REPAIR;

@Getter
@Setter
public class Haron extends AerialVehicle implements AerialAttackVehicle, AerialIntelligenceVehicle {

    String missileType;
    int numOfMissiles;
    String sensorType;

    public Haron(int numOfMissiles, String missileType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
        this.missileType = missileType;
        this.numOfMissiles = numOfMissiles;
        this.sensorType = sensorType;
    }

    @Override
    public String attack() throws MissionTypeException {
        if (this.mission instanceof AttackMission) {
            AttackMission attackMission = (AttackMission) mission;
            return this.pilotName + ": " +
                    this.getClass().getSimpleName() + " Attaking " +
                    attackMission.getTarget() + " with: " +
                    this.missileType + "X" +
                    this.numOfMissiles;
        } else {
            throw new MissionTypeException("Failed to attack, because mission isn't attackMission");
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
        if (hoursOfFlightSinceLastRepair >= HARON_MAX_FLIGHT_HOURS_SINCE_LAST_REPAIR) {
            repair();
        }
    }
}
