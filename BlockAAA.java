package com.endartmod.block;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockAAA {
	public static Block end_rod_red = new BlockEndRodRed();
	public static Block end_rod_yellow=new BlockEndRodYellow();
	public static Block end_rod_blue=new BlockEndRodBlue();
	public static Block end_rod_green=new BlockEndRodGreen();
	public static Block end_rod_black=new BlockEndRodBlack();
	public static Block end_rod_brown=new BlockEndRodBrown();
	public static Block end_rod_purple=new BlockEndRodPurple();
	public static Block end_rod_pink=new BlockEndRodPink();
	public static Block end_rod_cyan=new BlockEndRodCyan();
	public static Block end_rod_gray=new BlockEndRodGray();	
	public static Block end_rod_light_blue=new BlockEndRodLightBlue();
	public static Block end_rod_lime=new BlockEndRodLime();
	public static Block end_rod_magenta=new BlockEndRodMagenta();
	public static Block end_rod_orange=new BlockEndRodOrange();
	public static Block end_rod_silver=new BlockEndRodSilver();
	
	public static Block end_pocket=new BlockEndPocket();
	public static Block end_pocket_advanced=new BlockEndPocket();
	
	public static Block end_shulker_shell=new BlockShulkerShell();

    public BlockAAA(FMLPreInitializationEvent event)
    {
        register(end_rod_red, "end_rod_red");
        register(end_rod_yellow, "end_rod_yellow");
        register(end_rod_blue,"end_rod_blue");
        register(end_rod_green,"end_rod_green");
        register(end_rod_black,"end_rod_black");
        register(end_rod_brown,"end_rod_brown");
        register(end_rod_purple,"end_rod_purple");
        register(end_rod_pink,"end_rod_pink");
        register(end_rod_cyan,"end_rod_cyan");
        register(end_rod_gray,"end_rod_gray");
        register(end_rod_light_blue,"end_rod_light_blue");
        register(end_rod_lime,"end_rod_lime");
        register(end_rod_magenta,"end_rod_magenta");
        register(end_rod_orange,"end_rod_orange");
        register(end_rod_silver,"end_rod_silver");
        
        register(end_pocket,"end_pocket");
        register(end_pocket_advanced,"end_pocket_advanced");
        
        register(end_shulker_shell,"end_shulker_shell");
    }                                                                                                                                                                                                                             
    
    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {
        registerRender(end_rod_red);
        registerRender(end_rod_yellow);
        registerRender(end_rod_blue);
        registerRender(end_rod_green);
        registerRender(end_rod_black);
        registerRender(end_rod_brown);
        registerRender(end_rod_purple);
        registerRender(end_rod_pink);
        registerRender(end_rod_cyan);
        registerRender(end_rod_gray);
        registerRender(end_rod_light_blue);
        registerRender(end_rod_lime);
        registerRender(end_rod_magenta);
        registerRender(end_rod_orange);
        registerRender(end_rod_silver);
        
        registerRender(end_pocket);
        registerRender(end_pocket_advanced);
        
        registerRender(end_shulker_shell);
    }
    /*
    @Override
    public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn)
    {
        if (!worldIn.isRemote)
        {
             worldIn.setBlockToAir(pos);
        }
    }
    */
    
    
    
    
    /*
     * auto part
     * */
	private static void register(Block block, String name)
    {
        GameRegistry.registerBlock(block, name);
    }
	
	@SuppressWarnings("deprecation")
	@SideOnly(Side.CLIENT)
    private static void registerRender(Block block)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0,
                new ModelResourceLocation(GameRegistry.findUniqueIdentifierFor(block).toString(), "inventory"));
    }
}
