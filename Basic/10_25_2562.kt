package com.gyroh.algorithm

import java.util.*

fun main(){
    var array = arrayListOf<Int>()

    for(i in  0 until 9){
        val inputNum = readLine()!!.toInt()
        array.add(inputNum)
    }

    val maxVal = Collections.max(array)
    val maxLine = array.indexOf(maxVal)

    println("$maxVal\n${maxLine + 1}")
}