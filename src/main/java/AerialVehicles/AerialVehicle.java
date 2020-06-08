package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class AerialVehicle {

    protected String pilotName;
    protected Mission mission;
    protected int hoursOfFlightSinceLastRepair;
    protected boolean isReadyToFly;

    public void flyTo(Coordinates coordinates) {
        System.out.println("Flying To: " + coordinates.getLongitude() + ", " + coordinates.getLatitude());
    }

    public void land() {
        System.out.println("Landing");
    }

    public abstract void check();

    public void repair() {
        isReadyToFly = true;
        hoursOfFlightSinceLastRepair = 0;
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public int getHoursOfFlightSinceLastRepair() {
        return hoursOfFlightSinceLastRepair;
    }

    public void setHoursOfFlightSinceLastRepair(int hoursOfFlightSinceLastRepair) {
        this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair;
    }

    public boolean isReadyToFly() {
        return isReadyToFly;
    }

    public void setReadyToFly(boolean readyToFly) {
        isReadyToFly = readyToFly;
    }
}
