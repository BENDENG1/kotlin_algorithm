package com.gyroh.algorithm

import java.util.*

fun main(){
    var input = Scanner(System.`in`)
    var n : Int = 0
    n = input.nextInt()
    var arr = Array<Int>(n,{0})

    for (i in 0 until n){
        var num =  input.nextInt()
        arr.set(i,  num)
    }
    arr.sort()
    for(i in 0 until n){
        println("${arr[i]}")
    }
}