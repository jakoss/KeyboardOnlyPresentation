package slides

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import net.kodein.cup.Slide
import net.kodein.cup.speaker.SpeakerNotes

val hardcore by Slide(
    user = SpeakerNotes("""
        NeoVim i Vim motions.
        Pokazać Mouseless, Mouse Naster i Shortcat.
    """.trimIndent() )
) {
    Text(
        "Strefa hardkora",
        style = MaterialTheme.typography.h1
    )
}