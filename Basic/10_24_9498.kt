package com.gyroh.algorithm

fun main() {
    var grade : Int = readLine()!!.toInt()

    if (90 <= grade && grade <= 100){
        print("A")
    }else if (80 <= grade && grade <= 89){
        print("B")
    }else if (70 <= grade && grade <= 79){
        print("C")
    }else if (60 <= grade && grade <= 69){
        print("D")
    }
    else
        print("F")
}