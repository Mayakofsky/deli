package com.example.deli

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MainScreen(innerPadding: PaddingValues,
               onNavigateToEvent: () -> Unit,
               onNavigateToDebtor: () -> Unit,
               onNavigateToProfile: () -> Unit,
               onNavigateToProfileInfo: () -> Unit) {
    Column( modifier = Modifier.padding(paddingValues = innerPadding).fillMaxSize(),
        verticalArrangement= Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(
            onClick = {
                onNavigateToEvent()
            }
        ) {
            Text("Сформировать событие")
        }
        Button(
            onClick = {
                onNavigateToDebtor()
            }
        ) {
            Text("Добавить должника")
        }
        Button(
            onClick = {
                onNavigateToProfileInfo()
            }
        ) {
            Text("Профиль")
        }
        Text("Активные события:")
        Text("Частные должники:")
    }

}