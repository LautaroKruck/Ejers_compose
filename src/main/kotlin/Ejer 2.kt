import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
fun ejer2() {
    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .size(300.dp, 200.dp)
                .background(Color.Cyan)
                .align(Alignment.Center)
        ) {
            Text(
                text = "Esto es un EJEMPLO del uso de Box",
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(16.dp)
            )
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
        ejer2()

    }
}