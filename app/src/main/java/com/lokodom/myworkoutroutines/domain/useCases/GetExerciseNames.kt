package com.lokodom.myworkoutroutines.domain.useCases

import android.util.Log
import com.lokodom.myworkoutroutines.data.repository.WorkOutRepository
import com.lokodom.myworkoutroutines.domain.model.Exercise
import javax.inject.Inject

class GetExerciseNames @Inject constructor(
    private val repo: WorkOutRepository
) {

    suspend fun getExerciseNames():List<Exercise>{

        var exerciseList = emptyList<Exercise>()

        try {
            val exercisesByNames = repo.getExerciseNames()
            exerciseList = exercisesByNames

        }catch (e:Exception){
            Log.d("getNames", "${e.message}")
        }
        return exerciseList
    }

}