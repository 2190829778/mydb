package com.yangleping.mydb;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @package:com.yangleping.mydb
 * @user LePingYang
 * @date 2022/1/3
 */

/**
 * 测试使用File类的常用方法API
 */
public class TestDemo {


    public static void main(String[] args) {
        File file = new File("/tmp/tranmger_test.xid");
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.length());
        boolean newFile = false;
        try {
            newFile = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(newFile);
    }



}
