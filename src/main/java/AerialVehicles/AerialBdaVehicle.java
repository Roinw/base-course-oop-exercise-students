package AerialVehicles;

import Missions.MissionTypeException;

public interface AerialBdaVehicle {

    String getCameraType();

    void setCameraType(String cameraType);

    String preformBda() throws MissionTypeException;
}
