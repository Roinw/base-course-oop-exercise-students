package AerialVehicles.UAV.Haron;

import AerialVehicles.AerialBdaVehicle;
import Missions.Mission;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Shoval extends Haron implements AerialBdaVehicle {

    private String cameraType;

    public Shoval(int numOfMissiles, String missileType, String sensorType, String cameraType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(numOfMissiles, missileType, sensorType, pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
        this.cameraType = cameraType;
    }
}

