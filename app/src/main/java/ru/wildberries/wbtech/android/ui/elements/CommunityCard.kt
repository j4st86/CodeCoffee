package ru.wildberries.wbtech.android.ui.elements

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
import androidx.compose.ui.unit.dp
import ru.wildberries.wbtech.android.ui.base.AvatarSmallRoundedIcon
import ru.wildberries.wbtech.android.ui.theme.BodyText1
import ru.wildberries.wbtech.android.ui.theme.Metadata1
import ru.wildberries.wbtech.android.ui.theme.NeutralActiveColor
import ru.wildberries.wbtech.android.ui.theme.NeutralWeakColor

@Composable
fun CommunityCard(
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
            AvatarSmallRoundedIcon(image = communityImage, Modifier.padding(4.dp))
            Spacer(modifier = Modifier.size(12.dp))
            Column {
                Text(
                    text = communityName,
                    fontFamily = MaterialTheme.typography.BodyText1.fontFamily,
                    fontSize = MaterialTheme.typography.BodyText1.fontSize,
                    color = NeutralActiveColor
                )
                Text(text = "$communityCount человек",
                    fontFamily = MaterialTheme.typography.Metadata1.fontFamily,
                    fontSize = MaterialTheme.typography.Metadata1.fontSize,
                    color = NeutralWeakColor)
            }
        }
    }
}