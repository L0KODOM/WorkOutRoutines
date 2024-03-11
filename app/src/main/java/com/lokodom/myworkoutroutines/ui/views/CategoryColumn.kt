package com.lokodom.myworkoutroutines.ui.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.lokodom.myworkoutroutines.domain.model.categoryList
import com.lokodom.myworkoutroutines.ui.viewmodel.MainViewmodel

@Composable
fun CategoryColumn(viewmodel: MainViewmodel){
    LazyColumn(content = {
        items(categoryList){
            Row (modifier = Modifier.clickable { viewmodel.getExerciseByCategory(it.category.id) }){
                Text(text = it.category.name)
                Spacer(modifier = Modifier.width(10.dp))
                Image(painter = painterResource(id = it.image), contentDescription = null)
            }
        }
    })
}