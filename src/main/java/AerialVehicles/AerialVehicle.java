package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public abstract class AerialVehicle {

    protected String pilotName;
    protected Mission mission;
    protected int hoursOfFlightSinceLastRepair;
    protected boolean isReadyToFly;

    public abstract void check();

    public void land() {
        System.out.println("Landing");
    }

    public void flyTo(Coordinates coordinates) {
        System.out.println("Flying To: " + coordinates.getLongitude() + ", " + coordinates.getLatitude());
    }

    public void repair() {
        isReadyToFly = true;
        hoursOfFlightSinceLastRepair = 0;
    }
}
