package com.lokodom.myworkoutroutines.ui.views

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.lokodom.myworkoutroutines.domain.model.FullExerciseInfo

@Composable
fun ExerciseColumn(data:List<FullExerciseInfo>?){
    if(data != null){
        LazyColumn(content = {
            items(data){
                ExerciseCard(data = it)
            }
        })
    }

}