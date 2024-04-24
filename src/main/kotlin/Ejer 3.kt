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
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
fun ejer3() {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
            ) {
        repeat(4) { num ->
            Box(
                modifier = Modifier
                    .background(getColor(num))
                    .padding(70.dp)

            ) {
                Text(
                    text = "Ejemplo ${num + 1}",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(16.dp)
                )
            }
        }
    }
}

private fun getColor(num: Int): Color {
    return when (num) {
        0 -> Color.Red
        1 -> Color.Gray
        2 -> Color.Cyan
        3 -> Color.Green
        else -> Color.White
    }
}

fun main() = application {
    val windowState = rememberWindowState(size = DpSize(500.dp, 800.dp))

    Window(
        onCloseRequest = ::exitApplication,
        title = "Ejemplos Compose",
        state = windowState
    ) {
        ejer3()

    }
}