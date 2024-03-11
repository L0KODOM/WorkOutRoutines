package com.lokodom.myworkoutroutines.data.network

import com.lokodom.myworkoutroutines.data.model.ExerciseBaseInfoDto
import com.lokodom.myworkoutroutines.data.model.ExerciseListDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WorkOutApi {

    @GET("exercisebaseinfo/{exerciseId}/")
    suspend fun getExercise(
        @Path("exerciseId") id: Int
    ): ExerciseBaseInfoDto

    @GET("exercisebaseinfo/")
    suspend fun getExerciseList(): ExerciseListDto

}