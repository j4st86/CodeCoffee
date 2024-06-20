package ru.wildberries.wbtech.android.ui.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.wildberries.wbtech.android.R
import ru.wildberries.wbtech.android.ui.moleculas.CommunityView
import ru.wildberries.wbtech.android.ui.theme.CodeCoffeeTheme
import ru.wildberries.wbtech.android.ui.theme.NoAvatarBackgroundColor

@Composable
fun AvatarRegularIcon(
    image: Int,
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .size(200.dp)
            .clip(CircleShape)
            .background(NoAvatarBackgroundColor)
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = "Avatar Regular Icon"
        )
    }
}

@Composable
fun AvatarMeetingImage(
    image: Int,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = image),
        contentDescription = "Avatar Meet Icon",
        modifier = modifier
            .height(48.dp)
            .clip(RoundedCornerShape(16.dp))
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CodeCoffeeTheme {
        AvatarMeetingImage(image = R.drawable.ic_avatar_meeting)
    }
}