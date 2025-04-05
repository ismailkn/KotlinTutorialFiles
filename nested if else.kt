package com.example.kotlintutorialfiles

fun main()
{
    print("insert mark student : ")
    var markStudent=readLine()!!.toInt()
    //اذا علامته فوق او يساوي 50 اطبع ناجح واضف له زياده 3 علامات والا اطبع راسب واضف له 5 علامات

   if ( markStudent>=0 && markStudent<=100) {
       if (markStudent >= 50) {
           println("pass")
           markStudent = markStudent + 3
       } else {
           println("fail")
           markStudent = markStudent + 5
       }
       println("mark = $markStudent")
   }
    else
        println("error : the mark is between 0 and 100")
}