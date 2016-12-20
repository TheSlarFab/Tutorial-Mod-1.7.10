package com.slarmods.tutorial.block;

import java.util.List;
import java.util.Random;

import com.slarmods.tutorial.TutorialMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockTutOneSlab extends BlockSlab {
	public static final String[] slab = new String[] { "tutorial1" };

	public BlockTutOneSlab(Material material, boolean isDoubleSlab) {
		super(isDoubleSlab, material);
		this.setLightOpacity(0);
		this.setHardness(2.0F);
		this.setStepSound(soundTypeStone);
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2) {
		return TutorialMod.tutblock1.getIcon(par1, par2 & 7);
	}

	public Item getItemDropped(int meta, Random random, int fortune) {
		return Item.getItemFromBlock(TutorialMod.tutslab1);
	}

	protected ItemStack createStackedBlock(int stackedBlock) {
		return new ItemStack(Item.getItemFromBlock(TutorialMod.tutslab1), 2, stackedBlock & 7);
	}

	@Override
	public String func_150002_b(int llength) {
		if (llength < 0 || llength >= slab.length) {
			llength = 0;
		}

		return super.getUnlocalizedName() + "." + slab[llength];
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs creativeTab, List list) {
		if (item != Item.getItemFromBlock(TutorialMod.tutdoubleslab1)) {
			for (int i = 0; i < slab.length; ++i) {
				list.add(new ItemStack(item, 1, i));
			}
		}
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {

	}
}
