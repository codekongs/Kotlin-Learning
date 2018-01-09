/**
 * Created by 尚振鸿 on 2018/1/9. 22:02
 * mail:szh@codekong.cn
 */
enum class KotlinEnum(val r: Int, val g: Int, val b: Int, val colorName: String){
    RED(255, 255, 255, "红色"), GREEN(0, 255, 0, "绿色"),
    BLUE(0, 0, 255, "蓝色");

    //定义一个方法
    fun rgb() = (r * 256 + g) * 256 + b
}