package com.example.kotlintutorialfiles

fun main()
{
    //لادخال علامة وطباعة كلمة ناجح اذا العلامة فوق او يساوي 50 وراسب اذا علامة تحت 50
    print("insert mark student : ")
    var markStudent=readLine()!!.toInt()

//    if (markStudent>=50)
//        println("pass")
//    if (markStudent<50)
//        println("fail")

//    if (markStudent>=50)
//        println("pass")
//    else
//        println("fail")
//var str1:String
//    if (markStudent>=50)
//        str1="pass"
//    else
//        str1="fail"
//
//    print(str1)

//    var str1= if (markStudent>=50) "pass" else "fail"
//    println(str1)

    //اذا علامته فوق او يساوي 50 اطبع ناجح واضف له زياده 3 علامات والا اطبع راسب واضف له 5 علامات
        if (markStudent>=50) {
            println("pass")
            markStudent = markStudent + 3
        }
    else {
            println("fail")
            markStudent = markStudent + 5
        }
    println("mark = $markStudent")
}