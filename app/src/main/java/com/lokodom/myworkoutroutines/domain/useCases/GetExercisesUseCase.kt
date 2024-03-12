package com.lokodom.myworkoutroutines.domain.useCases

import android.util.Log
import com.lokodom.myworkoutroutines.data.repository.WorkOutRepository
import com.lokodom.myworkoutroutines.domain.model.FullExerciseInfo
import javax.inject.Inject

class GetExercisesUseCase @Inject constructor(
    private val repo: WorkOutRepository
) {
    suspend fun getById(id:Int): FullExerciseInfo{

        var exercise = FullExerciseInfo()

        try {
            exercise = repo.getExercise(id)
        }catch (e:Exception){
            Log.d("getById", "${e.message}")
        }
        return exercise
    }

    suspend fun getByCategory(cat:Int): List<FullExerciseInfo>{

        var exerciseList = emptyList<FullExerciseInfo>()

        try {
            val exercisesByCategory = repo.getExerciseList().filter { it.category!!.id == cat }
            exerciseList = exercisesByCategory

        }catch (e:Exception){
            Log.d("getByCategory", "${e.message}")
        }
        return exerciseList

    }
    suspend fun getByEquipment(id:Int): List<FullExerciseInfo>{

        var exerciseList = emptyList<FullExerciseInfo>()

        try {
            val exercisesByCategory = repo.getExerciseList().filter { it.equipment?.get(0)?.id  == id }
            exerciseList = exercisesByCategory

        }catch (e:Exception){
            Log.d("getByCategory", "${e.message}")
        }
        return exerciseList

    }
}
