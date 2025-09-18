plugins {
    kotlin("multiplatform") version "2.0.21"
    kotlin("plugin.compose") version "2.0.21"
    id("org.jetbrains.compose") version "1.6.11"
    id("net.kodein.cup") version "1.0.0-Beta-09"
}

cup {
    targetDesktop()
}

kotlin {
    sourceSets.commonMain {
        dependencies {
            // Includes Source Code highlighting & animations.
            implementation(cup.sourceCode)

            // Secondary window with preview & speaker notes.
            implementation(cup.plugin.speakerWindow)

            // Allows to draw over the presentation on the main window.
            // This tool is also part of the Speaker Mode window.
            implementation(cup.plugin.laser)

            // TODO: Select material or material3 (for composables such as Text).
            implementation(compose.material)
            implementation(cup.widgets.material)
//            implementation(compose.material3)
//            implementation(cup.widgets.material3)

            implementation("org.kodein.emoji:emoji-compose-m2:2.1.0")
//            implementation("org.kodein.emoji:emoji-compose-m3:2.0.1")
        }
    }
}
