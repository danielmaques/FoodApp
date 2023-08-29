package com.example.foodsapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodsapp.databinding.RecipesRowLayoutBinding
import com.example.foodsapp.models.FoodRecipes
import com.example.foodsapp.models.Result

class RecipesAdapter() : RecyclerView.Adapter<RecipesAdapter.MyViewHolder>() {

    private var recipe = emptyList<Result>()

    class MyViewHolder(private val binding: RecipesRowLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(result: Result) {
            binding.result = result
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): MyViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = RecipesRowLayoutBinding.inflate(layoutInflater, parent, false)
                return MyViewHolder(binding)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipesAdapter.MyViewHolder {
        return MyViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: RecipesAdapter.MyViewHolder, position: Int) {
        val currentResolt = recipe[position]
        holder.bind(currentResolt)
    }

    override fun getItemCount(): Int {
        return recipe.size
    }

    fun setData(newData: FoodRecipes){
        recipe = newData.results
    }

}