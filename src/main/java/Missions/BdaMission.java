package Missions;

import Entities.Coordinates;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BdaMission extends Mission {

    private String objective;

    public BdaMission(String objective, Coordinates targetCoordinates) {
        this.objective = objective;
        this.targetCoordinates = targetCoordinates;
    }
}
