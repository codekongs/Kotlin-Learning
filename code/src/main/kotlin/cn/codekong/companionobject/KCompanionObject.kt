package cn.codekong.companionobject

/**
 * Created by 尚振鸿 on 2018/7/2. 20:58
 * mail:szh@codekong.cn
 */

class A{
    companion object {
        fun test(){
            println("Companion Object...")
        }
    }
}


class B{
    companion object KB{
        fun testB(){
            println("Companion Object...")
        }
    }
}


class C{
    private val age: Int = 0;

    companion object {
        fun out(){

            //伴生对象中可以调用外部的私有成员
            println(C().age)
        }
    }
}

interface Log{
    fun printLog(msg: String)
}

class People(val name: String){

    //伴生对象实现接口
    companion object : Log{
        //实现接口的方法
        override fun printLog(msg: String) {
            println("msg ------- $msg")
        }
    }
}

//该方法的参数是接口实例
fun callLog(log: Log){
    log.printLog("msg")
}



class Person(val name: String){
    companion object {
        //伴生对象内部没有方法
    }
}

//伴生对象扩展方法
fun Person.Companion.toJson(person: Person): String{
    //具体实现
    return "";
}

fun main(args: Array<String>) {
//    A.test()
//
//    A.Companion.test()
//
//    B.testB()
//    B.KB.testB()

    //顶层函数不能调用外部类的私有成员
//    println(C().age) //报错

    //传入实现接口的伴生对象的类
    callLog(People)

    //调用方法
    val str = Person.toJson(Person("小白"))
}