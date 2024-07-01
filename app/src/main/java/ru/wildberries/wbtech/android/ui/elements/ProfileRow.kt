package ru.wildberries.wbtech.android.ui.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import ru.wildberries.wbtech.android.R
import ru.wildberries.wbtech.android.ui.base.AvatarRegularIcon
import ru.wildberries.wbtech.android.ui.theme.CodeAndCoffeeTheme

@Composable
fun ProfileRow(
    profileImage: Int = R.drawable.ic_profile,
    profileName: String,
    profileNumber: String,
    goToMyProfile: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(66.dp)
            .clickable(onClick = goToMyProfile)
    ) {
        Row(modifier = Modifier.align(Alignment.CenterStart)) {
            AvatarRegularIcon(
                image = profileImage,
                imageSize = 50
            )
            Spacer(modifier = Modifier.size(20.dp))
            Column {
                Text(
                    text = profileName,
                    style = CodeAndCoffeeTheme.typography.bodyText1,
                    color = CodeAndCoffeeTheme.colors.neutralActiveColor,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .height(24.dp)
                )
                Text(
                    text = profileNumber,
                    style = CodeAndCoffeeTheme.typography.metadata1,
                    color = CodeAndCoffeeTheme.colors.neutralWeakColor,
                    modifier = Modifier
                        .height(20.dp)
                )
            }
        }
        Box(Modifier.align(Alignment.CenterEnd)) {
            Image(
                painter = painterResource(id = R.drawable.ic_arrow_right),
                contentDescription = "Right arrow"
            )
        }
    }
}