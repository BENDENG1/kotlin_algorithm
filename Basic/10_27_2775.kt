package com.gyroh.algorithm


/*
a층의 b호에 살려면 자신의 아래 (a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 살아야한다.
0층의 i호는 i명이 산다.
0층 1,2,3,4...호 1,2,3,4...명

이 문제는 간단히 이중배열을 선언하여 값만 정리해놓으면 될듯 싶다.
 */

fun main(){
    var arr = Array(15){IntArray(15)}
    var t : Int = 0

    for (i in 0 until 15){
        arr[i][0] = 0  // 호수에 대한 인원을 구하기 위해 미리 셋팅
        arr[0][i] = i  // 0층에 대한 호수를 초기화
    }

    for(i in 1 until 15){
        for (j in 1 until 15){
                arr[i][j] = arr[i - 1][j] + arr[i][j - 1]
        }
    }

    t = readLine()!!.toInt()
    for(i in 0 until t){
        var n = readLine()!!.toInt()
        var k = readLine()!!.toInt()
        println(arr[n][k])
    }
}
