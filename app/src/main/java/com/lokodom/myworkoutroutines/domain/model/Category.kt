package com.lokodom.myworkoutroutines.domain.model

import com.lokodom.myworkoutroutines.R

data class Category(
    val id: Int,
    val name: String
)
data class CategoryDisplay(
    val category: Category,
    val image: Int
)

val categoryList :List<CategoryDisplay> = listOf(
    CategoryDisplay(Category(8, "Arms"), R.drawable.arm),
    CategoryDisplay(Category(9, "Legs"),R.drawable.legs),
    CategoryDisplay(Category(10, "Abs"),R.drawable.abs),
    CategoryDisplay(Category(11, "Chest"),R.drawable.chest),
    CategoryDisplay(Category(12, "Back"),R.drawable.back),
    CategoryDisplay(Category(13, "Shoulders"),R.drawable.shoulder),
    CategoryDisplay(Category(14, "Calves"),R.drawable.calves),
    CategoryDisplay(Category(15, "Cardio"),R.drawable.heart)
)
