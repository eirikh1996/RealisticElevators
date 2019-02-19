package io.github.eirikh1996.realisticelevators.utils;

import org.bukkit.Location;
import org.bukkit.World;

final public class ElevatorLocation {
    private final int x;
    private final int y;
    private final int z;
    public ElevatorLocation(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public ElevatorLocation add(ElevatorLocation l){
        return new ElevatorLocation(getX() + l.getX(), getY() + l.getY(), getZ() + l.getZ());
    }
    public Location toBukkitLoc(World w){
        return new Location(w,x,y,z);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

}
