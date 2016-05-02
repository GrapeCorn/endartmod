package com.endartmod.block;

import net.minecraft.block.BlockEndRod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import com.endartmod.creativetab.CreativeTabsLoader;

public class BlockEndRodCyan extends BlockEndRod{
	public BlockEndRodCyan()
    {
        super();
        this.setUnlocalizedName("end_rod_cyan");
        this.setCreativeTab(CreativeTabsLoader.tabEndArt);
        this.setLightLevel(0.9375F);
    }
	
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        IBlockState iblockstate = worldIn.getBlockState(pos.offset(facing.getOpposite()));

        if (iblockstate.getBlock() == BlockAAA.end_rod_cyan)
        {
            EnumFacing enumfacing = (EnumFacing)iblockstate.getValue(FACING);

            if (enumfacing == facing)
            {
                return this.getDefaultState().withProperty(FACING, facing.getOpposite());
            }
        }

        return this.getDefaultState().withProperty(FACING, facing);
    }
}
