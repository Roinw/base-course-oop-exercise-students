package AerialVehicles.UAV;

import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.Mission;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class UAV extends AerialVehicle implements AerialIntelligenceVehicle {

    protected String sensorType;

    public UAV(String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
        this.sensorType = sensorType;
    }
}
