package strangequark.variablecopperbulbsignal.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.BulbBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(BulbBlock.class)
public class BulbBlockMixin {

	/**
	 * @author Strange Quark
	 * @reason Match the comparator output of the copper bulb to the light level of its oxidation state
	 */
	@Overwrite
	public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
		return world.getBlockState(pos).getLuminance();
	}
}