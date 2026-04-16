package com.example.deli

import android.R.attr.text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign

@Composable
fun ProfileInfo(innerPadding: PaddingValues, onBack: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding), // Тот самый отступ
    ) {
        Text(
            text = "Профиль",
            modifier = Modifier.align(Alignment.TopCenter)
        )

        Button(
            onClick = { onBack() },
            modifier = Modifier.align(Alignment.BottomCenter)
        ) {
            Text("Назад")
        }

    }
}