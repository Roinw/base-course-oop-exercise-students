package Missions;

import Entities.Coordinates;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IntelligenceMission extends Mission {

    private String region;

    public IntelligenceMission(String region, Coordinates targetCoordinates) {
        this.region = region;
        this.targetCoordinates = targetCoordinates;
    }
}
