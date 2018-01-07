/**
 * Created by 尚振鸿 on 2018/1/7. 21:32
 * mail:szh@codekong.cn
 */

public class Main {
    public static void main(String[] args) {
        People people = new People();

        people.setName("bingjianit");
        people.setAge("12");

        people.setRunnable(true);

        System.out.println(people.getName() + "  " + people.getAge());
        System.out.println(people.isRunnable());
    }
}
