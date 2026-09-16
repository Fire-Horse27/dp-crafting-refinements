package fire_horse27.craftingrefinements.datagen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.ShapelessRecipe;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public final class ShapelessRecipeBuilderWrapper {

    private final RecipeCategory category;
    private final ItemStackTemplate result;
    private final List<Ingredient> ingredients = new ArrayList();
    private final String group;

    public ShapelessRecipeBuilderWrapper(ShapelessRecipeBuilder original) {
        Class<?> clazz = ShapelessRecipeBuilder.class;

        this.category = get(clazz, original, "category");
        this.result = get(clazz, original, "result");
        this.group = get(clazz, original, "group");
    }

    @SuppressWarnings("unchecked")
    private static <T> T get(Class<?> clazz, Object instance, String fieldName) {
        try {
            Field f = clazz.getDeclaredField(fieldName);
            f.setAccessible(true);
            return (T) f.get(instance);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void saveWithoutAdvancement(final RecipeOutput output, final ResourceKey<Recipe<?>> id) {
        ShapelessRecipe recipe = new ShapelessRecipe(RecipeBuilder.createCraftingCommonInfo(true),
                RecipeBuilder.createCraftingBookInfo(this.category, this.group),
                this.result,
                this.ingredients
        );

        output.accept(id, recipe, null);
    }

    public void saveWithoutAdvancement(RecipeOutput output, String id) {
        ResourceKey<Recipe<?>> key =
                ResourceKey.create(Registries.RECIPE, Identifier.parse(id));
        this.saveWithoutAdvancement(output, key);
    }
}

