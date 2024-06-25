package ru.wildberries.wbtech.android.ui.base

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults.outlinedButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.wildberries.wbtech.android.ui.theme.BrandDefaultColor
import ru.wildberries.wbtech.android.ui.theme.CodeCoffeeTheme
import ru.wildberries.wbtech.android.ui.theme.NeutralSecondaryBGColor
import ru.wildberries.wbtech.android.ui.theme.NeutralWhiteColor
import ru.wildberries.wbtech.android.ui.theme.Subheading2

@Composable
fun PrimaryButton(
    text: String,
    isEnabled: Boolean,
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonColors(
            containerColor = BrandDefaultColor,
            contentColor = NeutralWhiteColor,
            disabledContainerColor = BrandDefaultColor.copy(alpha = 0.5f),
            disabledContentColor = NeutralSecondaryBGColor
        ),
        enabled = isEnabled,
        modifier = modifier
    ) {
        Text(
            text = text,
            fontFamily = MaterialTheme.typography.Subheading2.fontFamily,
            fontSize = MaterialTheme.typography.Subheading2.fontSize,
            modifier = modifier.padding(vertical = 12.dp, horizontal = 30.dp)
        )
    }
}

@Composable
fun SecondaryButton(
    text: String,
    isEnabled: Boolean,
    modifier: Modifier = Modifier,
) {
    val borderColor = if (isEnabled) BrandDefaultColor else BrandDefaultColor.copy(alpha = 0.5f)
    OutlinedButton(
        onClick = { /*TODO*/ },
        border = BorderStroke(2.dp, borderColor),
        colors = outlinedButtonColors(
            contentColor = BrandDefaultColor,
            disabledContentColor = BrandDefaultColor.copy(alpha = 0.5f)
        ),
        enabled = isEnabled,
        modifier = modifier
    ) {
        Text(
            text = text,
            fontFamily = MaterialTheme.typography.Subheading2.fontFamily,
            fontSize = MaterialTheme.typography.Subheading2.fontSize,
            modifier = modifier.padding(vertical = 12.dp, horizontal = 30.dp)
        )
    }
}

@Composable
fun GhostButton(
    text: String,
    isEnabled: Boolean,
    modifier: Modifier = Modifier,
) {
    TextButton(
        onClick = { /*TODO*/ },
        colors = outlinedButtonColors(
            contentColor = BrandDefaultColor,
            disabledContentColor = BrandDefaultColor.copy(alpha = 0.5f)
        ),
        enabled = isEnabled,
        modifier = modifier
    ) {
        Text(
            text = text,
            fontFamily = MaterialTheme.typography.Subheading2.fontFamily,
            fontSize = MaterialTheme.typography.Subheading2.fontSize,
            modifier = modifier.padding(vertical = 12.dp, horizontal = 30.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun yyyyy() {
    CodeCoffeeTheme {
        GhostButton("Button", true)
    }
}