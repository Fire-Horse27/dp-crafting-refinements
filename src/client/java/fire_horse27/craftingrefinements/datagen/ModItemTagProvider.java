package fire_horse27.craftingrefinements.datagen;

import fire_horse27.craftingrefinements.CraftingRefinements;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.references.BlockItemId;
import net.minecraft.references.BlockItemIds;
import net.minecraft.references.ItemIds;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final String ROCK_ID = "crrock";

    public static final TagKey<Item> BRAIN_CORALS = TagKey.create(Registries.ITEM,
            Identifier.fromNamespaceAndPath(ROCK_ID, "brain_corals"));
    public static final TagKey<Item> BUBBLE_CORALS = TagKey.create(Registries.ITEM,
            Identifier.fromNamespaceAndPath(ROCK_ID, "bubble_corals"));
    public static final TagKey<Item> FIRE_CORALS = TagKey.create(Registries.ITEM,
            Identifier.fromNamespaceAndPath(ROCK_ID, "fire_corals"));
    public static final TagKey<Item> HORN_CORALS = TagKey.create(Registries.ITEM,
            Identifier.fromNamespaceAndPath(ROCK_ID, "horn_corals"));
    public static final TagKey<Item> TUBE_CORALS = TagKey.create(Registries.ITEM,
            Identifier.fromNamespaceAndPath(ROCK_ID, "tube_corals"));
    public static final TagKey<Item> DEAD_BRAIN_CORALS = TagKey.create(Registries.ITEM,
            Identifier.fromNamespaceAndPath(ROCK_ID, "dead_brain_corals"));
    public static final TagKey<Item> DEAD_BUBBLE_CORALS = TagKey.create(Registries.ITEM,
            Identifier.fromNamespaceAndPath(ROCK_ID, "dead_bubble_corals"));
    public static final TagKey<Item> DEAD_FIRE_CORALS = TagKey.create(Registries.ITEM,
            Identifier.fromNamespaceAndPath(ROCK_ID, "dead_fire_corals"));
    public static final TagKey<Item> DEAD_HORN_CORALS = TagKey.create(Registries.ITEM,
            Identifier.fromNamespaceAndPath(ROCK_ID, "dead_horn_corals"));
    public static final TagKey<Item> DEAD_TUBE_CORALS = TagKey.create(Registries.ITEM,
            Identifier.fromNamespaceAndPath(ROCK_ID, "dead_tube_corals"));

    public static final TagKey<Item> DEAD_CORAL_BLOCKS = TagKey.create(Registries.ITEM,
            Identifier.fromNamespaceAndPath(ROCK_ID, "dead_coral_blocks"));

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        builder(BRAIN_CORALS)
                .add(BlockItemIds.BRAIN_CORAL)
                .add(BlockItemIds.BRAIN_CORAL_FAN)
                .setReplace(true);

        builder(BUBBLE_CORALS)
                .add(BlockItemIds.BUBBLE_CORAL)
                .add(BlockItemIds.BUBBLE_CORAL_FAN)
                .setReplace(true);

        builder(FIRE_CORALS)
                .add(BlockItemIds.FIRE_CORAL)
                .add(BlockItemIds.FIRE_CORAL_FAN)
                .setReplace(true);

        builder(HORN_CORALS)
                .add(BlockItemIds.HORN_CORAL)
                .add(BlockItemIds.HORN_CORAL_FAN)
                .setReplace(true);

        builder(TUBE_CORALS)
                .add(BlockItemIds.TUBE_CORAL)
                .add(BlockItemIds.TUBE_CORAL_FAN)
                .setReplace(true);

        builder(DEAD_BRAIN_CORALS)
                .add(BlockItemIds.DEAD_BRAIN_CORAL)
                .add(BlockItemIds.DEAD_BRAIN_CORAL_FAN)
                .setReplace(true);

        builder(DEAD_BUBBLE_CORALS)
                .add(BlockItemIds.DEAD_BUBBLE_CORAL)
                .add(BlockItemIds.DEAD_BUBBLE_CORAL_FAN)
                .setReplace(true);

        builder(DEAD_FIRE_CORALS)
                .add(BlockItemIds.DEAD_FIRE_CORAL)
                .add(BlockItemIds.DEAD_FIRE_CORAL_FAN)
                .setReplace(true);

        builder(DEAD_HORN_CORALS)
                .add(BlockItemIds.DEAD_HORN_CORAL)
                .add(BlockItemIds.DEAD_HORN_CORAL_FAN)
                .setReplace(true);

        builder(DEAD_TUBE_CORALS)
                .add(BlockItemIds.DEAD_TUBE_CORAL)
                .add(BlockItemIds.DEAD_TUBE_CORAL_FAN)
                .setReplace(true);

        builder(DEAD_CORAL_BLOCKS)
                .add(BlockItemIds.DEAD_BRAIN_CORAL_BLOCK)
                .add(BlockItemIds.DEAD_BUBBLE_CORAL_BLOCK)
                .add(BlockItemIds.DEAD_FIRE_CORAL_BLOCK)
                .add(BlockItemIds.DEAD_HORN_CORAL_BLOCK)
                .add(BlockItemIds.DEAD_TUBE_CORAL_BLOCK)
                .setReplace(true);
    }

    @Override
    public @NonNull String getName() {
        return "Crafting Refinements Tags";
    }
}
