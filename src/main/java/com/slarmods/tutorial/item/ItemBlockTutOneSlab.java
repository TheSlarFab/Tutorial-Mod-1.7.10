package com.slarmods.tutorial.item;

import com.slarmods.tutorial.TutorialMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

public class ItemBlockTutOneSlab extends ItemSlab {

	public ItemBlockTutOneSlab(Block block) {
		super(block, (BlockSlab) TutorialMod.tutslab1, (BlockSlab) TutorialMod.tutdoubleslab1, false);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}
}
