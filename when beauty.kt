package com.example.kotlintutorialfiles

fun main()
{
    print("enter number one : ")
    var num1=readLine()!!.toInt()
    print("enter number two : ")
    var num2=readLine()!!.toInt()

    print("enter the type operator (+ * / - % ) : ")
    var op=readLine().toString()
    var answer=when (op) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2!=0) {
                num1 / num2
            }
            else
            {
                println("cannot be div by zero")
                0
            }
        }
        "%" -> num1 % num2
        else ->{
            println("invalid value enter")
            0
        }
    }
    println(answer)
}