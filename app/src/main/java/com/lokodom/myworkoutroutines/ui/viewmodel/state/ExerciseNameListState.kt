package com.lokodom.myworkoutroutines.ui.viewmodel.state

import com.lokodom.myworkoutroutines.domain.model.Exercise

data class ExerciseNameListState(
    val nameList: List<Exercise>? = null
)
