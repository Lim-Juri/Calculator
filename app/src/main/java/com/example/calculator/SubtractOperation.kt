package com.example.calculator

class SubtractOperation:AbstractOperation() {
    override fun op(a: Int, b: Int): Double = (a - b).toDouble()
}