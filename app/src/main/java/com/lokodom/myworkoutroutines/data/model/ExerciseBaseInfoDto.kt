package com.lokodom.myworkoutroutines.data.model

import com.lokodom.myworkoutroutines.domain.model.Category
import com.lokodom.myworkoutroutines.domain.model.Equipment
import com.lokodom.myworkoutroutines.domain.model.Exercise
import com.lokodom.myworkoutroutines.domain.model.Image
import com.lokodom.myworkoutroutines.domain.model.Muscles
import com.lokodom.myworkoutroutines.domain.model.MusclesSecondary
import com.squareup.moshi.Json

data class ExerciseBaseInfoDto(
    val id : Int,
    val category: Category?,
    val muscles: List<Muscles>?,
    @field:Json(name = "muscles_secondary")
    val musclesSecondary: List<MusclesSecondary>?,
    val equipment: List<Equipment>?,
    val images:List<Image>?,
    val exercises: List<Exercise>?

)
