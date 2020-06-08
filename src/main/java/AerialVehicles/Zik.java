package AerialVehicles;

import Missions.Mission;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Zik extends Hermes {

    String sensorType;
    String cameraType;

    public Zik(String sensorType, String cameraType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(sensorType, cameraType, pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
    }
}
