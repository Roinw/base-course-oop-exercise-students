package AerialVehicles;

import Missions.Mission;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Eitan extends Haron {

    public Eitan(int numOfMissiles, String missileType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(numOfMissiles, missileType, sensorType, pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
    }
}
