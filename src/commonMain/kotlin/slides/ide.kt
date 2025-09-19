package slides

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import keyboardonlypresentation.generated.resources.*
import net.kodein.cup.Slide
import net.kodein.cup.speaker.SpeakerNotes
import org.jetbrains.compose.resources.painterResource

val ide by Slide(
    user = SpeakerNotes(
        """
        Ważne jest to żeby poznać dobrze swoje IDE
        - Zaplanuj skróty wokół swojego często flow, nie musisz znać wszystkiego
        - Rider:
          - Nawigacja po edytorze
          - Cmd + e
          - Double Shift (niemal każde IDE ma swój command palette i jest to jeden z must-know feature)
          - Open terminal
          - Open Sidebar
          - Open bottom navigation
          - Key Promoter X
    """.trimIndent()
    )
) {
    Text(
        "IDE",
        style = MaterialTheme.typography.h2
    )
    Column {
        Row {
            Image(
                painterResource(Res.drawable.vscode),
                contentDescription = "vscode logo",
                modifier = Modifier
                    .size(100.dp)
            )
            Spacer(Modifier.size(16.dp))
            Image(
                painterResource(Res.drawable.visualstudio),
                contentDescription = "Visual Studio logo",
                modifier = Modifier
                    .size(100.dp)
            )
        }
        Spacer(Modifier.size(16.dp))
        Row {
            Image(
                painterResource(Res.drawable.jetbrains),
                contentDescription = "JetBrains logo",
                modifier = Modifier
                    .size(100.dp)
            )
            Spacer(Modifier.size(16.dp))
            Image(
                painterResource(Res.drawable.nvim),
                contentDescription = "NeoVim logo",
                modifier = Modifier
                    .size(100.dp)
            )
        }
    }

}