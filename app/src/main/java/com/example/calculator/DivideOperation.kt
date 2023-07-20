package com.example.calculator

class DivideOperation:AbstractOperation() {
   override fun op(a: Int, b: Int): Double = (a / b).toDouble()
}