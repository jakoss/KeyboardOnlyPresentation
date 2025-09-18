package slides

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import keyboardonlypresentation.generated.resources.Res
import keyboardonlypresentation.generated.resources.lazygit
import net.kodein.cup.Slide
import net.kodein.cup.speaker.SpeakerNotes
import org.jetbrains.compose.resources.painterResource

val lazygit by Slide(
    user = SpeakerNotes(
        """
        Jeden z największych przyspieszaczy dla mnie:
        - Diff i commit view
        - Commit view
        - Branches views
        - Help (?)
        - Config with custom scripts (pokazać tworzenie brancha i wydania)
    """.trimIndent()
    )
) {
    Text(
        "LazyGit",
        style = MaterialTheme.typography.h2
    )
    Image(
        painterResource(Res.drawable.lazygit),
        contentDescription = "lazygit",
        modifier = Modifier
            .size(280.dp)
    )
}