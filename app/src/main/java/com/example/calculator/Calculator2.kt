package com.example.calculator

import java.lang.Exception

//레벨3&4
fun main() {

    val calculator = Cal()
    val addOperation = AddOperation()
    val subtractOperation = SubtractOperation()
    val multiplyOperation = MultiplyOperation()
    val divideOperation = DivideOperation()


    var a = inputMyInfo1("a").toString().toInt()
    var op = inputMyInfo1("op").toString()
    var b = inputMyInfo1("b").toString().toInt()


    calculator.oper(addOperation)
    var sum = calculator.op(a, b)
    calculator.oper(subtractOperation)
    var suv = calculator.op(a, b)
    calculator.oper(multiplyOperation)
    var mul = calculator.op(a, b)
    calculator.oper(divideOperation)
    var divi = calculator.op(a, b)

    var message = "계산이 끝났습니다."


    if (op=="+"){
        println("$a + $b = $sum")
        end(message)
    }
    else if (op=="-"){
        println("$a - $b = $suv")
        end(message)
    }
    else if (op=="*"){
        println("$a * $b = $mul")
        end(message)
    }
    else if (op=="/"){
        println("$a / $b = $divi")
        end(message)
    }
}

fun end(string: String){
    println("${string}")
}

fun inputMyInfo1(type:String):Any? {

    return when(type) {
        "a" -> {
            println("숫자를 입력해주세요.")
            while (true) {
                try {
                    var origina:String? = readLine()
                    return origina?.toInt() ?: -1
                } catch (e:Exception) {
                    println("숫자를 다시 입력해주세요.")
                }
            }
        }
        "op" -> {
            println("연산자를 입력해주세요.")
            while (true){
                try {
                    var originop:String? = readLine()
                    if (originop?.equals("+")==true ||originop?.equals("-")==true
                        || originop?.equals("*")==true||originop?.equals("/")==true
                    ){
                        return originop
                    }
                    else {
                        println("다른 연산자를 입력해주세요.")
                    }
                } catch (e:Exception){
                    println("다른 연산자를 입력해주세요.")
                }
            }
        }
        "b" -> {
            println("숫자를 입력해주세요.")
            while (true){
                try {
                    var originb:String? = readLine()
                    return originb?.toInt()?:-1
                } catch (e:Exception){
                    println("숫자를 다시 입력해주세요.")
                }
            }
        }

        else -> {
            return "no"
        }
    }
}
