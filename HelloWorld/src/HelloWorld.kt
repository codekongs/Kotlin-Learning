/**
 * Created by 尚振鸿 on 2018/1/4. 22:26
 * mail:szh@codekong.cn
 */
fun main(args: Array<String>) {
    print("Hello World")
}

fun returnValFun(result: Int): Int{
    return 24
}

//fun max(a: Int, b: Int): Int{
//    return if (a > b) a else b
//}

fun max(a: Int, b: Int): Int = if (a > b) a else b