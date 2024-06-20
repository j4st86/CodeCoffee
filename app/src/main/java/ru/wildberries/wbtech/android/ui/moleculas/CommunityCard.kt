package ru.wildberries.wbtech.android.ui.moleculas

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.wildberries.wbtech.android.R
import ru.wildberries.wbtech.android.ui.elements.AvatarMeetingImage
import ru.wildberries.wbtech.android.ui.theme.BodyText1
import ru.wildberries.wbtech.android.ui.theme.CodeCoffeeTheme
import ru.wildberries.wbtech.android.ui.theme.Metadata1
import ru.wildberries.wbtech.android.ui.theme.TypoSubTitleColor

@Composable
fun CommunityView(
    communityName: String,
    communityCount: Int,
    communityImage: Int
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp)
    ) {
        Row {
            AvatarMeetingImage(image = communityImage, Modifier.padding(4.dp))
            Spacer(modifier = Modifier.size(12.dp))
            Column {
                Text(
                    text = communityName,
                    fontFamily = MaterialTheme.typography.BodyText1.fontFamily
                )
                Text(text = "$communityCount человек",
                    fontFamily = MaterialTheme.typography.Metadata1.fontFamily,
                    color = TypoSubTitleColor)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CodeCoffeeTheme {
        CommunityView("Designa", 10000, R.drawable.ic_avatar_meeting)
    }
}