package com.example.kotlintutorialfiles

fun main()
{
    val n1 = 9
    val n2 = 10
    val n3 = 10
    //var b1=n1+n2 تعبير حسابي
//    var b1=n1>n2 // false or true
//    println(b1)
//    var b2= n1< n2
//    println(b2)
//    var b3= n3>=n2
//    println(b3)
//    var b4= n1<= n2
//    println(b4)

//    var b3= n3==n2
//    println(b3)
//    var b4= n1!= n2
//    println(b4)
//    var s1="ali"
//    var s2="ahmad"
//    var s3="ali"
////var b5=s1==s3
//  //  var b5=s1>s3//false
//    var b5=s1!=s2
//    println(b5)

//    var b2= n1+5<= n2+4// التعبير حسابية ذات اولوية قبل  التعبير المنطقي
//    println(b2)

    var b6= n1<n2 && n1==n3
    println(b6)
    var b7= n1<n2 || n1==n3
    println(b7)

    var b8= !(n1<n2 && n1==n3)
    println(b8)
    
}