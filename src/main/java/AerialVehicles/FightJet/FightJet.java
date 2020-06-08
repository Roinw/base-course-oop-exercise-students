package AerialVehicles.FightJet;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialVehicle;
import Missions.Mission;
import lombok.Getter;
import lombok.Setter;

import static Shard.ShardConstants.FIGHT_JET_MAX_FLIGHT_HOURS_SINCE_LAST_REPAIR;

@Getter
@Setter
public class FightJet extends AerialVehicle implements AerialAttackVehicle {

    protected String missileType;
    protected int numOfMissiles;

    public FightJet(int numOfMissiles, String missileType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
        this.missileType = missileType;
        this.numOfMissiles = numOfMissiles;
    }

    @Override
    public void check() {
        if (hoursOfFlightSinceLastRepair >= FIGHT_JET_MAX_FLIGHT_HOURS_SINCE_LAST_REPAIR) {
            repair();
        }
    }
}
