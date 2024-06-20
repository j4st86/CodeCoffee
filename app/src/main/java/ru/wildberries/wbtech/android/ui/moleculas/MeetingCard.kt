package ru.wildberries.wbtech.android.ui.moleculas

import androidx.compose.foundation.layout.Arrangement
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
import ru.wildberries.wbtech.android.ui.elements.InfoChip
import ru.wildberries.wbtech.android.ui.theme.BodyText1
import ru.wildberries.wbtech.android.ui.theme.CodeCoffeeTheme
import ru.wildberries.wbtech.android.ui.theme.Metadata1
import ru.wildberries.wbtech.android.ui.theme.TypoSubTitleColor

@Composable
fun MeetingView(
    meetingImage: Int,
    meetingName: String,
    //meetingDate: Int, // TODO add timing epoch
    meetingPlace: String,
    meetingLanguage: String,
    meetingLevel: String
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row {
            AvatarMeetingImage(image = meetingImage, Modifier.padding(4.dp))
            Spacer(modifier = Modifier.size(12.dp))
            Column {
                Text(
                    text = meetingName,
                    fontFamily = MaterialTheme.typography.BodyText1.fontFamily,
                    modifier = Modifier.padding(bottom = 2.dp)
                )
                Text(text = "13.09.2024 - $meetingPlace",   //TODO change to epoch
                    fontFamily = MaterialTheme.typography.Metadata1.fontFamily,
                    color = TypoSubTitleColor)
                Row (modifier = Modifier.padding(top = 6.dp, bottom = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(4.dp)){
                    InfoChip(text = meetingLanguage)
                    InfoChip(text = meetingLevel)
                    InfoChip(text = meetingPlace)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    CodeCoffeeTheme {
        MeetingView(
            R.drawable.ic_avatar_meeting,
            "Developer Meeting",
            "Moscow",
            "Android",
            "Junior"
        )
    }
}