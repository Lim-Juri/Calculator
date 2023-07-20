package com.example.calculator

class AddOperation: AbstractOperation() {
  override fun op(a: Int, b: Int): Double = (a + b).toDouble()
}