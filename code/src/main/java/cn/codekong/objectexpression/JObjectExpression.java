package cn.codekong.objectexpression;

import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by 尚振鸿 on 2018/7/5. 00:05
 * mail:szh@codekong.cn
 */

public class JObjectExpression {
    public static void main(String[] args) {
        String[] fileList  = new File("./").list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return false;
            }
        });

        FilenameFilter filenameFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return false;
            }
        };
    }

    private void Example(Window window){
        int i = 0;
        window.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                //错误，i必须声明为final的
                //i++;
            }
        });
    }
}
