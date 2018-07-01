package cn.codekong.objectdeclare;

import java.util.ArrayList;

/**
 * Created by 尚振鸿 on 2018/7/1. 22:43
 * mail:szh@codekong.cn
 */
public class JObjectDeclare{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("小雨", 10));

        Grade.INSTANCE.setAllStudents(students);
    }
}