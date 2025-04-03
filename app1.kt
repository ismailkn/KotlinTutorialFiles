package com.example.kotlintutorialfiles

//اكتب برنامج لادخال اربع علامات وحساب وطباعة المعدل
fun main()
{
  print("insert mark one : ")
  var m1=readLine()!!.toInt()
    print("insert mark two : ")
    var m2=readLine()!!.toInt()
    print("insert mark three : ")
    var m3=readLine()!!.toInt()
    print("insert mark four : ")
    var m4=readLine()!!.toInt()

    var avg=(m1.toFloat()+m2.toFloat()+m3.toFloat()+m4.toFloat())/4
    println("average = $avg")
}
