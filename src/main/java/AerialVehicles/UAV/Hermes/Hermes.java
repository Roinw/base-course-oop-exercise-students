package AerialVehicles.UAV.Hermes;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.UAV.UAV;
import Missions.Mission;
import lombok.Getter;
import lombok.Setter;

import static Shard.ShardConstants.HERMES_MAX_FLIGHT_HOURS_SINCE_LAST_REPAIR;

@Setter
@Getter
public class Hermes extends UAV implements AerialBdaVehicle {

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
