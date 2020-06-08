package AerialVehicles.UAV.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.UAV.UAV;
import Missions.Mission;
import lombok.Getter;
import lombok.Setter;

import static Shard.ShardConstants.HARON_MAX_FLIGHT_HOURS_SINCE_LAST_REPAIR;

@Getter
@Setter
public class Haron extends UAV implements AerialAttackVehicle {

    protected String missileType;
    protected int numOfMissiles;

    public Haron(int numOfMissiles, String missileType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(sensorType, pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
        this.missileType = missileType;
        this.numOfMissiles = numOfMissiles;
    }

    @Override
    public void check() {
        if (hoursOfFlightSinceLastRepair >= HARON_MAX_FLIGHT_HOURS_SINCE_LAST_REPAIR) {
            repair();
        }
    }
}
