package com.example.calculator

import java.lang.Exception

//레벨3
fun main() {

    val cal = Cal()//"계산기"

    var a = inputMyInfo("a").toString().toInt()

    var op = inputMyInfo("op").toString()

    var b = inputMyInfo("b").toString().toInt()

    var sum = cal.add(a,b)

    var dif = cal.sub(a, b)

    var multi = cal.mul(a, b)

    var divi = cal.div(a, b)

    val message = "계산이 끝났습니다."

    fun end(string: String){
        println("${string}")
    }


        fun inputMyInfo(type: String): Any? {
            return when (type) {
                "a" -> {
                    println("숫자를 입력해주세요.")
                    while (true) {
                        try {
                            var origina: String? = readLine()
                            return origina?.toInt() ?: -1
                        } catch (e: Exception) {
                            println("숫자를 다시 입력해주세요.")
                        }
                    }
                }

                "op" -> {
                    println("연산자를 입력해주세요.")
                    while (true) {
                        try {
                            var originop: String? = readLine()
                            if (originop?.equals("+") == true || originop?.equals("-") == true
                                || originop?.equals("*") == true || originop?.equals("/") == true
                            ) {
                                return originop
                            } else {
                                println("다른 연산자를 입력해주세요.")
                            }
                        } catch (e: Exception) {
                            println("다른 연산자를 입력해주세요.")
                        }
                    }
                }

                "b" -> {
                    println("숫자를 입력해주세요.")
                    while (true) {
                        try {
                            var origina: String? = readLine()
                            return origina?.toInt() ?: -1
                        } catch (e: Exception) {
                            println("숫자를 다시 입력해주세요.")

                        }
                    }
                }

                else -> {
                    return "no"
                }
            }
        }
        if(op=="+") {
            println("${a} + ${b} = ${sum}")
            end(message)
        }
    else if(op=="-") {
            println("${a} - ${b} = ${dif}")
            end(message)
    }
    else if (op=="*") {
            println("${a} * ${b} = ${multi}")
            end(message)
        }
    else{
            println("${a} / ${b} = ${divi}")
            end(message)
    }

}