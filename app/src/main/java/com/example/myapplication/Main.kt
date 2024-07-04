package com.example.myapplication

import kotlin.math.pow


fun main() {
    val base = 12
    val a = base.toDouble().pow(3.3)
    val h = 6.12e24
    println("12 ** 3.3 = ${"%.2e".format(h)}")
}
