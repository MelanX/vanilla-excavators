package de.melanx.vanillaexcavators.data;

import de.melanx.morevanillalib.api.BigBreakMaterials;
import de.melanx.vanillaexcavators.items.ExcavatorRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.Tag;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {

    public Recipes(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        int i = 0;
        for (RegistryObject<Item> item : ExcavatorRegistry.ITEMS.getEntries()) {
            BigBreakMaterials hammer = BigBreakMaterials.values()[i];
            Tag<Item> tagIngredient1 = hammer.getTagIngredient1();
            Tag<Item> tagIngredient2 = hammer.getTagIngredient2();
            ShapedRecipeBuilder recipe = createRecipe(item.get(), tagIngredient1, tagIngredient2);
            recipe.build(consumer);
            i++;
        }
    }

    private ShapedRecipeBuilder createRecipe(Item result, Tag<Item> ingredient1, Tag<Item> ingredient2) {
        if (ingredient2 == null) {
            return createRecipe(result, ingredient1);
        } else {
            return ShapedRecipeBuilder.shapedRecipe(result)
                    .key('d', ingredient1)
                    .key('D', ingredient2)
                    .key('s', Items.STICK)
                    .patternLine(" d ")
                    .patternLine("DsD")
                    .patternLine(" s ")
                    .addCriterion("has_material", hasItem(ingredient1));
        }
    }

    private ShapedRecipeBuilder createRecipe(Item result, Tag<Item> ingredient) {
        return ShapedRecipeBuilder.shapedRecipe(result)
                .key('D', ingredient)
                .key('s', Items.STICK)
                .patternLine(" D ")
                .patternLine("DsD")
                .patternLine(" s ")
                .addCriterion("has_material", hasItem(ingredient));
    }
}
