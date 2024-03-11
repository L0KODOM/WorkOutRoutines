package com.lokodom.myworkoutroutines.ui.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.lokodom.myworkoutroutines.domain.model.FullExerciseInfo

@Composable
fun ExerciseCard(data: FullExerciseInfo?){
    if (data != null){
        Card {
            Column {
                if (data.images?.isNotEmpty() == true) {
                    AsyncImage(model = data.images[0].image, contentDescription = null)
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = data.category!!.name)
                Spacer(modifier = Modifier.height(10.dp))
                if (data.exercises?.isNotEmpty() == true) {
                    Text(text = data.exercises[0].name)
                }
                Spacer(modifier = Modifier.height(10.dp))
                if (data.exercises?.isNotEmpty() == true){
                    Text(text = data.exercises[0].description)
                }

                Spacer(modifier = Modifier.height(10.dp))
                if (data.equipment?.isNotEmpty() == true) {
                    Text(text = data.equipment[0].name)
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row {
                    if (data.muscles?.isNotEmpty() == true) {
                        Text(text = data.muscles[0].name)
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    if (data.muscles?.isNotEmpty() == true) {
                        AsyncImage(model = data.muscles[0].image, contentDescription = null)
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
    }
}