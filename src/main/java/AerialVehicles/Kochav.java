package AerialVehicles;

import Missions.AttackMission;
import Missions.Mission;
import Missions.MissionTypeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Kochav extends Hermes implements AerialAttackVehicle {

    String missileType;
    int numOfMissiles;

    public Kochav(int numOfMissiles, String missileType, String sensorType, String cameraType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(sensorType, cameraType, pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
        this.missileType = missileType;
        this.numOfMissiles = numOfMissiles;
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
}
