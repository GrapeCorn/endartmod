package com.endartmod.block;

import java.util.Random;

import com.endartmod.creativetab.CreativeTabsLoader;
import com.endartmod.item.ItemAAA;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

public class BlockEndPocket extends Block{
	
	

	public BlockEndPocket() {
		super(Material.glass);
		this.setHardness(0.0F);
		this.setLightLevel(0.0625F);
		this.setCreativeTab(CreativeTabsLoader.tabEndArtBlock);
		this.setUnlocalizedName("end_pocket");
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
class ma{
	public Block R(){
		Block j;
		double x=Math.random();
		if(x<0.2){
			j=Blocks.end_stone;
		}else if(x<0.4){
			j=Blocks.purpur_block;
		}else if(x<0.45){
			j=Blocks.obsidian;
		}else if(x<0.65){
			j=Blocks.end_bricks;
		}else if(x<0.7){
			j=Blocks.chorus_plant;
		}else if(x<0.8){
			j=Blocks.iron_bars;
		}else if(x<0.95){
			j=Blocks.purpur_pillar;
		}else{
			j=Blocks.end_rod;
		}
		return j;
	}
	
	public Item U(){
		Item k;
		double h=Math.random();
		if(h<0.1){
			k=Items.dragon_breath;
		}else if(h<0.5){
			k=Items.ender_pearl;
		}else if(h<0.7){
			k=Items.end_crystal;
		}else if(h<0.71){
			k=Items.elytra;
		}else{
			k=ItemAAA.end_shell;
		}
		return k;
	}
}
