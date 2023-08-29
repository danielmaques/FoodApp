package com.example.foodsapp.bindingadepters

import android.widget.TextView
import androidx.databinding.BindingAdapter

class RecipesRowBinding {

    companion object{
        @BindingAdapter("setNumberOfLikes")
        @JvmStatic
        fun setNumberOfLikes(textView: TextView, likes: Int){
            textView.text = likes.toString()
        }

        @BindingAdapter("setNumberTime")
        @JvmStatic
        fun  setNumberTime(textView: TextView, time: Int){
            textView.text = time.toString()
        }
    }

}