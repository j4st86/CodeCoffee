package ru.wildberries.wbtech.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import ru.wildberries.wbtech.android.screens.TutorialScreen
import ru.wildberries.wbtech.android.ui.base.PrimaryButton
import ru.wildberries.wbtech.android.ui.elements.OverlappingVisitorsRow
import ru.wildberries.wbtech.android.ui.theme.CodeCoffeeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CodeCoffeeTheme {
                PrimaryButton(text = "Button", isEnabled = true)
            }
        }
    }
}