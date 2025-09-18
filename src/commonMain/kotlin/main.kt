import androidx.compose.material.LocalContentColor
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import net.kodein.cup.Presentation
import net.kodein.cup.Slides
import net.kodein.cup.cupApplication
import net.kodein.cup.laser.laser
import net.kodein.cup.speaker.speakerWindow
import net.kodein.cup.widgets.material.cupScaleDown
import org.kodein.emoji.compose.EmojiService
import slides.agenda
import slides.ide
import slides.intro
import slides.keyboard
import slides.lazygit
import slides.raycast
import slides.terminal


fun main() = cupApplication(
    title = "Wyrzuć swoją starą... myszkę przez okno"
) {
    remember {
        // https://github.com/kosi-libs/Emoji.kt?tab=readme-ov-file#initializing-the-emoji-service
        EmojiService.initialize()
    }

    MaterialTheme(
        colors = darkColors(),
        typography = MaterialTheme.typography.cupScaleDown()
    ) {
        Presentation(
            slides = presentationSlides,
            configuration = {
                speakerWindow()
                laser()
            },
            backgroundColor = MaterialTheme.colors.background
        ) { slidesContent ->
            CompositionLocalProvider(
                LocalContentColor provides MaterialTheme.colors.onBackground
            ) {
                slidesContent()
            }
        }
    }
}

val presentationSlides = Slides(
    intro,
    agenda,
    keyboard,
    ide,
    raycast,
    terminal,
    lazygit
)
