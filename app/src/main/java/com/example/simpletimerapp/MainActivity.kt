package com.example.simpletimerapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.simpletimerapp.ui.theme.SimpleTimerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            SimpleTimerAppTheme {
                Scaffold { innerPadding ->
                    MainScreen(
                        modifier = Modifier.padding(innerPadding),
                        onSignUpClick = {
                            val intent = Intent(this, SignUpActivity::class.java)
                            startActivity(intent)
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier, onSignUpClick: () -> Unit) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Welcome to the App",
            style = MaterialTheme.typography.headlineLarge
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = onSignUpClick) {
            Text("Go to Sign Up")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    SimpleTimerAppTheme {
        MainScreen(onSignUpClick = {})
    }
}
