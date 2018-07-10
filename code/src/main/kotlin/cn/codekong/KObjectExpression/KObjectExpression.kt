package cn.codekong.KObjectExpression

import java.awt.Window
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import java.io.File
import java.io.FilenameFilter

/**
 * Created by 尚振鸿 on 2018/7/5. 00:10
 * mail:szh@codekong.cn
 */
fun test(){
    val fileList = File("./").list(
        object: FilenameFilter {
            //重写其中的方法
            override fun accept(dir: File?, name: String?): Boolean {
                return false
            }
        }
    );
}

interface A{
    fun aTest()
}

interface B{
    fun bTest()
}

val myObj: Any = object : A, B{
    override fun bTest() {

    }

    override fun aTest() {

    }
}

private fun Example(window: Window) {
    var i = 0
    window.addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent?) {
            super.mouseClicked(e)
            //i的值可以被正常修改
            i++
        }
    })
}