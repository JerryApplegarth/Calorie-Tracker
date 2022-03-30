package com.applecompose.core.domain.model

sealed class ActivityLevel(val name: String) {
	object Low: ActivityLevel("low")
	object Medium: ActivityLevel(name = "medium")
	object High: ActivityLevel(name = "high")
	
	companion object {
		fun fromString(name: String): ActivityLevel {
			return when(name) {
				"low" -> Low
				"medium" -> Medium
				"high" -> High
				else -> Medium
			}
		}
	}
}

