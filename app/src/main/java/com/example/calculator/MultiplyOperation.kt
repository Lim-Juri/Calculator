package com.example.calculator

class MultiplyOperation:AbstractOperation() {
   override fun op(a: Int, b: Int): Double = (a * b).toDouble()
}