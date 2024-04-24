import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
fun ejer6() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize().align(Alignment.TopCenter)
        ) {
            Box(
                modifier = Modifier
                    .height(300.dp)
                    .border(2.dp, Color.Red)
                    .padding(5.dp)
            ){
            Text(
                text = "Ejemplo 1",
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .height(300.dp)
                    .border(2.dp, Color.Red)
                    .padding(5.dp)
            )}
            Text(
                text = "Ejemplo 1",
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .height(200.dp)
                    .border(2.dp, Color.Blue)
                    .padding(5.dp)
            )
            Text(
                text = "Ejemplo 1",
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .height(100.dp)
                    .border(2.dp, Color.Red)
                    .padding(5.dp)
            )
            Text(
                text = "Ejemplo 1",
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .height(50.dp)
                    .border(2.dp, Color.Blue)
                    .padding(5.dp)
            )
            Box(
                modifier = Modifier
                    .height(300.dp)
                    .fillMaxSize()
                    .background(Color.Magenta)
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
        ejer6()

    }
}
