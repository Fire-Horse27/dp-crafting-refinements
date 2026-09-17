package fire_horse27.craftingrefinements.datagen;

import net.minecraft.core.Holder;
import net.minecraft.data.recipes.BrewingProvider;
import net.minecraft.data.recipes.BrewingRecipeBuilder;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;

public class ModBrewingProvider extends BrewingProvider {
    private final RecipeOutput modOutput;

    public ModBrewingProvider(RecipeOutput output) {
        super(output);
        this.modOutput = output;
    }

    @Override
    protected void addContainers() {
    }

    @Override
    protected void addContainerTransformations() {
    }

    @Override
    protected void buildMixes() {
        buildMix(Potions.AWKWARD, Items.TURTLE_SCUTE, Potions.TURTLE_MASTER, "awkward", "turtle_shell");
        buildMix(Potions.AWKWARD, Items.SLIME_BALL, Potions.OOZING, "awkward", "slime_block");
        buildMix(Potions.AWKWARD, Items.FLINT, Potions.INFESTED, "awkward", "stone");
        buildMix(Potions.WATER, Items.SLIME_BALL, Potions.MUNDANE, "water", "slime_block");
        buildMix(Potions.WATER, Items.FLINT, Potions.MUNDANE, "water", "stone");
    }

    private void buildMix(Holder<Potion> input, Item reagent, Holder<Potion> output, String type, String id) {
        BrewingRecipeBuilder.brewingMix(Items.POTION, input, reagent, output).save(modOutput, "minecraft:brewing/potion_" + type + "_" + id);
        BrewingRecipeBuilder.brewingMix(Items.SPLASH_POTION, input, reagent, output).save(modOutput, "minecraft:brewing/splash_potion_" + type + "_" + id);
        BrewingRecipeBuilder.brewingMix(Items.LINGERING_POTION, input, reagent, output).save(modOutput, "minecraft:brewing/lingering_potion_" + type + "_" + id);
    }
}
