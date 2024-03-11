package com.lokodom.myworkoutroutines.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lokodom.myworkoutroutines.domain.model.FullExerciseInfo
import com.lokodom.myworkoutroutines.domain.useCases.GetExercisesUseCase
import com.lokodom.myworkoutroutines.ui.viewmodel.state.ExerciseListState
import com.lokodom.myworkoutroutines.ui.viewmodel.state.ExerciseState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewmodel @Inject constructor(
    private val getExercises: GetExercisesUseCase
) : ViewModel(){

    private val _isLoading = MutableStateFlow(false)
    val isLoading = _isLoading.asStateFlow()

    var exerciseState by mutableStateOf(ExerciseState())

    var exerciseListState by mutableStateOf(ExerciseListState())

    fun getExerciseById (id:Int){
        if (!_isLoading.value){
            viewModelScope.launch(Dispatchers.IO) {
                _isLoading.value = true
                exerciseState = exerciseState.copy(exercise = getExercises.getById(id))
                _isLoading.value = false
            }
        }
    }
    fun getExerciseByCategory (cat:Int){
        if (!_isLoading.value){
            viewModelScope.launch(Dispatchers.IO) {
                _isLoading.value = true
                exerciseListState = exerciseListState.copy(exerciseList = getExercises.getByCategory(cat))
                _isLoading.value = false
            }
        }
    }
    fun getExerciseByMuscle (muscle:Int){
        if (!_isLoading.value){
            viewModelScope.launch(Dispatchers.IO) {
                _isLoading.value = true
                exerciseListState = exerciseListState.copy(exerciseList = getExercises.getByMuscle(muscle))
                _isLoading.value = false
            }
        }
    }
}