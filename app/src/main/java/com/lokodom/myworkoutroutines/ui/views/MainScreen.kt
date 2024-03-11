package com.lokodom.myworkoutroutines.ui.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.lokodom.myworkoutroutines.ui.viewmodel.MainViewmodel

@Composable
fun MainScreen ( viewModel: MainViewmodel = hiltViewModel()){

    Box(modifier = Modifier.fillMaxSize()){
        Column {
            ExerciseColumn(data = viewModel.exerciseListState.exerciseList)
            CategoryColumn(viewmodel = viewModel)
        }
    }
}