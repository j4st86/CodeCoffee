package ru.wildberries.wbtech.android.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

)

@Composable
fun CodeCoffeeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

@Composable
fun CodeAndCoffeeTheme(
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalColorScheme provides CodeCoffeeLightColorScheme,
        LocalTypography provides CodeAndCoffeeTypography,
        LocalSizeSystem provides CodeCoffeeDimensions
    ) {
        MaterialTheme(
            content = content
        )
    }
}

object CodeAndCoffeeTheme {
    val colors: AppColorScheme
        @Composable get() = LocalColorScheme.current
    val typography: AppTypography
        @Composable get() = LocalTypography.current
    val dimensions: AppDimensions
        @Composable get() = LocalSizeSystem.current
}