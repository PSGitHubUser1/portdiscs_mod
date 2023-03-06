
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mojang.portdiscs.init;

import net.mojang.portdiscs.entity.StaffOfTrappedSoulsEntity;
import net.mojang.portdiscs.entity.StaffMinionEntity;
import net.mojang.portdiscs.entity.SoulfishEntity;
import net.mojang.portdiscs.entity.SoulSeekerEntity;
import net.mojang.portdiscs.entity.LeaveShooterEntity;
import net.mojang.portdiscs.PortdiscsMod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class PortdiscsModEntities {
	public static EntityType<SoulSeekerEntity> SOUL_SEEKER;
	public static EntityType<SoulfishEntity> SOULFISH;
	public static EntityType<StaffOfTrappedSoulsEntity> STAFF_OF_TRAPPED_SOULS;
	public static EntityType<LeaveShooterEntity> LEAVE_SHOOTER;
	public static EntityType<StaffMinionEntity> STAFF_MINION;

	public static void load() {
		SOUL_SEEKER = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(PortdiscsMod.MODID, "soul_seeker"), FabricEntityTypeBuilder.create(MobCategory.MONSTER, SoulSeekerEntity::new)
				.dimensions(new EntityDimensions(0.6f, 1.9000000000000001f, true)).fireImmune().trackRangeBlocks(60).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		SoulSeekerEntity.init();
		FabricDefaultAttributeRegistry.register(SOUL_SEEKER, SoulSeekerEntity.createAttributes());
		SOULFISH = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(PortdiscsMod.MODID, "soulfish"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, SoulfishEntity::new).dimensions(new EntityDimensions(0.4f, 0.3f, true)).trackRangeBlocks(16).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		SoulfishEntity.init();
		FabricDefaultAttributeRegistry.register(SOULFISH, SoulfishEntity.createAttributes());
		STAFF_OF_TRAPPED_SOULS = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(PortdiscsMod.MODID, "staff_of_trapped_souls"), createArrowEntityType(StaffOfTrappedSoulsEntity::new));
		LEAVE_SHOOTER = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(PortdiscsMod.MODID, "leave_shooter"), createArrowEntityType(LeaveShooterEntity::new));
		STAFF_MINION = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(PortdiscsMod.MODID, "staff_minion"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, StaffMinionEntity::new).dimensions(new EntityDimensions(0.4f, 0.3f, true)).trackRangeBlocks(32).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		StaffMinionEntity.init();
		FabricDefaultAttributeRegistry.register(STAFF_MINION, StaffMinionEntity.createAttributes());
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
