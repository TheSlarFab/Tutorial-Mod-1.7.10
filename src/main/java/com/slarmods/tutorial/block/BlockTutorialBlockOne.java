package com.slarmods.tutorial.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTutorialBlockOne extends Block {

	public BlockTutorialBlockOne(Material material) {
		super(material);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		this.setStepSound(soundTypePiston);
		this.setHardness(2.0F);
	}
}
