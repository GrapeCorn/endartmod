package com.endartmod.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.endartmod.creativetab.CreativeTabsLoader;

public class BlockEndAdvancedPocket extends Block{
	public BlockEndAdvancedPocket() {
		super(Material.glass);
		this.setHardness(0.0F);
		this.setLightLevel(0.0625F);
		this.setCreativeTab(CreativeTabsLoader.tabEndArtBlock);
		this.setUnlocalizedName("end_pocket_advanced");
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
		double y=Math.random();
		if(y<0.6){
			return Item.getItemFromBlock(new ma().R());
		}else{
			return new ma().U();
		}
        
    }
	


}
class ma1{
	public Block R(){
		Block j;
		double x=Math.random();
		if(x<0.4){
			j=Blocks.obsidian;
		}else if(x<0.7){
			j=Blocks.chorus_plant;
		}else{
			j=Blocks.end_rod;
		}
		return j;
	}
	
	public Item U(){
		Item k;
		double h=Math.random();
		if(h<0.8){
			k=Items.dragon_breath;
		}else{
			k=Items.elytra;
	}
		return k;
	
	}
}

