package com.mycompany.recipeapp

import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.content.Context
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import kotlinx.android.synthetic.main.row_item.view.*
import com.squareup.picasso.Picasso

class RecipeAdapter(val context: Context, val recipes: List<Hit>) : RecyclerView.Adapter<RecipeAdapter.MyViewHolder>() {

    private val TAG = "RecipeAdapter"
    private val ingList = ArrayList<Float>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = recipes[position]
        /*var listAdapter = ArrayAdapter(context, android.R.layout.simple_list_item_1, ingList)
        holder.ingredients.ingredient_list.adapter = listAdapter*/

        holder.name.text = currentItem.recipe.label
        holder.calories.text = currentItem.recipe.displayCals()
        holder.totalWeight.text = currentItem.recipe.displayWeight()
        holder.servings.text = "${currentItem.recipe.yield} servings"
        /*holder.url.text = currentItem.recipe.url*/
        /*listAdapter.addAll(currentItem.recipe.ingredients[0].weight)*/
        if(currentItem.recipe.ingredients[0].measure.label != null || currentItem.recipe.ingredients[0].measure.label == "") {
            holder.ingredientList.text = currentItem.recipe.ingredients[0].measure.label
        }
        Picasso.get().load(currentItem.recipe.image).into(holder.image)
    }

    override fun getItemCount(): Int {
        return recipes.size
    }

    inner class MyViewHolder (itemView: View): RecyclerView.ViewHolder (itemView)
    {
        val name = itemView.recipe_name
        val calories = itemView.recipe_cals
        val totalWeight = itemView.recipe_weight
        val servings= itemView.recipe_servings
        val ingredientList = itemView.ingredient_recipe
        val image = itemView.rest_image
    }

}
