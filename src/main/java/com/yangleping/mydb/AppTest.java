package com.yangleping.mydb;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @package:com.yangleping.mydb
 * @user LePingYang
 * @date 2022/1/3
 */
public class AppTest extends TestCase {

    public AppTest(String testName){
        super(testName);
    }

    public static TestSuite suite(){
        return new TestSuite(AppTest.class);
    }

    public void testApp(){
        assertTrue(true);
    }

}
