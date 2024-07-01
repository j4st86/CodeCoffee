package ru.wildberries.wbtech.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import ru.wildberries.wbtech.android.navigation.Navigation
import ru.wildberries.wbtech.android.ui.theme.CodeAndCoffeeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodeAndCoffeeTheme {
                Surface(color = CodeAndCoffeeTheme.colors.neutralWhiteColor) {
                    Navigation()
                }
            }
        }
    }
}