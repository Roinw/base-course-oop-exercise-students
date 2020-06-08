package AerialVehicles.UAV.Hermes;

import Missions.Mission;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Zik extends Hermes {

    public Zik(String sensorType, String cameraType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(sensorType, cameraType, pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
    }
}
