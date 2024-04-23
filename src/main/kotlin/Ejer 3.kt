import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Columna() {
    Column(modifier = Modifier.fillMaxSize()) {
        repeat(4) { index ->
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(getColor(index))
            )
            Text(
                text = "Ejemplo ${index + 1}",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(16.dp)
            )
        }
    }
}

private fun getColor(index: Int): Color {
    return when (index) {
        0 -> Color.Red
        1 -> Color.Gray
        2 -> Color.Cyan
        3 -> Color.Green
        else -> Color.Transparent
    }
}