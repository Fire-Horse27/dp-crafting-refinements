package fire_horse27.template.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final List<Item> PLANKS;
    private static final List<Item> MATERIALS;
    private static final List<Item> LOGS;
    private static final List<Item> STAIRS;
    private static final List<Item> GATES;
    private static final List<Item> TRAPDOORS;
    private static final List<Item> WOOD;

    private static final String MINECRAFT_ID = "minecraft";
    private static final String BLAST_BUFF_ID = "crblastbuff";
    private static final String DISPENSER_ID = "crdispenser";
    private static final String CALCITE_ID = "crcalcite";
    private static final String CORAL_ID = "crcoral";
    private static final String TUFF_ID = "crtuff";
    private static final String CINNABAR_ID = "crcinnabar";
    private static final String BAMBOO_ID = "crbamboo";
    private static final String STONECUTTER_ID = "crstonecutter";
    private static final String TORCHES_ID = "crtorches";
    private static final String CHAINS_ID = "crchains";
    private static final String CONSISTANCY_ID = "crconsistancy";
    private static final String SANDSTONE_ID = "crsandstone";

    static {
        List<Item> list = new ArrayList<>();

        list.addAll(List.of(
                Items.OAK_PLANKS,
                Items.SPRUCE_PLANKS,
                Items.BIRCH_PLANKS,
                Items.JUNGLE_PLANKS,
                Items.ACACIA_PLANKS,
                Items.DARK_OAK_PLANKS,
                Items.MANGROVE_PLANKS,
                Items.CHERRY_PLANKS,
                Items.PALE_OAK_PLANKS,
                Items.BAMBOO_PLANKS,
                Items.CRIMSON_PLANKS,
                Items.WARPED_PLANKS
        ));
        PLANKS = List.copyOf(list);

        list.clear();
        list.addAll(List.of(
                Items.BAMBOO_MOSAIC,
                Items.STONE,
                Items.COBBLESTONE,
                Items.MOSSY_COBBLESTONE,
                Items.STONE_BRICKS,
                Items.MOSSY_STONE_BRICKS,
                Items.GRANITE,
                Items.POLISHED_GRANITE,
                Items.DIORITE,
                Items.POLISHED_DIORITE,
                Items.ANDESITE,
                Items.POLISHED_ANDESITE,
                Items.COBBLED_DEEPSLATE,
                Items.POLISHED_DEEPSLATE,
                Items.DEEPSLATE_BRICKS,
                Items.DEEPSLATE_TILES,
                Items.TUFF,
                Items.POLISHED_TUFF,
                Items.TUFF_BRICKS,
                Items.BRICKS,
                Items.MUD_BRICKS,
                Items.RESIN_BRICKS,
                Items.SANDSTONE,
                Items.SMOOTH_SANDSTONE,
                Items.RED_SANDSTONE,
                Items.SMOOTH_RED_SANDSTONE,
                Items.CINNABAR,
                Items.POLISHED_CINNABAR,
                Items.CINNABAR_BRICKS,
                Items.SULFUR,
                Items.POLISHED_SULFUR,
                Items.SULFUR_BRICKS,
                Items.PRISMARINE,
                Items.PRISMARINE_BRICKS,
                Items.DARK_PRISMARINE,
                Items.NETHER_BRICKS,
                Items.RED_NETHER_BRICKS,
                Items.BLACKSTONE,
                Items.POLISHED_BLACKSTONE,
                Items.POLISHED_BLACKSTONE_BRICKS,
                Items.END_STONE_BRICKS,
                Items.PURPUR_BLOCK,
                Items.QUARTZ_BLOCK,
                Items.SMOOTH_QUARTZ
        ));
        MATERIALS = List.copyOf(list);

        list.clear();
        list.addAll(List.of(
                Items.OAK_LOG,
                Items.SPRUCE_LOG,
                Items.BIRCH_LOG,
                Items.JUNGLE_LOG,
                Items.ACACIA_LOG,
                Items.DARK_OAK_LOG,
                Items.MANGROVE_LOG,
                Items.CHERRY_LOG,
                Items.PALE_OAK_LOG,
                Items.CRIMSON_STEM,
                Items.WARPED_STEM,
                Items.STRIPPED_OAK_LOG,
                Items.STRIPPED_SPRUCE_LOG,
                Items.STRIPPED_BIRCH_LOG,
                Items.STRIPPED_JUNGLE_LOG,
                Items.STRIPPED_ACACIA_LOG,
                Items.STRIPPED_DARK_OAK_LOG,
                Items.STRIPPED_MANGROVE_LOG,
                Items.STRIPPED_CHERRY_LOG,
                Items.STRIPPED_PALE_OAK_LOG,
                Items.STRIPPED_CRIMSON_STEM,
                Items.STRIPPED_WARPED_STEM
        ));
        LOGS = List.copyOf(list);

        list.clear();
        list.addAll(List.of(
                Items.OAK_FENCE_GATE,
                Items.SPRUCE_FENCE_GATE,
                Items.BIRCH_FENCE_GATE,
                Items.JUNGLE_FENCE_GATE,
                Items.ACACIA_FENCE_GATE,
                Items.DARK_OAK_FENCE_GATE,
                Items.MANGROVE_FENCE_GATE,
                Items.CHERRY_FENCE_GATE,
                Items.PALE_OAK_FENCE_GATE,
                Items.BAMBOO_FENCE_GATE,
                Items.CRIMSON_FENCE_GATE,
                Items.WARPED_FENCE_GATE
        ));
        GATES = List.copyOf(list);

        list.clear();
        list.addAll(List.of(
                Items.OAK_TRAPDOOR,
                Items.SPRUCE_TRAPDOOR,
                Items.BIRCH_TRAPDOOR,
                Items.JUNGLE_TRAPDOOR,
                Items.ACACIA_TRAPDOOR,
                Items.DARK_OAK_TRAPDOOR,
                Items.MANGROVE_TRAPDOOR,
                Items.CHERRY_TRAPDOOR,
                Items.PALE_OAK_TRAPDOOR,
                Items.BAMBOO_TRAPDOOR,
                Items.CRIMSON_TRAPDOOR,
                Items.WARPED_TRAPDOOR
        ));
        TRAPDOORS = List.copyOf(list);

        list.clear();
        list.addAll(List.of(
                Items.OAK_WOOD,
                Items.SPRUCE_WOOD,
                Items.BIRCH_WOOD,
                Items.JUNGLE_WOOD,
                Items.ACACIA_WOOD,
                Items.DARK_OAK_WOOD,
                Items.MANGROVE_WOOD,
                Items.CHERRY_WOOD,
                Items.PALE_OAK_WOOD,
                Items.CRIMSON_HYPHAE,
                Items.WARPED_HYPHAE,
                Items.STRIPPED_OAK_WOOD,
                Items.STRIPPED_SPRUCE_WOOD,
                Items.STRIPPED_BIRCH_WOOD,
                Items.STRIPPED_JUNGLE_WOOD,
                Items.STRIPPED_ACACIA_WOOD,
                Items.STRIPPED_DARK_OAK_WOOD,
                Items.STRIPPED_MANGROVE_WOOD,
                Items.STRIPPED_CHERRY_WOOD,
                Items.STRIPPED_PALE_OAK_WOOD,
                Items.STRIPPED_CRIMSON_HYPHAE,
                Items.STRIPPED_WARPED_HYPHAE
        ));
        WOOD = List.copyOf(list);

        list.clear();
        list.addAll(List.of(
                Items.OAK_STAIRS,
                Items.SPRUCE_STAIRS,
                Items.BIRCH_STAIRS,
                Items.JUNGLE_STAIRS,
                Items.ACACIA_STAIRS,
                Items.DARK_OAK_STAIRS,
                Items.MANGROVE_STAIRS,
                Items.CHERRY_STAIRS,
                Items.PALE_OAK_STAIRS,
                Items.BAMBOO_STAIRS,
                Items.CRIMSON_STAIRS,
                Items.WARPED_STAIRS,
                Items.BAMBOO_MOSAIC_STAIRS,
                Items.STONE_STAIRS,
                Items.COBBLESTONE_STAIRS,
                Items.MOSSY_COBBLESTONE_STAIRS,
                Items.STONE_BRICK_STAIRS,
                Items.MOSSY_STONE_BRICK_STAIRS,
                Items.GRANITE_STAIRS,
                Items.POLISHED_GRANITE_STAIRS,
                Items.DIORITE_STAIRS,
                Items.POLISHED_DIORITE_STAIRS,
                Items.ANDESITE_STAIRS,
                Items.POLISHED_ANDESITE_STAIRS,
                Items.COBBLED_DEEPSLATE_STAIRS,
                Items.POLISHED_DEEPSLATE_STAIRS,
                Items.DEEPSLATE_BRICK_STAIRS,
                Items.DEEPSLATE_TILE_STAIRS,
                Items.TUFF_STAIRS,
                Items.POLISHED_TUFF_STAIRS,
                Items.TUFF_BRICK_STAIRS,
                Items.BRICK_STAIRS,
                Items.MUD_BRICK_STAIRS,
                Items.RESIN_BRICK_STAIRS,
                Items.SANDSTONE_STAIRS,
                Items.SMOOTH_SANDSTONE_STAIRS,
                Items.RED_SANDSTONE_STAIRS,
                Items.SMOOTH_RED_SANDSTONE_STAIRS,
                Items.CINNABAR_STAIRS,
                Items.POLISHED_CINNABAR_STAIRS,
                Items.CINNABAR_BRICK_STAIRS,
                Items.SULFUR_STAIRS,
                Items.POLISHED_SULFUR_STAIRS,
                Items.SULFUR_BRICK_STAIRS,
                Items.PRISMARINE_STAIRS,
                Items.PRISMARINE_BRICK_STAIRS,
                Items.DARK_PRISMARINE_STAIRS,
                Items.NETHER_BRICK_STAIRS,
                Items.RED_NETHER_BRICK_STAIRS,
                Items.BLACKSTONE_STAIRS,
                Items.POLISHED_BLACKSTONE_STAIRS,
                Items.POLISHED_BLACKSTONE_BRICK_STAIRS,
                Items.END_STONE_BRICK_STAIRS,
                Items.PURPUR_STAIRS,
                Items.QUARTZ_STAIRS,
                Items.SMOOTH_QUARTZ_STAIRS
        ));
        STAIRS = List.copyOf(list);
    }

    @Override
    public RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                HolderLookup.RegistryLookup<Item> itemLookup = registries.lookupOrThrow(Registries.ITEM);

                /*
                shapeless(RecipeCategory.BUILDING_BLOCKS, Items.DIRT, 1)
                        .requires(Items.COARSE_DIRT)
                        .unlockedBy(getHasName(Items.COARSE_DIRT), has(Items.COARSE_DIRT))
                        .save(output, Identifier.fromNamespaceAndPath(MINECRAFT_ID, "string").toString());

                shaped(RecipeCategory.MISC, Items.CRAFTING_TABLE, 4)
                        .pattern("ll")
                        .pattern("ll")
                        .define('l', ItemTags.LOGS)
                        .group("multi_bench")
                        .unlockedBy(getHasName(Items.CRAFTING_TABLE), has(Items.CRAFTING_TABLE))
                        .save(output, Identifier.fromNamespaceAndPath(MINECRAFT_ID, "string").toString());

                SimpleCookingRecipeBuilder.blasting(
                        Ingredient.of(Items.WATER_BUCKET), // Input
                        RecipeCategory.MISC, // Recipe Category
                        CookingBookCategory.BLOCKS, // Cooking Book Category
                        Items.BUCKET, // Output
                        0.35f, // Experience
                        100 // Cooking Time
                );
                */

                //**** Blast Buff ****//
                SimpleCookingRecipeBuilder.blasting(Ingredient.of(Items.RAW_COPPER_BLOCK), RecipeCategory.MISC,
                        CookingBookCategory.BLOCKS, Items.COPPER_BLOCK.weathering().unaffected(), 6.3f,
                        800)
                        .group("copper_block")
                        .unlockedBy(getHasName(Items.RAW_COPPER_BLOCK), has(Items.RAW_COPPER_BLOCK))
                        .save(output, Identifier.fromNamespaceAndPath(BLAST_BUFF_ID,
                                "copper_block_from_blasting_raw_copper_block").toString());

                SimpleCookingRecipeBuilder.blasting(Ingredient.of(Items.RAW_GOLD_BLOCK), RecipeCategory.MISC,
                                CookingBookCategory.BLOCKS, Items.GOLD_BLOCK, 6.3f, 800)
                        .group("gold_block")
                        .unlockedBy(getHasName(Items.RAW_GOLD_BLOCK), has(Items.RAW_GOLD_BLOCK))
                        .save(output, Identifier.fromNamespaceAndPath(BLAST_BUFF_ID,
                                "gold_block_from_blasting_raw_gold_block").toString());

                SimpleCookingRecipeBuilder.blasting(Ingredient.of(Items.RAW_IRON_BLOCK), RecipeCategory.MISC,
                                CookingBookCategory.BLOCKS, Items.IRON_BLOCK, 6.3f, 800)
                        .group("iron_block")
                        .unlockedBy(getHasName(Items.RAW_IRON_BLOCK), has(Items.RAW_IRON_BLOCK))
                        .save(output, Identifier.fromNamespaceAndPath(BLAST_BUFF_ID,
                                "iron_block_from_blasting_raw_iron_block").toString());

                SimpleCookingRecipeBuilder.blasting(Ingredient.of(Items.SAND), RecipeCategory.MISC,
                                CookingBookCategory.BLOCKS, Items.GLASS, 0.1f, 100)
                        .group("glass_block")
                        .unlockedBy(getHasName(Items.SAND), has(Items.SAND))
                        .save(output, Identifier.fromNamespaceAndPath(BLAST_BUFF_ID,
                                "glass_from_blasting_sand").toString());

                //**** DROPPER TO DISPENSER ****//
                shapeless(RecipeCategory.REDSTONE, Items.DISPENSER)
                        .requires(Items.DROPPER)
                        .requires(Items.BOW)
                        .group("dispenser")
                        .unlockedBy(getHasName(Items.DROPPER), has(Items.DROPPER))
                        .unlockedBy(getHasName(Items.DISPENSER), has(Items.DISPENSER))
                        .unlockedBy(getHasName(Items.BOW), has(Items.BOW))
                        .save(output, Identifier.fromNamespaceAndPath(DISPENSER_ID,
                                "dispenser_dropper").toString());

                shaped(RecipeCategory.REDSTONE, Items.DISPENSER)
                        .pattern(" WS")
                        .pattern("WDS")
                        .pattern(" WS")
                        .define('S', Items.STRING)
                        .define('W', Items.STICK)
                        .define('D', Items.DROPPER)
                        .group("dispenser")
                        .unlockedBy(getHasName(Items.DROPPER), has(Items.DROPPER))
                        .unlockedBy(getHasName(Items.DISPENSER), has(Items.DISPENSER))
                        .save(output, Identifier.fromNamespaceAndPath(DISPENSER_ID,
                                "dispenser_stackable").toString());

                shaped(RecipeCategory.REDSTONE, Items.DISPENSER)
                        .pattern("SSS")
                        .pattern("SBS")
                        .pattern("SRS")
                        .define('S', Items.COBBLESTONE)
                        .define('B', Items.BOW)
                        .define('R', Items.REDSTONE)
                        .group("dispenser");
            }
        };
    }

    @Override
    public String getName() {
        return "Crafting Refinements Recipes";
    }
}
