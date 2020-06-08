package AerialVehicles;

import Missions.AttackMission;
import Missions.Mission;
import Missions.MissionTypeException;

public interface AerialAttackVehicle {

    int getNumOfMissiles();

    void setNumOfMissiles(int numOfMissiles);

    String getMissileType();

    void setMissileType(String missileType);

    Mission getMission();

    String getPilotName();

    default String attack() throws MissionTypeException {
        if (getMission() instanceof AttackMission) {
            AttackMission attackMission = (AttackMission) getMission();
            return getPilotName() + ": " +
                    this.getClass().getSimpleName() + " Attaking " +
                    attackMission.getTarget() + " with: " +
                    getMissileType() + "X" +
                    getNumOfMissiles();
        } else {
            throw new MissionTypeException("Failed to attack, because mission isn't attackMission");
        }
    }
}
