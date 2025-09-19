package slides

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import keyboardonlypresentation.generated.resources.Res
import keyboardonlypresentation.generated.resources.qrcode
import net.kodein.cup.Slide
import net.kodein.cup.speaker.SpeakerNotes
import org.jetbrains.compose.resources.painterResource

val end by Slide {
    Text(
        "Dziękuję za uwagę",
        style = MaterialTheme.typography.h2
    )
    Image(
        painterResource(Res.drawable.qrcode),
        contentDescription = "QR code with the url to this presentation and links",
        modifier = Modifier
            .size(280.dp)
    )
    Link(text = "Link do materiałów", url = "https://github.com/jakoss/KeyboardOnlyPresentation")
}

@Composable
private fun Link(
    text: String,
    url: String
) {
    val uriHandler = LocalUriHandler.current
    Text(
        text = text,
        color = MaterialTheme.colors.primary,
        textDecoration = TextDecoration.Underline,
        modifier = Modifier
            .pointerHoverIcon(PointerIcon.Hand)
            .clickable {
                uriHandler.openUri(url)
            }
    )

}