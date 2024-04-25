import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons

import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import androidx.compose.ui.text.input.PasswordVisualTransformation

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Compose for Desktop",
        state = rememberWindowState(width = 300.dp, height = 300.dp)
    ) {
        var usuario by remember { mutableStateOf("") }
        var contrasena by remember { mutableStateOf("") }
        MaterialTheme {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    modifier = Modifier.padding(16.dp)
                ) {
                    OutlinedTextField(
                        value = usuario,
                        onValueChange = { usuario = it },
                        label = { Text("Usuario") }
                    )
                    OutlinedTextField(
                        value = contrasena,
                        onValueChange = { contrasena = it },
                        label = { Text("Contraseña") },
                        visualTransformation = PasswordVisualTransformation()
                    )
                    Button(
                        onClick = {
                            usuario = ""
                            contrasena = ""
                        }
                    ) {
                        Text("Login")
                    }
                }
            }
        }
    }
}


//fun main() = application {
//    Window(
//        onCloseRequest = ::exitApplication,
//        title = "Compose for Desktop",
//        state = rememberWindowState(width = 300.dp, height = 300.dp)
//    ) {
//        var usuario by remember { mutableStateOf("") }
//        var contrasena by remember { mutableStateOf("") }
//        var button = usuario.isNotBlank() && contrasena.isNotBlank()
//
//        MaterialTheme {
//                Column(
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    verticalArrangement = Arrangement.spacedBy(10.dp, alignment = Alignment.CenterVertically),
//                    modifier = Modifier.fillMaxSize()
//                ) {
//
//                    OutlinedTextField(
//                        value = usuario,
//                        onValueChange = { usuario = it },
//                        label = { Text("Usuario") }
//                    )
//
//                    var passVisible by remember { mutableStateOf(false) }
//
//                    OutlinedTextField(
//                        value = contrasena,
//                        onValueChange = { contrasena = it },
//                        label = { Text("Contraseña") },
//                        visualTransformation = if (passVisible) VisualTransformation.None else PasswordVisualTransformation()
//                        trailingIcon = {
//                            IconToggleButton(
//                                    checked = passVisible
//                                    onCheckedChange = {passVisible = it}
//                            ) {
//                              Icon(
//                                  ImageVector = if (passVisible) Icons.Default.VisibilityOff else Icons.Default.Visibility
//                              )
//                            }
//                    )
//                    Button(
//                        onClick = {
//                            usuario = ""
//                            contrasena = ""
//                        }
//                    ) {
//                        Text("Login")
//                    }
//                }
//            }
//        }
//    }
//}

