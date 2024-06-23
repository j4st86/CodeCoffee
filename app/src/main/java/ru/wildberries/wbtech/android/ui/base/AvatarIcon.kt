package ru.wildberries.wbtech.android.ui.base

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.wildberries.wbtech.android.R
import ru.wildberries.wbtech.android.ui.theme.CodeCoffeeTheme
import ru.wildberries.wbtech.android.ui.theme.NeutralBorderColor
import ru.wildberries.wbtech.android.ui.theme.NeutralSecondaryBGColor

@Composable
fun AvatarRegularIcon(
    image: Int,
    imageSize: Int = 200,
    modifier: Modifier = Modifier

) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .size(imageSize.dp)
            .clip(CircleShape)
            .background(NeutralSecondaryBGColor),
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = "Avatar Regular Icon",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.Center)
                .matchParentSize()
        )
    }
}

@Composable
fun AvatarSmallRoundedIcon(
    image: Int,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = image),
        contentDescription = "Avatar Meet Icon",
        contentScale = ContentScale.Fit,
        modifier = modifier
            .size(48.dp)
            .clip(RoundedCornerShape(16.dp))
    )
}

@Composable
fun AvatarSmallCircledIcon(
    image: Int,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = image),
        contentDescription = "Avatar Regular Small Icon",
        contentScale = ContentScale.Fit,
        modifier = modifier
            .size(50.dp)
            .clip(CircleShape)
    )
}

@Composable
fun AvatarRoundedBorderedIcon(
    index: Int,
    image: Int,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = image),
        contentDescription = "image_${index+1}.",
        contentScale = ContentScale.Fit,
        modifier = Modifier
            .size(48.dp)
            .clip(RoundedCornerShape(16.dp))
            .border(2.dp, NeutralBorderColor, RoundedCornerShape(16.dp))
            .background(color = NeutralSecondaryBGColor)
    )
}

@Preview(showBackground = true)
@Composable
fun rrrrrrr() {
    CodeCoffeeTheme {
        AvatarRegularIcon(R.drawable.ic_avatar, 100)
    }
}