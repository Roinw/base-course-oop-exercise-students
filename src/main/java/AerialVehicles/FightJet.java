package AerialVehicles;

import Missions.AttackMission;
import Missions.Mission;
import Missions.MissionTypeException;
import lombok.Getter;
import lombok.Setter;

import static Shard.ShardConstants.FIGHT_JET_MAX_FLIGHT_HOURS_SINCE_LAST_REPAIR;

@Getter
@Setter
public class FightJet extends AerialVehicle implements AerialAttackVehicle {

    String missileType;
    int numOfMissiles;

    public FightJet(int numOfMissiles, String missileType, String pilotName, Mission mission, int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        super(pilotName, mission, hoursOfFlightSinceLastRepair, isReadyToFly);
        this.missileType = missileType;
        this.numOfMissiles = numOfMissiles;
    }

    @Override
    public String attack() throws MissionTypeException {
        if (this.mission instanceof AttackMission) {
            AttackMission attackMission = (AttackMission) mission;
            return this.pilotName + ": " +
                    this.getClass().getSimpleName() + " Attaking " +
                    attackMission.getTarget() + " with: " +
                    this.missileType + "X" +
                    this.numOfMissiles;
        } else {
            throw new MissionTypeException("Failed to attack, because mission isn't attackMission");
        }
    }

    @Override
    public void check() {
        if (hoursOfFlightSinceLastRepair >= FIGHT_JET_MAX_FLIGHT_HOURS_SINCE_LAST_REPAIR) {
            repair();
        }
    }
}
