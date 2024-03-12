package com.lokodom.myworkoutroutines.data.repository

import com.lokodom.myworkoutroutines.data.network.WorkOutApi
import com.lokodom.myworkoutroutines.domain.model.Exercise
import com.lokodom.myworkoutroutines.domain.model.FullExerciseInfo
import javax.inject.Inject

class WorkOutRepositoryImp @Inject constructor(
    private val workOutApi : WorkOutApi
): WorkOutRepository {

    override suspend fun getExercise(id: Int): FullExerciseInfo {
        val exercise = workOutApi.getExercise(id)

        return FullExerciseInfo(
            exercise.id, exercise.category, exercise.muscles,
            exercise.musclesSecondary, exercise.equipment, exercise.images,
            exercise.exercises?.filter { it.language == 2 }
        )
    }

    override suspend fun getExerciseList(): List<FullExerciseInfo> {
        val results = workOutApi.getExerciseList().results
        val listSize = results.size

        val finalList = mutableListOf<FullExerciseInfo>()

        for(i in 0 until listSize){
            val id = results[i].id
            val category = results[i].category
            val muscles = results[i].muscles
            val musclesSecondary = results[i].musclesSecondary
            val equipment = results[i].equipment
            val images = results[i].images
            val exercises = results[i].exercises
            val exercise = FullExerciseInfo(id, category, muscles, musclesSecondary, equipment, images, exercises)
            finalList.add(exercise)
        }
        return finalList
    }

    override suspend fun getExerciseNames(): List<Exercise> {
        val results = workOutApi.getExerciseList().results
        val listSize = results.size

        val finalList = mutableListOf<Exercise>()

        for(i in 0 until listSize){
            val exercises = results[i].exercises?.filter { it.language == 2 }

            if (exercises != null){
                val exercise = Exercise(exercises[0].id,exercises[0].name,exercises[0].description,exercises[0].language,)
                finalList.add(exercise)
            }
        }
        return finalList
    }
}