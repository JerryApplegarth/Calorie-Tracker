package com.applecompose.calorietracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.applecompose.calorietracker.navigation.navigate
import com.applecompose.calorietracker.ui.theme.CalorieTrackerTheme
import com.applecompose.core.navigation.Route
import com.applecompose.onboarding_presentation.welcome.WelcomeScreen

class MainActivity : ComponentActivity() {
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			CalorieTrackerTheme {
				val navController = rememberNavController()
				NavHost(
					navController = navController,
					startDestination = Route.WELCOME) {
					
					composable(Route.WELCOME) {
						WelcomeScreen(onNavigate = navController::navigate)
					
					}
					composable(Route.AGE) {
					
					}
					composable(Route.GENDER) {
					
					}
					composable(Route.HEIGHT) {
					
					}
					composable(Route.WEIGHT) {
					
					}
					composable(Route.NUTRIENT_GOAL) {
					
					}
					composable(Route.GOAL) {
					
					}
					composable(Route.TRACKER_OVERVIEW) {
					
					}
					composable(Route.SEARCH) {
					
					}
					
				}
				
				
			}
		}
	}
}

// Github Token: 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

