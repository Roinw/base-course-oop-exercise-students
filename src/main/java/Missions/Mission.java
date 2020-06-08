package Missions;

import Entities.Coordinates;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Mission {

    protected Coordinates targetCoordinates;

    public void begin() {
        System.out.println("Start Mission!");
    }

    public void cancel() {
        System.out.println("Abort Mission!");
    }

    public void finish() {
        System.out.println("Finish Mission!");
    }
}
