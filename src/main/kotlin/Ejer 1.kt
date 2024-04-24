import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
fun ejer1() {
    Box(
        modifier = Modifier.fillMaxSize()
        .background(Color.White)


    ) {
        Box(
            modifier = Modifier
                .height(50.dp)
                .width(50.dp)
                .background(Color.Blue)
                .align(Alignment.Center)
        )  {
        }
    }
}

fun main() = application {
    val windowState = rememberWindowState(size = DpSize(500.dp, 800.dp))

    Window(
        onCloseRequest = ::exitApplication,
        title = "Ejemplos Compose",
        state = windowState
    ) {
        ejer1()

    }
}