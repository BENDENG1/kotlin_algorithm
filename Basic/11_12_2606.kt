package com.gyroh.algorithm


//연결되는 컴퓨터의 쌍 체크
var arr : Array<IntArray> = arrayOf()
// 방문 여부 체크
var visited : BooleanArray = booleanArrayOf()
var ans : Int = 0

fun main(){
    //컴퓨터 갯수
    var comcnt : Int = readLine()!!.toInt()
    // 연결 갯수
    var concnt : Int = readLine()!!.toInt()
    //c++처럼 memset + size를 받아온만큼 선언해준다고 보면됨.
    arr = Array(comcnt+1){IntArray(comcnt + 1){0}}
    visited = BooleanArray(comcnt + 1)

    for(i : Int in 0 until concnt){
        val line = readLine()!!.split(' ').map(String::toInt)
        arr[line[0]][line[1]] = 1
        arr[line[1]][line[0]] = 1

    }
    dfs(1)
    print(ans - 1) //1번이 감염된 상태에서 시작해서 전이 횟수니 - 1 출력
}

fun dfs(start : Int){
    ans++
    visited[start] = true

    for( i in 1 .. arr.lastIndex){
        if (!visited[i] && arr[start][i] == 1){
            dfs(i)
        }
    }
}