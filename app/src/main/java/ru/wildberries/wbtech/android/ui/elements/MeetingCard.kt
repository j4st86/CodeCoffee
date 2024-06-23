package ru.wildberries.wbtech.android.ui.elements

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ru.wildberries.wbtech.android.ui.base.AvatarSmallRoundedIcon
import ru.wildberries.wbtech.android.ui.base.InfoChip
import ru.wildberries.wbtech.android.ui.theme.BodyText1
import ru.wildberries.wbtech.android.ui.theme.Metadata1
import ru.wildberries.wbtech.android.ui.theme.Metadata2
import ru.wildberries.wbtech.android.ui.theme.NeutralActiveColor
import ru.wildberries.wbtech.android.ui.theme.NeutralWeakColor

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun MeetingCard(
    meetingImage: Int,
    meetingName: String,
    //meetingDate: Int, // TODO add time
    meetingLocation: String,
    chipsData: List<String>
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row {
            AvatarSmallRoundedIcon(image = meetingImage, Modifier.padding(4.dp))
            Spacer(modifier = Modifier.size(12.dp))
            Column {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 2.dp)
                ) {
                    Text(
                        text = meetingName,
                        fontFamily = MaterialTheme.typography.BodyText1.fontFamily,
                        fontSize = MaterialTheme.typography.BodyText1.fontSize,
                        color = NeutralActiveColor,
                    )
                    Text(
                        text = "Закончилось",
                        fontFamily = MaterialTheme.typography.Metadata2.fontFamily,
                        fontSize = MaterialTheme.typography.Metadata2.fontSize,
                        color = NeutralWeakColor
                    )
                }
                Text(
                    text = "13.09.2024 - $meetingLocation",   //TODO change to epoch
                    fontFamily = MaterialTheme.typography.Metadata1.fontFamily,
                    fontSize = MaterialTheme.typography.Metadata1.fontSize,
                    color = NeutralWeakColor
                )
                FlowRow(
                    modifier = Modifier.padding(top = 6.dp, bottom = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    chipsData.forEach { chipText ->
                        InfoChip(text = chipText)
                    }
                    InfoChip(text = meetingLocation)
                }
            }
        }
    }
}