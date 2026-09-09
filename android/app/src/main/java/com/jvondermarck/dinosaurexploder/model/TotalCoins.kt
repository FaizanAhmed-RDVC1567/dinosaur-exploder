package com.jvondermarck.dinosaurexploder.model

import java.io.Serializable

class TotalCoins(private var total: Int = 0) : Serializable {

    fun getTotal(): Int {
        return total
    }

    fun setTotal(total: Int) {
        this.total = total
    }
}