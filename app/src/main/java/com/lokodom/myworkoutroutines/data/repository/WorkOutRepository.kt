package com.lokodom.myworkoutroutines.data.repository

import com.lokodom.myworkoutroutines.data.model.ExerciseBaseInfoDto
import com.lokodom.myworkoutroutines.domain.model.FullExerciseInfo

interface WorkOutRepository {

    suspend fun getExercise(id: Int): FullExerciseInfo

    suspend fun getExerciseList(): List<FullExerciseInfo>

}