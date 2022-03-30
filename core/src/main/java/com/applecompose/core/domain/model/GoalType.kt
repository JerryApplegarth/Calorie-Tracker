package com.applecompose.core.domain.model

sealed class GoalType(val name: String) {
	object LooseWeight: GoalType("loose_weight")
	object KeepWeight: GoalType(name = "keep_weight")
	object GainWeight: GoalType(name = "gain_weight")
	
	companion object {
		fun fromString(name: String): GoalType {
			return when(name) {
				"loose_weight" -> LooseWeight
				"keep_weight" -> KeepWeight
				"gain_weight" -> GainWeight
				else -> KeepWeight
			}
		}
	}
}
