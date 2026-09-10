package com.jvondermarck.dinosaurexploder.model

class Settings {
    /*
    * Property names in Kotlin are the getter and setter itself: i.e.: you will see some
    * auto-complete suggestions when you use a property that mention something along the lines of
    * `from getVolume/setVolume`. This means you don't have to explicitly declare a getter or
    * setter function for any class property, unless you have extra logic that needs to run before
    * an assignment or return statement is executed.
    *
    * Kotlin also provides a special keyword called `field` (known as the backing field) to help
    * in scenarios where custom getter and setter logic is needed. Using Java-style code such as:
    *
    * this.volume = setVolume
    *
    * will cause a recursive error due to the aforementioned aspect of Kotlin programming where
    * property names itself create getters and setters under the hood. To fix this, it is mandatory
    * to use the `field` keyword where additional logic is needed, e.g.:
    *
    * get() {
    *   return if (muted) 0.0 else field
    * }
    * set(value) {
    *   field = value.coerceIn(0.0, 1.0)
    * }
    *
    * Lastly, to adhere to the same logic as in the Java-equivalent class of the same name,
    * the special keyword `lateinit` that tells Kotlin that this property shall be initialised
    * only at the time it is actually needed. This keyword can only be applied to `object` types
    * like String, but not primitive types like Double or Boolean, therefore they are made nullable.
    * Nullable (the '?' after the type) allows devs to give objects of the class their proper values
    * at the time of their actual creation instead of using default values. These two states also
    * mean that not checking if the property is null using the 'Elvis' operator (?) will result
    * in a 'NullPointerException'. Hence, any time such properties are accessed, i.e.:
    *
    * if volume?.toInt() == 100:
    *
    * they must be followed with the '?' operator, which tells Kotlin to check for null before
    * attempting to do anything with that property.
    * */
    var volume: Double? = null
    var sfxVolume: Double? = null
    var muted: Boolean? = null
    var sfxMuted: Boolean? = null
    lateinit var language: String
}