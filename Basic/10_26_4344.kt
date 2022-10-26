package com.gyroh.algorithm

import java.util.*

fun main(){
    var n : Int = 0
    var people : Int
    var sum : Int
    var over : Int
    var arr = arrayListOf<Int>()
    val input = Scanner(System.`in`)

    n = readLine()!!.toInt()
    for(i : Int in 0 until n){
        people = input.nextInt()
        sum = 0
        over = 0
        arr.clear()
        for(j:Int in 0 until people){
            val grade = input.nextInt()
            sum += grade
            arr.add(grade)
        }
        for(k:Int in 0 until people){
            if(arr[k] > sum / people)
                over += 1
        }
        println("${String.format("%.3f", (over.toDouble() / people) * 100)}%")
    }
}