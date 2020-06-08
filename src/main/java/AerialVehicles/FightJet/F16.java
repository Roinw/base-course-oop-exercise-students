package AerialVehicles.FightJet;

import AerialVehicles.AerialBdaVehicle;
import Missions.Mission;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class F16 extends FightJet implements AerialBdaVehicle {

    private String cameraType;

    public F16(int numOfMissiles, String missileType, String cameraType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(numOfMissiles, missileType, pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
        this.cameraType = cameraType;
    }
}
