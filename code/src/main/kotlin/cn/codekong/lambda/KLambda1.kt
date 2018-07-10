package cn.codekong.lambda

/**
 * Created by 尚振鸿 on 2018/7/10. 22:53
 * mail:szh@codekong.cn
 */

data class People(val name: String, val age: Int)

fun findTheOldest(peopleList: List<People>) {
    var maxAge = 0
    var theOldestPeople: People? = null
    for (people in peopleList) {
        if (people.age > maxAge) {
            maxAge = people.age
            theOldestPeople = people
        }
    }
    println(theOldestPeople)
}

fun main(args: Array<String>) {
    val peopleList = listOf<People>(People("小白", 22),
            People("小红", 23), People("琦琦", 20))
    findTheOldest(peopleList)

    println(peopleList.maxBy { it.age })

    val sum = {x: Int, y: Int ->
        println("start to calc...")
        x + y
    }
    println(sum(1, 2))
}