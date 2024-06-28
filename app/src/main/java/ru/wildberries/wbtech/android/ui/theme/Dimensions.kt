package ru.wildberries.wbtech.android.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class AppDimensions(
    val padding1: Dp
)

val CodeCoffeeDimensions = AppDimensions(
    padding1 = 8.dp
)

val LocalSizeSystem = staticCompositionLocalOf {
    CodeCoffeeDimensions
}