package Lesson14.ArrayList.Curling;

import java.util.ArrayList;
import java.util.Random;

class CurlingStone {
    private String team;          // "Red" eller "Blue"
    private int distanceToCenter;  // lavere = tættere på centrum

    public CurlingStone(String team, int distanceToCenter) {
        this.team = team;
        this.distanceToCenter = distanceToCenter;
    }

    public String getTeam() {
        return team;
    }

    public int getDistanceToCenter() {
        return distanceToCenter;
    }

    @Override
    public String toString() {
        return team + " stone (" + distanceToCenter + "cm from center)";
    }
}
