package slides

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import net.kodein.cup.Slide
import net.kodein.cup.speaker.SpeakerNotes
import net.kodein.cup.widgets.material.BulletPoints


val agenda by Slide(
    stepCount = 8,
    user = SpeakerNotes(
        """
        - Szybko o agendzie
        - Disclaimer o MacOS i podanych alternatywach dla windowsa
    """
    )
) { step ->
    Text(
        "Agenda",
        style = MaterialTheme.typography.h2
    )
    BulletPoints {
        BulletPoint(visible = step >= 1) {
            Text("Klawiatura")
        }
        BulletPoint(visible = step >= 2) {
            Text("IDE")
        }
        BulletPoint(visible = step >= 3) {
            Text("Raycast")
        }
        BulletPoint(visible = step >= 4) {
            Text("Terminal")
        }
        BulletPoint(visible = step >= 5) {
            Text("LazyGit")
        }
        BulletPoint(visible = step >= 6) {
            Text("Why we can't have nice things")
        }
        BulletPoint(visible = step >= 7) {
            Text("Sekcja dla hardkorów (jak wystarczy czasu)")
        }
    }
}