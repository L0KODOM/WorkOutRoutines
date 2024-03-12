package com.lokodom.myworkoutroutines.ui.views

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.lokodom.myworkoutroutines.ui.viewmodel.MainViewmodel

@Composable
fun MainScreen ( viewModel: MainViewmodel = hiltViewModel()){
    var categoriesExpanded by remember{ mutableStateOf(false) }
    var equipmentExpanded by remember{ mutableStateOf(false) }

    Box(modifier = Modifier.fillMaxSize()){
        Column {
            SelectionRow(viewModel,
                {
                    categoriesExpanded = !categoriesExpanded
                    equipmentExpanded = false
                },
                {
                    categoriesExpanded = false
                    equipmentExpanded = !equipmentExpanded
                }
            )
            ExerciseCard(data = viewModel.exerciseState.exercise)
            ExerciseColumn(data = viewModel.exerciseListState.exerciseList)
            if (categoriesExpanded) {
                CategoryColumn(viewmodel = viewModel)
            }
            if (equipmentExpanded){
                EquipmentColumn(viewModel)
            }
        }
    }
}