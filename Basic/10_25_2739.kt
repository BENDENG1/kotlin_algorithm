package com.gyroh.algorithm

fun main(){
    var num : Int = 0;
    var result : Int = 0;

    num = readLine()!!.toInt()

    for (i : Int in 1..9){
        result = num * i
        print("$num * $i = $result\n")
    }
}