package fire_horse27.craftingrefinements.datagen;

import net.minecraft.data.recipes.BrewingProvider;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;

public class ModBrewingProvider extends BrewingProvider {
    public ModBrewingProvider(RecipeOutput output) {
        super(output);
    }

    @Override
    protected void addContainers() {
        this.addContainer(Items.LINGERING_POTION);
        this.addContainer(Items.POTION);
        this.addContainer(Items.SPLASH_POTION);
    }

    @Override
    protected void addContainerTransformations() {
    }

    @Override
    protected void buildMixes() {
        buildMix(Potions.AWKWARD, Items.TURTLE_SCUTE, Potions.TURTLE_MASTER);
        buildStartMix(Items.SLIME_BALL, Potions.OOZING);
        buildStartMix(Items.FLINT, Potions.INFESTED);
    }
}
