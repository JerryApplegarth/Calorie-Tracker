package com.applecompose.calorietracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.applecompose.calorietracker.ui.theme.CalorieTrackerTheme
import com.applecompose.onboarding_presentation.welcome.WelcomeScreen

class MainActivity : ComponentActivity() {
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			CalorieTrackerTheme {
				
				WelcomeScreen()
			}
		}
	}
}

