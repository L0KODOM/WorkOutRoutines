package com.lokodom.myworkoutroutines.ui.views

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import com.lokodom.myworkoutroutines.ui.viewmodel.MainViewmodel

@Composable
fun SelectionRow(viewmodel: MainViewmodel, categories: ()->Unit, equipment: ()-> Unit){

    Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
        ElevatedButton(onClick = { categories()}) {
            Column (horizontalAlignment = Alignment.CenterHorizontally){
                Icon(imageVector = Icons.Filled.Build, contentDescription = null )
                Text(text = "Muscles")
            }
        }
        Spacer(modifier = Modifier.width(10.dp))
        DropdownExercises(viewmodel)
        Spacer(modifier = Modifier.width(10.dp))
        ElevatedButton(onClick = { categories()}) {
            Column (horizontalAlignment = Alignment.CenterHorizontally){
                Icon(imageVector = Icons.Filled.Star, contentDescription = null )
                Text(text = "Equipment")
            }
        }
    }
}

@Composable
fun DropdownExercises(viewmodel: MainViewmodel){

    var expanded by remember { mutableStateOf(false) }
    val suggestions = viewmodel.exerciseNameListState.nameList

    if (suggestions != null){
        DropdownMenu(expanded = expanded,
            onDismissRequest = { /*TODO*/ },
            modifier = Modifier.width(30.dp)
        ) {
            suggestions.forEach { exercise ->
                DropdownMenuItem(text = {
                    Text(text = exercise.name, color = Color.Gray)
                }, onClick = {
                    viewmodel.getExerciseById(exercise.id)
                    expanded = false
                })
            }
        }
    }
}