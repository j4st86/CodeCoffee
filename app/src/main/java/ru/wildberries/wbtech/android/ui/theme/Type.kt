package ru.wildberries.wbtech.android.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import ru.wildberries.wbtech.android.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )

    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

val Typography.Heading1: TextStyle
    get() = TextStyle(
        fontFamily = SFProDisplayBoldFont,
        fontSize = 32.sp
    )
val Typography.Heading2: TextStyle
    get() = TextStyle(
        fontFamily = SFProDisplayBoldFont,
        fontSize = 24.sp
    )
val Typography.Subheading1: TextStyle
    get() = TextStyle(
        fontFamily = SFProDisplaySemiBoldFont,
        fontSize = 18.sp
    )
val Typography.Subheading2: TextStyle
    get() = TextStyle(
        fontFamily = SFProDisplaySemiBoldFont,
        fontSize = 16.sp
    )
val Typography.BodyText1: TextStyle
    get() = TextStyle(
        fontFamily = SFProDisplaySemiBoldFont,
        fontSize = 14.sp
    )
val Typography.BodyText2: TextStyle
    get() = TextStyle(
        fontFamily = SFProDisplayRegularFont,
        fontSize = 14.sp
    )
val Typography.Metadata1: TextStyle
    get() = TextStyle(
        fontFamily = SFProDisplayRegularFont,
        fontSize = 12.sp
    )
val Typography.Metadata2: TextStyle
    get() = TextStyle(
        fontFamily = SFProDisplayRegularFont,
        fontSize = 10.sp
    )
val Typography.Metadata3: TextStyle
    get() = TextStyle(
        fontFamily = SFProDisplaySemiBoldFont,
        fontSize = 10.sp
    )

val SFProDisplayRegularFont =
    FontFamily(Font(R.font.sf_pro_display_regular, FontWeight.Normal))
val SFProDisplaySemiBoldFont =
    FontFamily(Font(R.font.sf_pro_display_semibold, FontWeight.SemiBold))
val SFProDisplayBoldFont =
    FontFamily(Font(R.font.sf_pro_display_bold, FontWeight.Bold))

