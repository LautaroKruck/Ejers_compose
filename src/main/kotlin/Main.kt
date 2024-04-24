import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState


fun main() = application {
    val windowState = rememberWindowState(size = DpSize(500.dp, 500.dp))

    Window(
        onCloseRequest = ::exitApplication,
        title = "Ejemplos Compose",
        state = windowState
    ) {
        ejer3()

    }
}
