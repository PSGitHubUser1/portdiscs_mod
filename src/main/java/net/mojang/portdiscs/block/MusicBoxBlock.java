
package net.mojang.portdiscs.block;

import net.mojang.portdiscs.procedures.MusicBoxRedstoneOnProcedure;
import net.mojang.portdiscs.procedures.MusicBoxOnBlockRightClickedProcedure;
import net.mojang.portdiscs.procedures.MusicBoxOnBlockHitByProjectileProcedure;
import net.mojang.portdiscs.procedures.MusicBoxBlockDestroyedByExplosionProcedure;
import net.mojang.portdiscs.init.PortdiscsModBlocks;

import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;
import java.util.Collections;

public class MusicBoxBlock extends Block {
	public static BlockBehaviour.Properties PROPERTIES = FabricBlockSettings.of(Material.WOOD).sound(SoundType.WOOD).strength(2f, 6f);

	public MusicBoxBlock() {
		super(PROPERTIES);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		if (world.getBestNeighborSignal(pos) > 0) {
			MusicBoxRedstoneOnProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("x", pos.getX())
					.put("y", pos.getY()).put("z", pos.getZ()).put("world", world).build());
		}
	}

	@Override
	public void wasExploded(Level world, BlockPos pos, Explosion e) {
		super.wasExploded(world, pos, e);
		MusicBoxBlockDestroyedByExplosionProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("x", pos.getX())
				.put("y", pos.getY()).put("z", pos.getZ()).put("world", world).build());
	}

	@Override
	public void onProjectileHit(Level world, BlockState blockstate, BlockHitResult hit, Projectile entity) {
		MusicBoxOnBlockHitByProjectileProcedure
				.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("x", hit.getBlockPos().getX())
						.put("y", hit.getBlockPos().getY()).put("z", hit.getBlockPos().getZ()).put("world", world).build());
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		MusicBoxOnBlockRightClickedProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("world", world).put("x", x)
				.put("y", y).put("z", z).put("entity", entity).build());
		return InteractionResult.SUCCESS;
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(PortdiscsModBlocks.MUSIC_BOX, RenderType.solid());
	}
}
