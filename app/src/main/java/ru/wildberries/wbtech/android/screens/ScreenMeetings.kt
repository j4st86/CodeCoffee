package ru.wildberries.wbtech.android.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import ru.wildberries.wbtech.android.ui.theme.CodeAndCoffeeTheme

@Composable
fun ScreenMeetings() {
    Column {
        Text(
            text = "Screen Meetings",
            style = CodeAndCoffeeTheme.typography.bodyText1
        )
    }
}