package net.xalcon.torchmaster.util;

import net.minecraft.world.World;

public class Location 
{
    
    public final World world;
    public final double x;
    public final double y;
    public final double z;
    
    public Location(World world, double x, double y, double z)
    {
        this.world = world;
        this.x = x;
        this.y = y;
        this.z = z;
    }
  
}
