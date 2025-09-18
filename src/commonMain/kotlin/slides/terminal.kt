package slides

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import keyboardonlypresentation.generated.resources.Res
import keyboardonlypresentation.generated.resources.terminal
import net.kodein.cup.Slide
import net.kodein.cup.speaker.SpeakerNotes
import org.jetbrains.compose.resources.painterResource

val terminal by Slide(
    user = SpeakerNotes(
        """
        Warp, na szybko pokazać:
        - Splity i taby
        - Prompt edit
        - AI features
        - Warp Drive %\
        
        Windows:
        - Warp for Windows (beta)
        - Windows Terminal
    """.trimIndent()
    )
) {
    Text(
        "Terminal (Warp)",
        style = MaterialTheme.typography.h2
    )
    Image(
        painterResource(Res.drawable.terminal),
        contentDescription = "terminal",
        modifier = Modifier
            .size(280.dp)
    )
}