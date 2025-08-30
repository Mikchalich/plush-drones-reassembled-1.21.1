package net.mikhalich.plushdronesreassembledmod.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class JPlushie extends Plushie {
    public JPlushie(Properties properties) {
        super(properties);
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        Direction facing = state.getValue(FACING);
        return switch (facing) {
            case NORTH, SOUTH -> Shapes.box(0.20f, 0f, 0.25f, 0.90f, 0.9f, 0.75f);
            case EAST, WEST -> Shapes.box(0.25f, 0f, 0.20f, 0.75f, 0.9f, 0.90f);
            default -> Shapes.block();
        };
    }
}
