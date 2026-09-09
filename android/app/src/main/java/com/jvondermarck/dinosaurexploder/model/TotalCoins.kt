package com.jvondermarck.dinosaurexploder.model

import java.io.Serializable

class TotalCoins(private var total: Int = 0) : Serializable {
    /*
    * The syntax above handles both type of Java constructor calls:
    *
    * a) where `total` is not specified, e.g.: TotalCoins(),
    *    in which case the default value of 0 is used.
    *
    * b) where a value for `total` is specified, e.g.: TotalCoins(125),
    *    in which case the specified value is used instead.
    *
    * In summary, it simplifies lots of Java boilerplate code down to a single line,
    * while still keeping the code readable.
    * */
    fun getTotal(): Int {
        return total
    }

    fun setTotal(total: Int) {
        this.total = total
    }
}