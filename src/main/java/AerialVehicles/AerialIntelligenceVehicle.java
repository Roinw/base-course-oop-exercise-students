package AerialVehicles;

import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public interface AerialIntelligenceVehicle {

    String getSensorType();

    void setSensorType(String sensorType);

    Mission getMission();

    String getPilotName();

    default String collectIntelligence() throws MissionTypeException {
        if (getMission() instanceof IntelligenceMission) {
            IntelligenceMission intelligenceMission = (IntelligenceMission) getMission();
            return getPilotName() + ": " +
                    this.getClass().getSimpleName() + " Collecting Data in " +
                    intelligenceMission.getRegion() + " with sensor type: " +
                    getSensorType();
        } else {
            throw new MissionTypeException("Failed to collect intelligence, because mission isn't IntelligenceMission");
        }
    }
}
