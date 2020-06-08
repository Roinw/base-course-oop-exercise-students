package AerialVehicles;

import Missions.MissionTypeException;

public interface AerialIntelligenceVehicle {

    String getSensorType();

    void setSensorType(String sensorType);

    String collectIntelligence() throws MissionTypeException;
}
