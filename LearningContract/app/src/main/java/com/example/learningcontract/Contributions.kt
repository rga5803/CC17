package com.example.learningcontract

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Contributions {
    @Composable
    fun Content() {
        Column(modifier = Modifier.padding(bottom = 24.dp)) {
            Text(
                text = "1. Contributions",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1A237E),
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = "• Active participation in group discussions and projects\n" +
                        "• Consistent code reviews and sharing knowledge with peers\n" +
                        "• Timely submission of all assigned modules and deliverables",
                fontSize = 15.sp,
                color = Color(0xFF37474F),
                lineHeight = 22.sp
            )
        }
    }
}