package com.yangleping.mydb.backend.utils;

/**
 * @package:com.yangleping.mydb.backend.utils
 * @user LePingYang
 * @date 2022/1/3
 */

/**
 * 表示出现了一些错误，无法处理或者恢复，就会异常退出 System.exit(1)
 */
public class Panic {
    public static void panic(Exception err){
        err.printStackTrace();
        System.exit(1);
    }
}
