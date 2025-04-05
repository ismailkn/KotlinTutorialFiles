package com.example.kotlintutorialfiles

//ادخال عددين
//ادخال نوع عملية + * / - %
fun main()
{
    print("enter number one : ")
    var num1=readLine()!!.toInt()
    print("enter number two : ")
    var num2=readLine()!!.toInt()

    print("enter the type operator (+ * / - % ) : ")
    var op=readLine().toString()
    var answer: Int
    if ( op == "+") {
        //answer=num1+num2
        println("operation answer = : ${num1 + num2}")
    }
    else if (op=="*")
    {
        println("operation answer = : ${num1 * num2}")
    }
    else if (op=="-"){
        println("operation answer = : ${num1 - num2}")
    }
    else if (op=="/"){
         if (num2!=0) {
            println("operation answer = : ${num1 / num2}")
        }
        else
         {
            println("cannot be div by zero")
         }
    }
    else if (op=="%"){
        println("operation answer = : ${num1 % num2}")
    }

    else

    {
        println("invalid value enter")
    }

}