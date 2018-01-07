/**
 * Created by 尚振鸿 on 2018/1/7. 20:59
 * mail:szh@codekong.cn
 */

class People {
    var name: String? = null
    var age: String? = null
    var isRunnable: Boolean? = null
}

fun main(args: Array<String>){
    val people = People()
    people.age = "12"
    people.name = "bingjianit"

    println(people.age + "  " + people.name)

    val animal = Animal();
    animal.name = "兔子"
    println(animal.name)

}