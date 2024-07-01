package ru.wildberries.wbtech.android.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val TypoSubTitleColor = Color(0xFFB4BDC5)


// Neutral Colors
val NeutralBorderColor = Color(0xFFD2D5F9) // Border color use for borders

@Immutable
data class AppColorScheme(
    // Brand Colors
    val brandDarkColor: Color,              // Dark color use for on pressed
    val brandDefaultColor: Color,           // Default color use for button
    val brandDarkModeColor: Color,          // Dark mode color use for Dark mode
    val brandLightColor: Color,             // Light color use for variant
    val brandBGColor: Color,                // BG color use for background
    // Neutral Colors
    val neutralActiveColor: Color,          // Active color use for font
    val neutralDarkColor: Color,            // Dark color use for dark mode
    val neutralBodyColor: Color,            // Body color use text
    val neutralWeakColor: Color,            // Weak color use for secondary text
    val neutralDisabledColor: Color,        //Disabled color use for disabled
    val neutralLineColor: Color,            // Line color use for divider
    val neutralSecondaryBGColor: Color,     // Secondary BG color use for background
    val neutralWhiteColor: Color,           // White color use for background
    val neutralBorderColor: Color,          // Border color use for borders
    // Accent Colors
    val accentDangerColor: Color,           // Danger color use for errors
    val accentWarningColor: Color,          // Warning color use for warnings
    val accentSuccessColor: Color,          // Success color use for success
    val accentSafeColor: Color,             // Safe color use for variant
    //Delete after deleting TypoExample
    val typoSubtitleColor: Color
)

val CodeCoffeeLightColorScheme = AppColorScheme(
    // Brand Colors
    brandDarkColor = Color(0xFF660EC8),
    brandDefaultColor = Color(0xFF9A41FE),
    brandDarkModeColor = Color(0xFF8207E8),
    brandLightColor = Color(0xFFECDAFF),
    brandBGColor = Color(0xFFF5ECFF),
    // Neutral Colors
    neutralActiveColor = Color(0xFF29183B),
    neutralDarkColor = Color(0xFF190E26),
    neutralBodyColor = Color(0xFF1D0835),
    neutralWeakColor = Color(0xFFA4A4A4),
    neutralDisabledColor = Color(0xFFADB5BD),
    neutralLineColor = Color(0xFFEDEDED),
    neutralSecondaryBGColor = Color(0xFFF7F7FC),
    neutralWhiteColor = Color(0xFFFFFFFF),
    neutralBorderColor = Color(0xFFD2D5F9),
    // Accent Colors
    accentDangerColor = Color(0xFFE94242),
    accentWarningColor = Color(0xFFFDCF41),
    accentSuccessColor = Color(0xFF2CC069),
    accentSafeColor = Color(0xFF7BCBCF),
    //Delete after deleting TypoExample
    typoSubtitleColor = Color(0xFFB4BDC5)
)

val CodeCoffeeDarkColorScheme = AppColorScheme(
    // Brand Colors
    brandDarkColor = Color(0xFF660EC8),
    brandDefaultColor = Color(0xFF9A41FE),
    brandDarkModeColor = Color(0xFF8207E8),
    brandLightColor = Color(0xFFECDAFF),
    brandBGColor = Color(0xFFF5ECFF),
    // Neutral Colors
    neutralActiveColor = Color(0xFF29183B),
    neutralDarkColor = Color(0xFF190E26),
    neutralBodyColor = Color(0xFF1D0835),
    neutralWeakColor = Color(0xFFA4A4A4),
    neutralDisabledColor = Color(0xFFADB5BD),
    neutralLineColor = Color(0xFFEDEDED),
    neutralSecondaryBGColor = Color(0xFFF7F7FC),
    neutralWhiteColor = Color(0xFFFFFFFF),
    neutralBorderColor = Color(0xFFD2D5F9),
    // Accent Colors
    accentDangerColor = Color(0xFFE94242),
    accentWarningColor = Color(0xFFFDCF41),
    accentSuccessColor = Color(0xFF2CC069),
    accentSafeColor = Color(0xFF7BCBCF),
    //Delete after deleting TypoExample
    typoSubtitleColor = Color(0xFFB4BDC5)
)

val LocalColorScheme = staticCompositionLocalOf {
    CodeCoffeeLightColorScheme
    CodeCoffeeDarkColorScheme
}