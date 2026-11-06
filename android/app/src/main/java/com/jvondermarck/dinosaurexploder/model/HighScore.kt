package com.jvondermarck.dinosaurexploder.model

import com.jvondermarck.dinosaurexploder.constants.GameMode
import java.io.Serializable

class HighScore(scores: Map<String, Int> = emptyMap()) : Serializable{

    // TODO: ADD COMMENT HERE ABOUT MUTABLEMAP SINCE KOTLIN'S 'Map' IS NOT CHANGEABLE ONCE WRITTEN.
    private val highScores: MutableMap<String, Int> = HashMap(scores)

    // TODO: EXPLAIN THE 'init' BLOCK AND WHAT IT DOES
    init {
        highScores.putIfAbsent(GameMode.NORMAL.name, 0)
        highScores.putIfAbsent(GameMode.EXPERT.name, 0)
    }

    fun getHigh(mode: String): Int {
        return highScores.getOrDefault(mode, 0)
    }

    fun getHigh(): Int {
        // TODO: EXPLAIN HOW THE LONG JAVA LINE ABOUT GETTING HIGH SCORES FROM THE PRIVATE VALUE
        // TODO: IS MUCH SIMPLER IN KOTLIN
        return highScores.values.maxOrNull() ?: 0
    }

    fun setHigh(mode: String, score: Int) {
        // TODO: EXPLAIN IN SHORT THE CLEAN KOTLIN SYNTAX FOR PUTTING NEW DATA INTO A MUTABLE MAP
        highScores[mode] = score
    }

    fun getAllScores(): Map<String, Int> {
        return HashMap(highScores)
    }
}