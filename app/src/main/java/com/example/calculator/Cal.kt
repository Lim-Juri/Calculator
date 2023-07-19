package com.example.calculator

import java.lang.Exception

class Cal{
    val addOperation = AddOperation()
    val subtractOperation = SubtractOperation()
    val multiplyOperation = MultiplyOperation()
    val divideOperation = DivideOperation()

    fun add(a:Int, b:Int):Double{
        return addOperation.op(a,b)
    }

    fun sub(a:Int, b:Int):Double{
        return subtractOperation.op(a,b)
    }

    fun mul(a:Int, b:Int):Double{
        return multiplyOperation.op(a,b)
    }

    fun div(a:Int, b:Int):Double{
        return divideOperation.op(a,b)
    }
}