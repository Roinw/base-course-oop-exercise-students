package AerialVehicles.UAV.Hermes;

import AerialVehicles.AerialAttackVehicle;
import Missions.Mission;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Kochav extends Hermes implements AerialAttackVehicle {

    private String missileType;
    private int numOfMissiles;

    public Kochav(int numOfMissiles, String missileType, String sensorType, String cameraType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(sensorType, cameraType, pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
        this.missileType = missileType;
        this.numOfMissiles = numOfMissiles;
    }
}
