package com.slarmods.tutorial;

import com.slarmods.tutorial.block.BlockTutOneSlab;
import com.slarmods.tutorial.block.BlockTutorialBlockOne;
import com.slarmods.tutorial.item.ItemBlockTutOneSlab;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

@Mod(modid = TutorialMod.modid, version = TutorialMod.version)
public class TutorialMod {

	public static final String modid = "tutorialmod";
	public static final String version = "v0.1 Alpha";

	public static Block tutblock1;
	public static Block tutslab1;
	public static Block tutdoubleslab1;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		tutblock1 = new BlockTutorialBlockOne(Material.rock).setBlockName("tutblock1")
				.setBlockTextureName(TutorialMod.modid + ":" + "tutblock1");
		tutdoubleslab1 = new BlockTutOneSlab(Material.rock, true).setBlockName("double_tut1_slab")
				.setBlockTextureName("tutblock1");
		tutslab1 = new BlockTutOneSlab(Material.rock, false).setBlockName("tut1_slab").setBlockTextureName("tutblock1");

		// Registers
		GameRegistry.registerBlock(tutblock1, tutblock1.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(tutdoubleslab1, ItemBlockTutOneSlab.class,
				tutdoubleslab1.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(tutslab1, ItemBlockTutOneSlab.class, tutslab1.getUnlocalizedName().substring(5));
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}
