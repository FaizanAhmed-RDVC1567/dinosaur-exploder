package com.jvondermarck.dinosaurexploder.model

data class GameOverStats(
    val finalScore: Int,
    val highScore: Int,
    val levelReached: Int,
    val survivedSeconds: Long
) {
    fun formatElapsedTime(): String {
        val minutes: Long = survivedSeconds / 60
        val seconds: Long = survivedSeconds % 60
        return String.format("%dm %02ds", minutes, seconds)
        /*
        * TODO: Check if this will not crash the game under a different locale, since Studio
        * TODO: mentions that using the default Locale will cause bugs
        * */
    }
}