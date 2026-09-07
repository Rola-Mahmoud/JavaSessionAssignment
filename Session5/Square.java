package Session5;

import Session4.Rectangle;

public class Square extends Rectangle {
    @Override
    public double calculateParameter(){
        return 4*length;
    }
}
