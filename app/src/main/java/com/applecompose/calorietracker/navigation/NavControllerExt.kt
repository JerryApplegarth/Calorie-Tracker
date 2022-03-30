package com.applecompose.calorietracker.navigation

import androidx.navigation.NavController
import com.applecompose.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
	this.navigate(event.route)
}