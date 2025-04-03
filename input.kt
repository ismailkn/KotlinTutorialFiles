package com.example.kotlintutorialfiles

fun main()
{
//    print("insert name : ")
//    val str1=readLine()
//    println("name : $str1")
    print("enter number 1 : ")
 //   val n1=readLine()?.toInt()?:0
    val n1=readLine()!!.toInt()
    print("enter number 2 : ")
    val n2=readLine()?.toInt()?:0
    val n3=n1+n2
    println("sum = $n3")
    val n4=readLine().toString()
}