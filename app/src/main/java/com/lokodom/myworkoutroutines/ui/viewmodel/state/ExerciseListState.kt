package com.lokodom.myworkoutroutines.ui.viewmodel.state

import com.lokodom.myworkoutroutines.domain.model.FullExerciseInfo

data class ExerciseListState (
    val exerciseList : List<FullExerciseInfo>? = null
)