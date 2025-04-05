package com.example.kotlintutorialfiles

fun main()
{
    print("enter number one : ")
    var num1=readLine()!!.toInt()
    print("enter number two : ")
    var num2=readLine()!!.toInt()

    print("enter the type operator (+ * / - % ) : ")
    var op=readLine().toString()
    when (op) {
        "+" -> println("operation answer = : ${num1 + num2}")
        "-" -> println("operation answer = : ${num1 - num2}")
        "*" -> println("operation answer = : ${num1 * num2}")
        "/" -> {
            if (num2!=0) {
                println("operation answer = : ${num1 / num2}")
            }
            else
            {
                println("cannot be div by zero")
            }
        }
        "%" -> println("operation answer = : ${num1 % num2}")
        else ->{
            println("invalid value enter")
        }
    }
}