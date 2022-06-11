// https://www.acmicpc.net/problem/2525

import java.util.Scanner

fun main(){
    val sc = Scanner(System.`in`)
    val nH = sc.nextInt()
    val nM = sc.nextInt()
    val time = sc.nextInt()
    
    val endMTime = nH * 60 + nM + time
    val endH = endMTime / 60
    val endM = endMTime % 60
    
    if(endH >= 24)
        println("${endH-24} $endM")
    else
        println("$endH $endM")
}