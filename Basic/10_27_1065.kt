package com.gyroh.algorithm

import java.lang.Math.abs

/*
x가 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
입력값 -> n / 1 <= .. <= n 한수의 갯수 출력

한 자리수  : 1 ~ 9 -> 길이가 1인 등차수열 / 모든 수 가 한수
두 자리수  : 10, 11, 12, 13, 14, 15, ... 99 -> 길이가 2인 등차수열
           따라서 90개 모두 다된다.
세 자리수 : 위의 형식처럼 진행이 된다.

ex)
1: 숫자 하나이므로 등차수열
2: 같은경우
3: 같은경우
..
10: 길이 2 /  1 0 인 수열 -> 등차수열o
11: 길이 2 /  1 1 인 수열 -> 등차수열o
..
100: 길이 3 / 1 0 0 인 수열 -> 등차수열x
101: 길이 3 / 1 0 1 인 수열 -> 등차수열x
..
123: 길이 3 / 1 2 3 인 수열 -> 등차수열o
 */

fun main(){
    var n : Int = readLine()!!.toInt()
    var arr = IntArray(1001)
    var ans : Int = 0

    for (i in 1 .. 9){
        for (j in 0..9){
            for(k in 0..9){
                if ( i- j == j - k){
                    arr[get_hundred(i,j,k)] = 1
                }else{
                    arr[get_hundred(i,j,k)] = 0
                }
            }
        }
    }
    if(n <= 99) {
        println("$n")
    } else{
        for(i in 100 .. n){
            if(arr[i] == 1) ans++
        }
        println("${ans + 99}")
    }
}

fun get_hundred(a:Int, b:Int, c:Int) :Int{
    return (100 * a + b *10 + c)
}