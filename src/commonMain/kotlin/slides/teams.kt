package slides

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import net.kodein.cup.Slide
import net.kodein.cup.speaker.SpeakerNotes

val teams by Slide(
    user = SpeakerNotes("""
         Pokazać problemy z teamsami i pomarudzić na wielkie korporacje
    """.trimIndent() )
) {
    Text(
        "Why we can't have nice things",
        style = MaterialTheme.typography.h1
    )
}