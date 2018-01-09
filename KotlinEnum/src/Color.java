/**
 * Created by 尚振鸿 on 2018/1/9. 21:45
 * mail:szh@codekong.cn
 */

public enum Color {
    RED("红色", 1), BLUE("蓝色", 2), BLACK("黑色", 3);

    String name;
    int value;

    Color(String name, int value){
        this.name = name;
        this.value = value;
    }
}
