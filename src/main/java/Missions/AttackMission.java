package Missions;

import Entities.Coordinates;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AttackMission extends Mission {

    private String target;

    public AttackMission(String target, Coordinates targetCoordinates) {
        this.target = target;
        this.targetCoordinates = targetCoordinates;
    }
}
