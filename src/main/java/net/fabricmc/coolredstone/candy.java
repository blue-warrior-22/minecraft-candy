package net.fabricmc.coolredstone;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.coolredstone.candycomponents.candyonecomponetnts;
import net.fabricmc.coolredstone.candycomponents.candytwocomponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class candy implements ModInitializer {
	public static final Item CANDY_ONE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(candyonecomponetnts.candyone));
	public static final Item CANDY_TWO = new Item(new Item.Settings().group(ItemGroup.FOOD).food(candytwocomponents.candytwo));
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("coolredstone", "candy_one"), CANDY_ONE);
		Registry.register(Registry.ITEM, new Identifier("coolredstone", "candy_two"), CANDY_TWO);
	}
}
