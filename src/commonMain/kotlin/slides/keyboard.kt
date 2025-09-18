package slides

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import keyboardonlypresentation.generated.resources.Res
import keyboardonlypresentation.generated.resources.keyboards
import net.kodein.cup.Slide
import net.kodein.cup.speaker.SpeakerNotes
import org.jetbrains.compose.resources.painterResource

val keyboard by Slide(
    user = SpeakerNotes("""
         Krótko o tym że każdy ma swoje preferencje i warto poeksperymentować żeby znaleźć dla siebie. 
         Prośba o lajki jeżeli ktoś chce pogadać o klawiaturach w osobnym smalltalku
    """.trimIndent() )
) {
    Text(
        "Klawiatura",
        style = MaterialTheme.typography.h2
    )
    Image(
        painterResource(Res.drawable.keyboards),
        contentDescription = "Keyboard types",
        modifier = Modifier
            .size(300.dp)
    )
}