package fire_horse27.craftingrefinements.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import org.jspecify.annotations.NonNull;

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
    private static final List<Item> WOODEN_TRAPDOORS;
    private static final List<Item> WOODEN_SLABS;
    private static final List<Item> WOODEN_PRESSURE_PLATES;
    private static final List<Item> WOODEN_BUTTONS;
    private static final List<Item> WOODEN_STAIRS;
    private static final List<Item> WOOD;
    private static final List<TagKey> WOOD_LOGS;
    private static final List<Item> COPPER;
    private static final List<Item> CUT_COPPER;
    private static final List<Item> CUT_COPPER_STAIRS;
    private static final List<Item> COPPER_TRAPDOORS;
    private static final List<Item> LIGHTNING_RODS;
    private static final List<Item> COPPER_BARS;
    private static final List<Item> WOOL;
    private static final List<Item> WOOL_STAIRS;
    private static final List<Item> WOOL_SLABS;
    private static final List<Item> CONCRETE;
    private static final List<Item> CONCRETE_STAIRS;
    private static final List<TagKey> CORALS;
    private static final List<Item> CORAL_BLOCKS;

    private static final String MINECRAFT_ID = "minecraft";
    private static final String BLAST_BUFF_ID = "crblastbuff";
    private static final String DISPENSER_ID = "crdispenser";
    private static final String ROCK_ID = "crrock";
    private static final String STONECUTTER_ID = "crstonecutter";
    private static final String CONSISTENCY_ID = "crconsistency";

    static {
        CORALS = List.of(
                ModItemTagProvider.BRAIN_CORALS,
                ModItemTagProvider.BUBBLE_CORALS,
                ModItemTagProvider.FIRE_CORALS,
                ModItemTagProvider.HORN_CORALS,
                ModItemTagProvider.TUBE_CORALS,
                ModItemTagProvider.DEAD_BRAIN_CORALS,
                ModItemTagProvider.DEAD_BUBBLE_CORALS,
                ModItemTagProvider.DEAD_FIRE_CORALS,
                ModItemTagProvider.DEAD_HORN_CORALS,
                ModItemTagProvider.DEAD_TUBE_CORALS
        );

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
                Items.POPLAR_PLANKS,
                Items.CRIMSON_PLANKS,
                Items.WARPED_PLANKS,
                Items.BAMBOO_PLANKS
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
                Items.POPLAR_LOG,
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
                Items.STRIPPED_POPLAR_LOG,
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
                Items.POPLAR_FENCE_GATE,
                Items.CRIMSON_FENCE_GATE,
                Items.WARPED_FENCE_GATE,
                Items.BAMBOO_FENCE_GATE
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
                Items.POPLAR_TRAPDOOR,
                Items.CRIMSON_TRAPDOOR,
                Items.WARPED_TRAPDOOR,
                Items.BAMBOO_TRAPDOOR
        ));
        WOODEN_TRAPDOORS = List.copyOf(list);

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
                Items.POPLAR_WOOD,
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
                Items.STRIPPED_POPLAR_WOOD,
                Items.STRIPPED_CRIMSON_HYPHAE,
                Items.STRIPPED_WARPED_HYPHAE
        ));
        WOOD = List.copyOf(list);

        WOOD_LOGS = List.of(
                ItemTags.OAK_LOGS,
                ItemTags.SPRUCE_LOGS,
                ItemTags.BIRCH_LOGS,
                ItemTags.JUNGLE_LOGS,
                ItemTags.ACACIA_LOGS,
                ItemTags.DARK_OAK_LOGS,
                ItemTags.MANGROVE_LOGS,
                ItemTags.CHERRY_LOGS,
                ItemTags.PALE_OAK_LOGS,
                ItemTags.POPLAR_LOGS,
                ItemTags.CRIMSON_STEMS,
                ItemTags.WARPED_STEMS
        );

        list.clear();
        list.addAll(List.of(
                Items.OAK_SLAB,
                Items.SPRUCE_SLAB,
                Items.BIRCH_SLAB,
                Items.JUNGLE_SLAB,
                Items.ACACIA_SLAB,
                Items.DARK_OAK_SLAB,
                Items.MANGROVE_SLAB,
                Items.CHERRY_SLAB,
                Items.PALE_OAK_SLAB,
                Items.POPLAR_SLAB,
                Items.CRIMSON_SLAB,
                Items.WARPED_SLAB,
                Items.BAMBOO_SLAB
                ));
        WOODEN_SLABS = List.copyOf(list);

        list.clear();
        list.addAll(List.of(
                Items.OAK_PRESSURE_PLATE,
                Items.SPRUCE_PRESSURE_PLATE,
                Items.BIRCH_PRESSURE_PLATE,
                Items.JUNGLE_PRESSURE_PLATE,
                Items.ACACIA_PRESSURE_PLATE,
                Items.DARK_OAK_PRESSURE_PLATE,
                Items.MANGROVE_PRESSURE_PLATE,
                Items.CHERRY_PRESSURE_PLATE,
                Items.PALE_OAK_PRESSURE_PLATE,
                Items.POPLAR_PRESSURE_PLATE,
                Items.CRIMSON_PRESSURE_PLATE,
                Items.WARPED_PRESSURE_PLATE,
                Items.BAMBOO_PRESSURE_PLATE
        ));
        WOODEN_PRESSURE_PLATES = List.copyOf(list);

        list.clear();
        list.addAll(List.of(
                Items.OAK_BUTTON,
                Items.SPRUCE_BUTTON,
                Items.BIRCH_BUTTON,
                Items.JUNGLE_BUTTON,
                Items.ACACIA_BUTTON,
                Items.DARK_OAK_BUTTON,
                Items.MANGROVE_BUTTON,
                Items.CHERRY_BUTTON,
                Items.PALE_OAK_BUTTON,
                Items.POPLAR_BUTTON,
                Items.CRIMSON_BUTTON,
                Items.WARPED_BUTTON,
                Items.BAMBOO_BUTTON
        ));
        WOODEN_BUTTONS = List.copyOf(list);

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
                Items.POPLAR_STAIRS,
                Items.CRIMSON_STAIRS,
                Items.WARPED_STAIRS,
                Items.BAMBOO_STAIRS
                ));
        WOODEN_STAIRS = List.copyOf(list);

        list.clear();
        list.addAll(List.of(
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

        list.clear();
        list.addAll(List.of(
                Items.BRAIN_CORAL_BLOCK,
                Items.BUBBLE_CORAL_BLOCK,
                Items.FIRE_CORAL_BLOCK,
                Items.HORN_CORAL_BLOCK,
                Items.TUBE_CORAL_BLOCK,
                Items.DEAD_BRAIN_CORAL_BLOCK,
                Items.DEAD_BUBBLE_CORAL_BLOCK,
                Items.DEAD_FIRE_CORAL_BLOCK,
                Items.DEAD_HORN_CORAL_BLOCK,
                Items.DEAD_TUBE_CORAL_BLOCK
        ));
        CORAL_BLOCKS = List.copyOf(list);

        COPPER = Items.COPPER_BLOCK.asList();
        CUT_COPPER = Items.CUT_COPPER.asList();
        CUT_COPPER_STAIRS = Items.CUT_COPPER_STAIRS.asList();
        COPPER_TRAPDOORS = Items.COPPER_TRAPDOOR.asList();
        COPPER_BARS = Items.COPPER_BARS.asList();
        LIGHTNING_RODS = Items.LIGHTNING_ROD.asList();

        WOOL = Items.WOOL.asList();
        WOOL_STAIRS = Items.WOOL_STAIRS.asList();
        WOOL_SLABS = Items.WOOL_SLAB.asList();

        CONCRETE = Items.CONCRETE.asList();
        CONCRETE_STAIRS = Items.CONCRETE_STAIRS.asList();
    }

    @Override
    protected @NonNull RecipeProvider createRecipeProvider(HolderLookup.@NonNull Provider registries,
                                                           @NonNull BootstrapContext<Recipe<?>> recipes,
                                                           @NonNull BootstrapContext<Advancement> advancements) {
        return new RecipeProvider(recipes, advancements) {
            @Override
            public void buildRecipes() {
                HolderLookup.RegistryLookup<Item> itemLookup = registries.lookupOrThrow(Registries.ITEM);
                new ModBrewingProvider(this.output).buildRecipes();

                //**** Blast Buff ****//
                {
                    SimpleCookingRecipeBuilder.blasting(Ingredient.of(Items.RAW_COPPER_BLOCK), RecipeCategory.MISC,
                                    CookingBookCategory.BLOCKS, Items.COPPER_BLOCK.weathering().unaffected(), 6.3f,
                                    1600)
                            .group("copper_block")
                            .unlockedBy(getHasName(Items.RAW_COPPER_BLOCK), has(Items.RAW_COPPER_BLOCK))
                            .save(output, Identifier.fromNamespaceAndPath(BLAST_BUFF_ID,
                                    "copper_block_from_blasting_raw_copper_block").toString());

                    SimpleCookingRecipeBuilder.blasting(Ingredient.of(Items.RAW_GOLD_BLOCK), RecipeCategory.MISC,
                                    CookingBookCategory.BLOCKS, Items.GOLD_BLOCK, 6.3f, 1600)
                            .group("gold_block")
                            .unlockedBy(getHasName(Items.RAW_GOLD_BLOCK), has(Items.RAW_GOLD_BLOCK))
                            .save(output, Identifier.fromNamespaceAndPath(BLAST_BUFF_ID,
                                    "gold_block_from_blasting_raw_gold_block").toString());

                    SimpleCookingRecipeBuilder.blasting(Ingredient.of(Items.RAW_IRON_BLOCK), RecipeCategory.MISC,
                                    CookingBookCategory.BLOCKS, Items.IRON_BLOCK, 6.3f, 1600)
                            .group("iron_block")
                            .unlockedBy(getHasName(Items.RAW_IRON_BLOCK), has(Items.RAW_IRON_BLOCK))
                            .save(output, Identifier.fromNamespaceAndPath(BLAST_BUFF_ID,
                                    "iron_block_from_blasting_raw_iron_block").toString());

                    SimpleCookingRecipeBuilder.blasting(Ingredient.of(itemLookup.getOrThrow(ItemTags.SMELTS_TO_GLASS)), RecipeCategory.MISC,
                                    CookingBookCategory.BLOCKS, Items.GLASS, 0.1f, 200)
                            .group("glass_block")
                            .unlockedBy(getHasName(Items.SAND), has(ItemTags.SMELTS_TO_GLASS))
                            .save(output, Identifier.fromNamespaceAndPath(BLAST_BUFF_ID,
                                    "glass_from_blasting_sand").toString());
                }

                //**** DROPPER DISPENSERS ****//
                {
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

                    new ShapedRecipeBuilderWrapper(
                            shaped(RecipeCategory.REDSTONE, Items.DISPENSER)
                                    .pattern("SSS")
                                    .pattern("SBS")
                                    .pattern("SRS")
                                    .define('S', Items.COBBLESTONE)
                                    .define('B', Items.BOW)
                                    .define('R', Items.REDSTONE)
                                    .group("dispenser")
                    ).saveWithoutAdvancement(output, Identifier.fromNamespaceAndPath(MINECRAFT_ID,
                            "dispenser").toString());
                }

                //**** SIX STAIRS ****//
                {
                    for (int i = 0; i < PLANKS.size(); i++)
                        new ShapedRecipeBuilderWrapper(
                                shaped(RecipeCategory.BUILDING_BLOCKS, WOODEN_STAIRS.get(i), 6)
                                        .pattern("#  ")
                                        .pattern("## ")
                                        .pattern("###")
                                        .define('#', PLANKS.get(i))
                                        .group("wooden_stairs")
                        ).saveWithoutAdvancement(output, WOODEN_STAIRS.get(i).toString());

                    for (int i = 0; i < MATERIALS.size(); i++)
                        new ShapedRecipeBuilderWrapper(
                                shaped(RecipeCategory.BUILDING_BLOCKS, STAIRS.get(i), 6)
                                        .pattern("#  ")
                                        .pattern("## ")
                                        .pattern("###")
                                        .define('#', MATERIALS.get(i))
                        ).saveWithoutAdvancement(output, STAIRS.get(i).toString());

                    for (int i = 0; i < CUT_COPPER.size(); i++)
                        new ShapedRecipeBuilderWrapper(
                                shaped(RecipeCategory.BUILDING_BLOCKS, CUT_COPPER_STAIRS.get(i), 6)
                                        .pattern("#  ")
                                        .pattern("## ")
                                        .pattern("###")
                                        .define('#', CUT_COPPER.get(i))
                                        .group("cut_copper_stairs")
                        ).saveWithoutAdvancement(output, CUT_COPPER_STAIRS.get(i).toString());

                    for (int i = 0; i < WOOL.size(); i++)
                        new ShapedRecipeBuilderWrapper(
                                shaped(RecipeCategory.BUILDING_BLOCKS, WOOL_STAIRS.get(i), 6)
                                        .pattern("#  ")
                                        .pattern("## ")
                                        .pattern("###")
                                        .define('#', WOOL.get(i))
                                        .group("woolen_stairs")
                        ).saveWithoutAdvancement(output, WOOL_STAIRS.get(i).toString());

                    for (int i = 0; i < CONCRETE.size(); i++)
                        new ShapedRecipeBuilderWrapper(
                                shaped(RecipeCategory.BUILDING_BLOCKS, CONCRETE_STAIRS.get(i), 6)
                                        .pattern("#  ")
                                        .pattern("## ")
                                        .pattern("###")
                                        .define('#', CONCRETE.get(i))
                                        .group("concrete_stairs")
                        ).saveWithoutAdvancement(output, CONCRETE_STAIRS.get(i).toString());
                }

                //**** COPPER CONSISTENCY ****//
                {
                    new ShapedRecipeBuilderWrapper(
                            shaped(RecipeCategory.REDSTONE, Items.COPPER_TRAPDOOR.weathering().unaffected(), 2)
                                    .pattern("###")
                                    .pattern("###")
                                    .define('#', Items.COPPER_INGOT)
                    ).saveWithoutAdvancement(output, Items.COPPER_TRAPDOOR.weathering().unaffected().toString());

                    new ShapedRecipeBuilderWrapper(
                            shaped(RecipeCategory.REDSTONE, Items.IRON_TRAPDOOR, 2)
                                    .pattern("###")
                                    .pattern("###")
                                    .define('#', Items.IRON_INGOT)
                    ).saveWithoutAdvancement(output, Items.IRON_TRAPDOOR.toString());

                    new ShapedRecipeBuilderWrapper(
                            shaped(RecipeCategory.DECORATIONS, Items.COPPER_BARS.weathering().unaffected(), 16)
                                    .pattern("# #")
                                    .pattern("# #")
                                    .pattern("# #")
                                    .define('#', Items.COPPER_INGOT)
                    ).saveWithoutAdvancement(output, Items.COPPER_BARS.weathering().unaffected().toString());

                    new ShapedRecipeBuilderWrapper(
                            shaped(RecipeCategory.DECORATIONS, Items.IRON_BARS, 16)
                                    .pattern("# #")
                                    .pattern("# #")
                                    .pattern("# #")
                                    .define('#', Items.IRON_INGOT)
                    ).saveWithoutAdvancement(output, Items.IRON_BARS.toString());

                    new ShapedRecipeBuilderWrapper(
                            shaped(RecipeCategory.REDSTONE, Items.COPPER_DOOR.weathering().unaffected(), 1)
                                    .pattern("##")
                                    .pattern("##")
                                    .pattern("##")
                                    .define('#', Items.COPPER_INGOT)
                    ).saveWithoutAdvancement(output, Items.COPPER_DOOR.weathering().unaffected().toString());

                    new ShapedRecipeBuilderWrapper(
                            shaped(RecipeCategory.REDSTONE, Items.IRON_DOOR, 1)
                                    .pattern("##")
                                    .pattern("##")
                                    .pattern("##")
                                    .define('#', Items.IRON_INGOT)
                    ).saveWithoutAdvancement(output, Items.IRON_DOOR.toString());

                    new ShapedRecipeBuilderWrapper(
                            shaped(RecipeCategory.DECORATIONS, Items.COPPER_CHAIN.weathering().unaffected(), 4)
                                    .pattern("N")
                                    .pattern("I")
                                    .pattern("N")
                                    .define('I', Items.COPPER_INGOT)
                                    .define('N', Items.COPPER_NUGGET)
                    ).saveWithoutAdvancement(output, Items.COPPER_CHAIN.weathering().unaffected().toString());

                    new ShapedRecipeBuilderWrapper(
                            shaped(RecipeCategory.DECORATIONS, Items.IRON_CHAIN, 4)
                                    .pattern("N")
                                    .pattern("I")
                                    .pattern("N")
                                    .define('I', Items.IRON_INGOT)
                                    .define('N', Items.IRON_NUGGET)
                    ).saveWithoutAdvancement(output, Items.IRON_CHAIN.toString());
                }

                //**** WASTELESS WOOD ****//
                {
                    for (int i = 0; i < LOGS.size()/2; i++)
                        new ShapedRecipeBuilderWrapper(
                                shaped(RecipeCategory.BUILDING_BLOCKS, WOOD.get(i), 4)
                                        .pattern("##")
                                        .pattern("##")
                                        .define('#', LOGS.get(i))
                                        .group("bark")
                        ).saveWithoutAdvancement(output, WOOD.get(i).toString());

                    for (int i = LOGS.size()/2; i < LOGS.size(); i++)
                        new ShapedRecipeBuilderWrapper(
                                shaped(RecipeCategory.BUILDING_BLOCKS, WOOD.get(i), 4)
                                        .pattern("##")
                                        .pattern("##")
                                        .define('#', LOGS.get(i))
                                        .group("stripped")
                        ).saveWithoutAdvancement(output, WOOD.get(i).toString());

                    for (int i = 0; i < PLANKS.size(); i++)
                        new ShapedRecipeBuilderWrapper(
                                shaped(RecipeCategory.REDSTONE, GATES.get(i), 2)
                                        .pattern("#W#")
                                        .pattern("#W#")
                                        .define('#', Items.STICK)
                                        .define('W', PLANKS.get(i))
                                        .group("wooden_fence_gate")
                        ).saveWithoutAdvancement(output, GATES.get(i).toString());

                    for (int i = 0; i < PLANKS.size(); i++)
                        new ShapedRecipeBuilderWrapper(
                                shaped(RecipeCategory.REDSTONE, WOODEN_TRAPDOORS.get(i), 6)
                                        .pattern("###")
                                        .pattern("###")
                                        .define('#', PLANKS.get(i))
                                        .group("wooden_trapdoors")
                        ).saveWithoutAdvancement(output, WOODEN_TRAPDOORS.get(i).toString());
                }

                //**** RECIPE REBALANCE ****//
                {
                    new ShapedRecipeBuilderWrapper(
                            shaped(RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_PLANKS, 4)
                                    .pattern("#")
                                    .pattern("#")
                                    .define('#', ItemTags.BAMBOO_BLOCKS)
                    ).saveWithoutAdvancement(output, Items.BAMBOO_PLANKS.toString());

                    shapeless(RecipeCategory.MISC, Items.BAMBOO, 9)
                            .requires(Items.BAMBOO_BLOCK)
                            .unlockedBy(getHasName(Items.BAMBOO_BLOCK), has(Items.BAMBOO_BLOCK))
                            .save(output, Identifier.fromNamespaceAndPath(CONSISTENCY_ID,
                                    "bamboo").toString());

                    new ShapedRecipeBuilderWrapper(
                            shaped(RecipeCategory.DECORATIONS, Items.HONEYCOMB_BLOCK)
                                    .pattern("###")
                                    .pattern("###")
                                    .pattern("###")
                                    .define('#', Items.HONEYCOMB)
                    ).saveWithoutAdvancement(output, Items.HONEYCOMB_BLOCK.toString());

                    shapeless(RecipeCategory.MISC, Items.HONEYCOMB, 9)
                            .requires(Items.HONEYCOMB_BLOCK)
                            .unlockedBy(getHasName(Items.HONEYCOMB_BLOCK), has(Items.HONEYCOMB_BLOCK))
                            .save(output, Identifier.fromNamespaceAndPath(CONSISTENCY_ID,
                                    "honeycomb").toString());

                    new ShapedRecipeBuilderWrapper(
                            shaped(RecipeCategory.REDSTONE, Items.REDSTONE_TORCH, 4)
                                    .pattern("#")
                                    .pattern("X")
                                    .define('#', Items.REDSTONE)
                                    .define('X', Items.STICK)
                    ).saveWithoutAdvancement(output, Items.REDSTONE_TORCH.toString());

                    new ShapedRecipeBuilderWrapper(
                            shaped(RecipeCategory.BUILDING_BLOCKS, Items.POTENT_SULFUR)
                                    .pattern("##")
                                    .pattern("##")
                                    .define('#', Items.SULFUR)
                    ).saveWithoutAdvancement(output, Items.POTENT_SULFUR.toString());

                    new ShapedRecipeBuilderWrapper(
                            shaped(RecipeCategory.BUILDING_BLOCKS, Items.NETHER_WART_BLOCK)
                                    .pattern("##")
                                    .pattern("##")
                                    .define('#', Items.NETHER_WART)
                    ).saveWithoutAdvancement(output, Items.NETHER_WART_BLOCK.toString());

                    new ShapedRecipeBuilderWrapper(
                            shaped(RecipeCategory.BUILDING_BLOCKS, Items.PACKED_ICE)
                                    .pattern("###")
                                    .pattern("###")
                                    .pattern("###")
                                    .define('#', Items.ICE)
                                    .group("packed_ice")
                    ).saveWithoutAdvancement(output, Items.PACKED_ICE.toString());

                    shapeless(RecipeCategory.BUILDING_BLOCKS, Items.PACKED_ICE, 9)
                            .requires(Items.BLUE_ICE)
                            .group("packed_ice")
                            .unlockedBy(getHasName(Items.BLUE_ICE), has(Items.BLUE_ICE))
                            .save(output, Identifier.fromNamespaceAndPath(CONSISTENCY_ID,
                                    "packed_ice").toString());

                    shapeless(RecipeCategory.BUILDING_BLOCKS, Items.ICE, 9)
                            .requires(Items.PACKED_ICE)
                            .group("ice")
                            .unlockedBy(getHasName(Items.PACKED_ICE), has(Items.PACKED_ICE))
                            .save(output, Identifier.fromNamespaceAndPath(CONSISTENCY_ID,
                                    "ice_from_packed_ice").toString());

                    shaped(RecipeCategory.BUILDING_BLOCKS, Items.ICE)
                            .pattern("##")
                            .pattern("##")
                            .define('#', Items.SNOW_BLOCK)
                            .group("ice")
                            .unlockedBy(getHasName(Items.SNOW_BLOCK), has(Items.SNOW_BLOCK))
                            .save(output, Identifier.fromNamespaceAndPath(CONSISTENCY_ID,
                                    "ice_from_snow_blocks").toString());
                }

                //**** ROCK RECIPES ****//
                {
                    shapeless(RecipeCategory.BUILDING_BLOCKS, Items.TUFF, 2)
                            .requires(Items.ANDESITE)
                            .requires(Items.DIORITE)
                            .unlockedBy(getHasName(Items.ANDESITE), has(Items.ANDESITE))
                            .unlockedBy(getHasName(Items.DIORITE), has(Items.DIORITE))
                            .save(output, Identifier.fromNamespaceAndPath(ROCK_ID,
                                    "tuff").toString());

                    shaped(RecipeCategory.BUILDING_BLOCKS, Items.CINNABAR, 2)
                            .pattern("#S")
                            .pattern("S#")
                            .define('#', Items.NETHERRACK)
                            .define('S', Items.SULFUR_SPIKE)
                            .unlockedBy(getHasName(Items.NETHERRACK), has(Items.NETHERRACK))
                            .unlockedBy(getHasName(Items.SULFUR_SPIKE), has(Items.SULFUR_SPIKE))
                            .save(output, Identifier.fromNamespaceAndPath(ROCK_ID,
                                    "cinnabar").toString());

                    new ShapedRecipeBuilderWrapper(
                            shaped(RecipeCategory.BUILDING_BLOCKS, Items.SANDSTONE, 2)
                                    .pattern("##")
                                    .pattern("##")
                                    .define('#', Items.SAND)
                    ).saveWithoutAdvancement(output, Items.SANDSTONE.toString());

                    new ShapedRecipeBuilderWrapper(
                            shaped(RecipeCategory.BUILDING_BLOCKS, Items.RED_SANDSTONE, 2)
                                    .pattern("##")
                                    .pattern("##")
                                    .define('#', Items.RED_SAND)
                    ).saveWithoutAdvancement(output, Items.RED_SANDSTONE.toString());

                    shaped(RecipeCategory.BUILDING_BLOCKS, Items.CALCITE, 2)
                            .pattern("##")
                            .pattern("##")
                            .define('#', ModItemTagProvider.DEAD_CORAL_BLOCKS)
                            .unlockedBy("has_dead_coral_blocks", has(ModItemTagProvider.DEAD_CORAL_BLOCKS))
                            .save(output, Identifier.fromNamespaceAndPath(ROCK_ID,
                                    "calcite").toString());

                    for (int i = 0; i < CORALS.size(); i++)
                            shaped(RecipeCategory.DECORATIONS, CORAL_BLOCKS.get(i))
                                    .pattern("##")
                                    .pattern("##")
                                    .define('#', CORALS.get(i))
                                    .group("coral_blocks")
                                    .unlockedBy("has_corals", has(CORALS.get(i)))
                                    .save(output, Identifier.fromNamespaceAndPath(ROCK_ID,
                                            CORAL_BLOCKS.get(i).toString().substring(10)).toString());
                }

                //**** STONECUTTER SOLUTIONS ****//
                {
                    for (int i = 0; i < PLANKS.size(); i++) {
                        stonecutterCustomResultFromBase(RecipeCategory.BUILDING_BLOCKS, WOODEN_STAIRS.get(i), PLANKS.get(i));
                        stonecutterCustomResultFromBase(RecipeCategory.BUILDING_BLOCKS, WOODEN_SLABS.get(i), PLANKS.get(i), 2);
                        stonecutterCustomResultFromBase(RecipeCategory.REDSTONE, WOODEN_TRAPDOORS.get(i), PLANKS.get(i), 2);
                        stonecutterCustomResultFromBase(RecipeCategory.REDSTONE, WOODEN_PRESSURE_PLATES.get(i), PLANKS.get(i), 2);
                        stonecutterCustomResultFromBase(RecipeCategory.REDSTONE, WOODEN_BUTTONS.get(i), PLANKS.get(i), 4);
                    }

                    for (int i = 0; i < WOOD_LOGS.size(); i++) {
                        stonecutterCustomResultFromBase(RecipeCategory.BUILDING_BLOCKS, PLANKS.get(i), WOOD_LOGS.get(i), 4);
                        stonecutterCustomResultFromBase(RecipeCategory.BUILDING_BLOCKS, WOODEN_STAIRS.get(i), WOOD_LOGS.get(i), 4);
                        stonecutterCustomResultFromBase(RecipeCategory.BUILDING_BLOCKS, WOODEN_SLABS.get(i), WOOD_LOGS.get(i), 8);
                        stonecutterCustomResultFromBase(RecipeCategory.REDSTONE, WOODEN_TRAPDOORS.get(i), WOOD_LOGS.get(i), 8);
                        stonecutterCustomResultFromBase(RecipeCategory.REDSTONE, WOODEN_PRESSURE_PLATES.get(i), WOOD_LOGS.get(i), 8);
                        stonecutterCustomResultFromBase(RecipeCategory.REDSTONE, WOODEN_BUTTONS.get(i), WOOD_LOGS.get(i), 16);
                    }

                    for (int i = 0; i < LOGS.size(); i++) {
                        stonecutterCustomResultFromBase(RecipeCategory.BUILDING_BLOCKS, WOOD.get(i), LOGS.get(i), 1);
                    }

                    stonecutterCustomResultFromBase(RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_PLANKS, ItemTags.BAMBOO_BLOCKS, 2);
                    stonecutterCustomResultFromBase(RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_STAIRS, ItemTags.BAMBOO_BLOCKS, 2);
                    stonecutterCustomResultFromBase(RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_SLAB, ItemTags.BAMBOO_BLOCKS, 4);
                    stonecutterCustomResultFromBase(RecipeCategory.REDSTONE, Items.BAMBOO_TRAPDOOR, ItemTags.BAMBOO_BLOCKS, 4);
                    stonecutterCustomResultFromBase(RecipeCategory.REDSTONE, Items.BAMBOO_PRESSURE_PLATE, ItemTags.BAMBOO_BLOCKS, 4);
                    stonecutterCustomResultFromBase(RecipeCategory.REDSTONE, Items.BAMBOO_BUTTON, ItemTags.BAMBOO_BLOCKS, 8);
                    stonecutterCustomResultFromBase(RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_MOSAIC, ItemTags.BAMBOO_BLOCKS, 2);
                    stonecutterCustomResultFromBase(RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_MOSAIC_STAIRS, ItemTags.BAMBOO_BLOCKS, 2);
                    stonecutterCustomResultFromBase(RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_MOSAIC_SLAB, ItemTags.BAMBOO_BLOCKS, 4);
                    stonecutterCustomResultFromBase(RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_MOSAIC_STAIRS, Items.BAMBOO_MOSAIC);
                    stonecutterCustomResultFromBase(RecipeCategory.BUILDING_BLOCKS, Items.BAMBOO_MOSAIC_SLAB, Items.BAMBOO_MOSAIC, 2);

                    stonecutterCustomResultFromBase(RecipeCategory.REDSTONE, Items.STONE_PRESSURE_PLATE, Items.STONE, 2);
                    stonecutterCustomResultFromBase(RecipeCategory.REDSTONE, Items.STONE_BUTTON, Items.STONE, 4);

                    stonecutterCustomResultFromBase(RecipeCategory.REDSTONE, Items.POLISHED_BLACKSTONE_PRESSURE_PLATE, Items.POLISHED_BLACKSTONE, 2);
                    stonecutterCustomResultFromBase(RecipeCategory.REDSTONE, Items.POLISHED_BLACKSTONE_BUTTON, Items.POLISHED_BLACKSTONE, 4);

                    for (int i = 0; i < COPPER.size(); i++) {
                        stonecutterCustomResultFromBase(RecipeCategory.REDSTONE, COPPER_TRAPDOORS.get(i), COPPER.get(i), 3);
                        stonecutterCustomResultFromBase(RecipeCategory.REDSTONE, COPPER_BARS.get(i), COPPER.get(i), 24);
                        stonecutterCustomResultFromBase(RecipeCategory.REDSTONE, LIGHTNING_RODS.get(i), COPPER.get(i), 3);
                    }

                    for (int i = 0; i < WOOL.size(); i++) {
                        stonecutterCustomResultFromBase(RecipeCategory.BUILDING_BLOCKS, WOOL_STAIRS.get(i), WOOL.get(i));
                        stonecutterCustomResultFromBase(RecipeCategory.BUILDING_BLOCKS, WOOL_SLABS.get(i), WOOL.get(i), 2);
                    }
                }
            }

            public void stonecutterCustomResultFromBase(final RecipeCategory category, final ItemLike result, final ItemLike base, final int count) {
                SingleItemRecipeBuilder builder = SingleItemRecipeBuilder
                        .stonecutting(Ingredient.of(base), category, result, count)
                        .unlockedBy(getHasName(base), this.has(base));
                String recipeId = getConversionRecipeName(result, base) + "_stonecutting";
                builder.save(this.output, STONECUTTER_ID + ":" + recipeId);
            }

            public void stonecutterCustomResultFromBase(final RecipeCategory category, final ItemLike result, final ItemLike base) {
                stonecutterCustomResultFromBase(category, result, base, 1);
            }

            public void stonecutterCustomResultFromBase(RecipeCategory category, ItemLike result, TagKey<Item> tag, int count) {
                HolderLookup.RegistryLookup<Item> itemLookup = registries.lookupOrThrow(Registries.ITEM);
                HolderSet<Item> holderSet = itemLookup.getOrThrow(tag);
                Ingredient ingredient = Ingredient.of(holderSet);

                SingleItemRecipeBuilder builder = SingleItemRecipeBuilder
                        .stonecutting(ingredient, category, result, count)
                        .unlockedBy("has_" + tag.location().getPath(), this.has(tag));

                String recipeId = result.asItem().toString().substring(10) + "_from_" + tag.location().getPath() + "_stonecutting";
                builder.save(this.output, STONECUTTER_ID + ":" + recipeId);
            }
        };
    }

    @Override
    protected Identifier getRecipeIdentifier(Identifier identifier) {
        return Identifier.fromNamespaceAndPath(identifier.getNamespace(), identifier.getPath());
    }

    @Override
    public @NonNull String getName() {
        return "Crafting Refinements Recipes";
    }
}
