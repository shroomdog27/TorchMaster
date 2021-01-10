package net.xalcon.torchmaster.common.logic.entityblocking;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityCheckSpecialSpawnEvent.SpecialSpawnType;
import net.xalcon.torchmaster.TorchmasterConfig;
import net.xalcon.torchmaster.util.Location;

public interface IEntityBlockingLight
{
    boolean shouldBlockEntity(Entity entity);
    boolean shouldBlockEntity(SpecialSpawnType type, Location location);
    String getLightSerializerKey();

    String getName();
    BlockPos getPos();

    /**
     * Called frequently for cleanup purposes
     * Use this to check if the light should be removed from the registry, i.e. because a block no longer exists, etc
     * @param world the world
     * @return true if this instance should be removed from the registry, otherwise false.
     */
    boolean cleanupCheck(World world);
    
    
     boolean shouldBlockSpecialSpawn(SpecialSpawnType type);
    
}
