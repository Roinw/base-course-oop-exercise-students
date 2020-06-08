package AerialVehicles.FightJet;

import AerialVehicles.AerialIntelligenceVehicle;
import Missions.Mission;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class F15 extends FightJet implements AerialIntelligenceVehicle {

    private String sensorType;

    public F15(int numOfMissiles, String missileType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(numOfMissiles, missileType, pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
        this.sensorType = sensorType;
    }
}
