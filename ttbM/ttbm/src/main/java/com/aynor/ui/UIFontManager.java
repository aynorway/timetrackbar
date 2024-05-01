package com.aynor.ui;

import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class UIFontManager {
    public static void setDefaultUIFont(FontUIResource f) {
        java.util.Enumeration<Object> keys = UIManager.getDefaults().keys();
        // 遍历一下所有的键
        while (keys.hasMoreElements()) {
            // 获取下一个键
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            // 检查是否是 FontUIResource 实例
            if (value instanceof FontUIResource)
                // 如果是字体资源, 传入字体f, 替换原来字体资源
                UIManager.put(key, f);
        }
    }
}
