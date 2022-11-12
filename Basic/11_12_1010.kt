package com.gyroh.algorithm

/*
서쪽에는 N개의 사이트가 있고 동쪽에는 M개의 사이트가 있다.
다리끼리는 겹칠 수 없고 최대한 많이 지으려 한다.


우리는 일단 케이스에 대하여 분리하여야 한다.
n이 1이라면 -> 그냥 m가지가 나오고
n == m 이라면 -> 1가지
라는 경우의 수가 주어진다.

이 외에 대하여 우리는 진행을 해볼 것이다.


dp[i][1] = i의 값과 dp[i][i] =1을 가지는
dp[n][m] = dp[i-1][j-1] + dp[i-1][j] 가 되는는이다.


 */

fun main(){
    var dp = Array(31){LongArray(31)}
    var t : Int = readLine()!!.toInt()

    for(i in 1 .. 30){
        dp[i][1] = i.toLong()
        dp[i][i] = 1
    }
    for(i in 1.. 30){
        for(j in 2 until i){
            dp[i][j] = dp[i-1][j-1] + dp[i-1][j]
        }
    }

    for ( i in 0 until t){
        // map{...} 와 함게 toInt() 또는 toIntOrNull() 정수로 변환하는 함수
        //var (N,M) = readLine()!!.split(' ').map{it.toInt()}
        //forEach를 이용하여 정수 어레이를 문자열로 가능 -> 이것도 하기
        var (n,m) = readLine()!!.split(' ').map{it.toInt()}
        print("${dp[m][n]}\n")
    }

}

/*
fun main() = with(System.out.bufferedWriter()){
    val br = System.`in`.bufferedReader()
    var t = br.readLine().toInt()
    val dp = Array(31){LongArray(31)}
    for(i in 1 .. 30){
        dp[i][1]=i.toLong()
        for(j in 2 until i){
            dp[i][j]=dp[i-1][j-1]+dp[i-1][j]
        }
        dp[i][i]=1
    }
    while(t-->0){
        val (r,n) = br.readLine().split(' ').map{it.toInt()}
        write("${dp[n][r]}\n")
    }

    close()
}


 */