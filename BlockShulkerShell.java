package com.endartmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.endartmod.creativetab.CreativeTabsLoader;

public class BlockShulkerShell extends Block{
	public BlockShulkerShell() {
		super(Material.rock);
		this.setHardness(0.0F);
		this.setLightLevel(0.0625F);
		this.setCreativeTab(CreativeTabsLoader.tabEndArtBlock);
		this.setUnlocalizedName("end_shell_shulker");
		// TODO Auto-generated constructor stub
	}
}
