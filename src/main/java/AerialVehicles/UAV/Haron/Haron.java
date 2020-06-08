package AerialVehicles.UAV.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.Mission;
import lombok.Getter;
import lombok.Setter;

import static Shard.ShardConstants.HARON_MAX_FLIGHT_HOURS_SINCE_LAST_REPAIR;

@Getter
@Setter
public class Haron extends AerialVehicle implements AerialAttackVehicle, AerialIntelligenceVehicle {

    protected String missileType;
    protected int numOfMissiles;
    protected String sensorType;

    public Haron(int numOfMissiles, String missileType, String sensorType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
        this.missileType = missileType;
        this.numOfMissiles = numOfMissiles;
        this.sensorType = sensorType;
    }

    @Override
    public void check() {
        if (hoursOfFlightSinceLastRepair >= HARON_MAX_FLIGHT_HOURS_SINCE_LAST_REPAIR) {
            repair();
        }
    }
}
