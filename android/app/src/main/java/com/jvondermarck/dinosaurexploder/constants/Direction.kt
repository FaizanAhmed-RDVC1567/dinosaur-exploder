package com.jvondermarck.dinosaurexploder.constants

import com.almasb.fxgl.core.math.FXGLMath.random
import kotlin.enums.EnumEntries

enum class Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT;

    fun modeDirection(mode: GameMode?): Direction? {
        return if (mode == GameMode.EXPERT) randomDirection() else UP
    }

    fun randomDirection(): Direction {
        val values: EnumEntries<Direction> = entries  // This is recommended over 'values' in Kotlin since v1.9
        val index = random(0, values.size - 1)
        return values[index]
    }
}