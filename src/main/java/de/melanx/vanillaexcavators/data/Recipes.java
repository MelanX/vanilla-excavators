package de.melanx.vanillaexcavators.data;

import de.melanx.morevanillalib.api.BigBreakMaterials;
import de.melanx.vanillaexcavators.items.ExcavatorRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.ITag;
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
            BigBreakMaterials excavator = BigBreakMaterials.values()[i];
            ITag.INamedTag<Item> tagIngredient = excavator.getTagIngredient();
            ShapedRecipeBuilder recipe = createRecipe(item.get(), tagIngredient);
            recipe.build(consumer);
            i++;
        }
    }

    private ShapedRecipeBuilder createRecipe(Item result, ITag.INamedTag<Item> ingredient) {
        return ShapedRecipeBuilder.shapedRecipe(result)
                .key('D', ingredient)
                .key('s', Items.STICK)
                .patternLine("D")
                .patternLine("s")
                .patternLine("s")
                .addCriterion("has_material", hasItem(ingredient));
    }
}
