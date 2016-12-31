package com.slarmods.tutorial.block;

import com.slarmods.tutorial.TutorialMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTutOneStairs extends BlockStairs {
	private final Block blockModel;
	private final int idk;

	public BlockTutOneStairs(Block block, int par2) {
		super(TutorialMod.tutblock1, par2);
		this.blockModel = block;
		this.idk = par2;
		this.setHardness(2.0F);
		this.setResistance(0.3F);
		this.setStepSound(block.stepSound);
		this.setLightOpacity(255);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.useNeighborBrightness = true;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

	public int getRenderType() {
		return 10;
	}
}