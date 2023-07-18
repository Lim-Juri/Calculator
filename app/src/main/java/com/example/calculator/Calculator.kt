package com.example.calculator

fun main() {

    println("계산할 숫자를 입력하세요.")
    var a = readLine()!!.toInt()
    println("연산자를 입력하세요.")
    var op = readLine()!!.toString()
    println("다음 숫자를 입력하세요.")
    var b = readLine()!!.toInt()

    var result: Int = 0

    if (op == "+") {
        result = a + b
    } else if (op == "-") {
        result = a - b
    } else if (op == "/") {
        result = a / b
    } else if (op == "*") {
        result = a * b
    } else if (op == "%") {
        result = a % b
    } else {
        println("연산자를 다시 입력해 주세요.")
    }
    println("${a} ${op} ${b} = ${result}")
}