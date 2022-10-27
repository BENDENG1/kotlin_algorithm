package com.gyroh.algorithm

import java.util.*
import kotlin.collections.ArrayList

fun main(){
    val input = Scanner(System.`in`)
    var n : Int= 0
    var list = ArrayList<Pair<Int, String>>() // Pair를 이용

    n = readLine()!!.toInt()
    for( i in 0 until n ){
        val line = readLine()!!.split(" ")  // 스페이스를 기준으로 스플릿
        list.add(Pair(line[0].toInt(), line[1])) // 문자열이니 두개 쪼개서 pair로 짝으로 저장
    }
    list.sortBy { it.first } //첫번째 나이 순서로 정렬을 한다.

    for( i in 0 until n){
        println("${list[i].first} ${list[i].second}")
    }

}