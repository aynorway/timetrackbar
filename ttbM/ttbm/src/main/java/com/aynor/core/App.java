package com.aynor.core;

import com.aynor.ui.UIManager;
import com.aynor.audio.AudioManager;
import com.aynor.menu.MenuManager;
import com.aynor.time.TimeManager;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Hello ttbm!
 *
 */
public class App {
    public static void main(String[] args) {
        // 获取当前时间
        LocalDateTime now = LocalDateTime.now();
        // 定义时间格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // 格式化时间
        String formattedDateTime = now.format(formatter);

        System.out.println("——————————————\nHello ttbm ! ----- Current Time: " + formattedDateTime + "\n——————————————");

        // 调用 UI 设置
        UIManager.setupUI();
        // 初始化菜单
        MenuManager.initializeMenu();
        // 设置时间管理
        TimeManager.setupTimers();
        // 设置声音管理
        AudioManager.setupAudio();

        System.out.println("Application started successfully. ----- Current Time: " + formattedDateTime + "\n——————————————");
    }
}
