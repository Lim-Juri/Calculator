package com.example.calculator

import java.lang.Exception

class Cal:AbstractOperation() {
    lateinit var operation: AbstractOperation
    fun oper(operation: AbstractOperation){
        this.operation = operation
    }

    override fun op(a: Int, b: Int): Double {
        return operation.op(a,b)
    }

}
