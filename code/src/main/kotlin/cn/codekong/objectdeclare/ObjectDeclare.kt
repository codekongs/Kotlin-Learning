package cn.codekong.objectdeclare

import java.io.File

/**
 * Created by 尚振鸿 on 2018/7/1. 22:43
 * mail:szh@codekong.cn
 */


data class Student(val name: String, val age: Int){

}

//对象声明
object Grade{
    var allStudents = arrayListOf<Student>()

    //计算所有学生年龄和的方法
    fun countAge(): Int {
        var sum = 0
        for (student in allStudents){
            sum += student.age
        }
        return sum

    }
}

object Singleton{
    val info =  "string"
    fun out(suffix: String){
        println("$info---$suffix")
    }
}


object CaseInsensitiveFileComparator: Comparator<File>{
    override fun compare(file1: File, file2: File): Int {
        return file1.path.compareTo(file2.path, ignoreCase = true)
    }
}
fun main(args: Array<String>) {
    Grade.allStudents.add(Student("小白", 12))
    Grade.allStudents.add(Student("小厅", 13))
    Grade.allStudents.add(Student("小红", 14))
    Grade.allStudents.add(Student("小明", 15))

    print(Grade.countAge())

    Singleton.out("xxx")

    val fileList = listOf<File>(File("/abc"), File("/aBc"), File("/aaa"))
    println(fileList.sortedWith(CaseInsensitiveFileComparator))
}