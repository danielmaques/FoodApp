package com.example.foodsapp.bindingadepters

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import coil.load

class RecipesRowBinding {

    companion object{

        @BindingAdapter("loadImage")
        @JvmStatic
        fun loadImage(imageView: ImageView, imageUrl: String){
            imageView.load(imageUrl){
                crossfade(600)
            }
        }

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