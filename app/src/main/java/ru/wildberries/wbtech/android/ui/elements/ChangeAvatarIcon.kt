package ru.wildberries.wbtech.android.ui.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.wildberries.wbtech.android.R
import ru.wildberries.wbtech.android.ui.base.AvatarRegularIcon
import ru.wildberries.wbtech.android.ui.theme.CodeCoffeeTheme

@Composable
fun ChangeAvatarIcon() {
    val standardImage: Int = R.drawable.ic_avatar
    Box {
        AvatarRegularIcon(image = standardImage, 100)
        IconButton(
            onClick = {},
            modifier = Modifier
                .clip(CircleShape)
                .background(White)
                .align(Alignment.BottomEnd)
                .size(24.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_plus_icon),
                contentDescription = "Plus Icon"
            )
        }
    }
}