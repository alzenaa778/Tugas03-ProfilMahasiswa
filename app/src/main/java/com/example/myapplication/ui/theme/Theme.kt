package com.example.myapplication.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = Blue40,
    primaryContainer = Blue90,
    secondary = Teal40,
    secondaryContainer = Teal90,
    background = Surface99,
    surface = Surface99,
)

@Composable
fun ProfilAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = AppTypography,
        content = content,
    )
}
