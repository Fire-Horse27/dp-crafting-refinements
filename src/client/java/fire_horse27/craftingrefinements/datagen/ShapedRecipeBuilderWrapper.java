package fire_horse27.craftingrefinements.datagen;

import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.item.crafting.ShapedRecipePattern;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public final class ShapedRecipeBuilderWrapper {

    private final List<String> rows;
    private final Map<Character, Ingredient> key;
    private final RecipeCategory category;
    private final ItemStackTemplate result;
    private final String group;
    private final boolean showNotification;

    public ShapedRecipeBuilderWrapper(ShapedRecipeBuilder original) {
        Class<?> clazz = ShapedRecipeBuilder.class;

        this.rows = get(clazz, original, "rows");
        this.key = get(clazz, original, "key");
        this.category = get(clazz, original, "category");
        this.result = get(clazz, original, "result");
        this.group = get(clazz, original, "group");
        this.showNotification = get(clazz, original, "showNotification");
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

    public void saveWithoutAdvancement(RecipeOutput output, ResourceKey<Recipe<?>> id) {
        ShapedRecipePattern pattern = ShapedRecipePattern.of(this.key, this.rows);
        ShapedRecipe recipe = new ShapedRecipe(
                RecipeBuilder.createCraftingCommonInfo(this.showNotification),
                RecipeBuilder.createCraftingBookInfo(this.category, this.group),
                pattern,
                this.result
        );

        output.accept(id, recipe, null);
    }

    public void saveWithoutAdvancement(RecipeOutput output, String id) {
        ResourceKey<Recipe<?>> key =
                ResourceKey.create(Registries.RECIPE, Identifier.parse(id));
        this.saveWithoutAdvancement(output, key);
    }
}

