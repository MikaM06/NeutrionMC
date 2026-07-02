package org.bukkit.craftbukkit.v1_8_R3.entity;

import net.minecraft.entity.item.EntityEnderEye;
import org.bukkit.craftbukkit.v1_8_R3.CraftServer;
import org.bukkit.entity.EnderSignal;
import org.bukkit.entity.EntityType;

public class CraftEnderSignal extends CraftEntity implements EnderSignal {
    public CraftEnderSignal(CraftServer server, EntityEnderEye entity) {
        super(server, entity);
    }

    @Override
    public EntityEnderEye getHandle() {
        return (EntityEnderEye) entity;
    }

    @Override
    public String toString() {
        return "CraftEnderSignal";
    }

    public EntityType getType() {
        return EntityType.ENDER_SIGNAL;
    }
}