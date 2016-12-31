package com.slarmods.tutorial;

import com.slarmods.tutorial.block.BlockTutOneSlab;
import com.slarmods.tutorial.block.BlockTutOneStairs;
import com.slarmods.tutorial.block.BlockTutorialBlockOne;
import com.slarmods.tutorial.item.ItemBlockTutOneSlab;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWood;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

@Mod(modid = TutorialMod.modid, version = TutorialMod.version)
public class TutorialMod {

	public static final String modid = "tutorialmod";
	public static final String version = "v0.1 Alpha";

	public static Block tutblock1;
	public static Block tutslab1;
	public static Block tutdoubleslab1;
	public static Block tutstairs1;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Blocks
		tutblock1 = new BlockTutorialBlockOne(Material.rock).setBlockName("tutblock1")
				.setBlockTextureName(TutorialMod.modid + ":" + "tutblock1").setCreativeTab(CreativeTabs.tabBlock);
		tutdoubleslab1 = new BlockTutOneSlab(Material.rock, true).setBlockName("double_tut1_slab")
				.setBlockTextureName("tutblock1");
		tutslab1 = new BlockTutOneSlab(Material.rock, false).setBlockName("tut1_slab").setBlockTextureName("tutblock1")
				.setCreativeTab(CreativeTabs.tabBlock);

		Block block = (new BlockWood()).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundTypeStone)
				.setBlockName("wood").setBlockTextureName("planks");
		tutstairs1 = new BlockTutOneStairs(block, 0).setBlockName("tutstairs1")
				.setCreativeTab(CreativeTabs.tabBlock);

		// Existing Blocks and Items in CreativeTabs
		Blocks.command_block.setCreativeTab(CreativeTabs.tabRedstone);
		Items.command_block_minecart.setCreativeTab(CreativeTabs.tabTransport);
		
		// Registers
		GameRegistry.registerBlock(tutblock1, tutblock1.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(tutdoubleslab1, ItemBlockTutOneSlab.class,
				tutdoubleslab1.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(tutslab1, ItemBlockTutOneSlab.class, tutslab1.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(tutstairs1, tutstairs1.getUnlocalizedName().substring(5));
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
