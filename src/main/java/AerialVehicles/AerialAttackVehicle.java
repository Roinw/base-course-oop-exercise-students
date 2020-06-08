package AerialVehicles;

import Missions.MissionTypeException;

public interface AerialAttackVehicle {

    int getNumOfMissiles();

    void setNumOfMissiles(int numOfMissiles);

    String getMissileType();

    void setMissileType(String missileType);

    String attack() throws MissionTypeException;
}
