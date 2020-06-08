package AerialVehicles;

import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class F16 extends FightJet implements AerialBdaVehicle {

    String cameraType;

    public F16(int numOfMissiles, String missileType, String cameraType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(numOfMissiles, missileType, pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
        this.cameraType = cameraType;
    }

    @Override
    public String preformBda() throws MissionTypeException {
        if (this.mission instanceof BdaMission) {
            BdaMission bdaMission = (BdaMission) mission;
            return this.pilotName + ": " +
                    this.getClass().getSimpleName() + " taking pictures of " +
                    bdaMission.getObjective() + " with: " +
                    this.cameraType;
        } else {
            throw new MissionTypeException("Failed to preformBda, because mission isn't BdaMission");
        }
    }
}
