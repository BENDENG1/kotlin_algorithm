package com.gyroh.algorithm

import java.util.*

fun main(){
    val input = Scanner(System.`in`)
    val arr = Array(9){IntArray(9)}

    var max : Int = 0
    var row : Int = 0
    var col : Int = 0


    for (i in arr.indices){
        for(j in 0 until arr[i].size){
            arr[i][j] = input.nextInt()
            if(arr[i][j] > max)
            {
                max = arr[i][j]
                row = i
                col = j
            }
        }
    }

    println(max)
    println("${row + 1} ${col + 1}")
}