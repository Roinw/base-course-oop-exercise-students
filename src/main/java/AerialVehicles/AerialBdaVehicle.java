package AerialVehicles;

import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public interface AerialBdaVehicle {

    String getCameraType();

    void setCameraType(String cameraType);

    Mission getMission();

    String getPilotName();

    default String preformBda() throws MissionTypeException {
        if (getMission() instanceof BdaMission) {
            BdaMission bdaMission = (BdaMission) getMission();
            return getPilotName() + ": " +
                    this.getClass().getSimpleName() + " taking pictures of " +
                    bdaMission.getObjective() + " with: " +
                    getCameraType();
        } else {
            throw new MissionTypeException("Failed to preformBda, because mission isn't BdaMission");
        }
    }
}
