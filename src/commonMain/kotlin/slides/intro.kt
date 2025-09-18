package slides

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.expandVertically
import androidx.compose.animation.scaleIn
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import keyboardonlypresentation.generated.resources.Res
import keyboardonlypresentation.generated.resources.intro
import net.kodein.cup.Slide
import net.kodein.cup.speaker.SpeakerNotes
import org.jetbrains.compose.resources.painterResource
import org.kodein.emoji.Emoji
import org.kodein.emoji.activities.event.Sparkles
import org.kodein.emoji.compose.m2.TextWithNotoAnimatedEmoji


val intro by Slide(
    stepCount = 2,
    user = SpeakerNotes(
        """
        - Krótko o temacie
        - Krótko o grafice AI
        - Krótko o CuP
    """
    )
) { step ->
    Image(
        painterResource(Res.drawable.intro),
        contentDescription = "Using mouse hurts",
        modifier = Modifier
            .size(128.dp)
    )

    Text(
        text = "Wyrzuć swoją starą...",
        style = MaterialTheme.typography.h1
    )

    AnimatedVisibility(
        visible = step >= 1,
        enter = scaleIn(spring(Spring.DampingRatioHighBouncy, Spring.StiffnessMediumLow)) + expandVertically(clip = false)
    ) {
        TextWithNotoAnimatedEmoji(
            text = "${Emoji.Sparkles} myszkę przez okno! ${Emoji.Sparkles}",
            style = MaterialTheme.typography.h1,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}
