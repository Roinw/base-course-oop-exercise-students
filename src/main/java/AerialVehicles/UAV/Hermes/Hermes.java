package AerialVehicles.UAV.Hermes;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.UAV.UAV;
import Missions.Mission;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Hermes extends UAV implements AerialBdaVehicle {

    private static final int HERMES_MAX_FLIGHT_HOURS_SINCE_LAST_REPAIR = 150;

    protected String cameraType;

    public Hermes(String sensorType, String cameraType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(sensorType, pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
        this.cameraType = cameraType;
    }

    @Override
    public void check() {
        if (hoursOfFlightSinceLastRepair >= HERMES_MAX_FLIGHT_HOURS_SINCE_LAST_REPAIR) {
            repair();
        }
    }
}
