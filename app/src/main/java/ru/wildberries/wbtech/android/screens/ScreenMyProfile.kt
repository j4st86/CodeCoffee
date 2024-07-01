package ru.wildberries.wbtech.android.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.wildberries.wbtech.android.R
import ru.wildberries.wbtech.android.ui.base.AvatarRegularIcon
import ru.wildberries.wbtech.android.ui.theme.CodeAndCoffeeTheme
import ru.wildberries.wbtech.android.ui.theme.CodeCoffeeTheme

@Composable
fun ScreenMyProfile() {
    Column(
        Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AvatarRegularIcon(
            image = R.drawable.ic_ttttt,
            modifier = Modifier
                .padding(top = 46.dp)/////?/////
        )
        Text(
            text = "Иван Иванов",
            style = CodeAndCoffeeTheme.typography.subheading1,
            color = CodeAndCoffeeTheme.colors.neutralActiveColor,
            modifier = Modifier.padding(top = 20.dp)
        )
        Text(
            text = "+7 999 999-99-99",
            style = CodeAndCoffeeTheme.typography.bodyText1,
            color = CodeAndCoffeeTheme.colors.neutralDisabledColor,
            modifier = Modifier.padding(top = 4.dp)
        )
        Row {

        }
    }
}



@Preview(showBackground = true)
@Composable
fun ggggggy() {
    CodeCoffeeTheme {
        ScreenMyProfile()
    }
}