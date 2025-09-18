package slides

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import keyboardonlypresentation.generated.resources.Res
import keyboardonlypresentation.generated.resources.raycast
import net.kodein.cup.Slide
import net.kodein.cup.speaker.SpeakerNotes
import org.jetbrains.compose.resources.painterResource

val raycast by Slide(
    user = SpeakerNotes(
        """
        Krótko o tym że ten tool to był mój "tigger" do eksperymentowania z flow keyboard-first.
        
        Do pokazania:
        - App launcher + hyperkey + appswitching
        - Extensions (przykład HomeAssistant) - pokazać store
        - Quicklinks
        - Snippets
        - Window management
        - AI features
        - Notes
        - Clipboard history	
        
        Windows:
        - Raycast beta (ktoś chce inva?)
        - PowerToys Command Palette
        
        Polecić kanał youtube
    """.trimIndent()
    )
) {
    Image(
        painterResource(Res.drawable.raycast),
        contentDescription = "Raycast",
        modifier = Modifier
            .size(400.dp)
    )
}