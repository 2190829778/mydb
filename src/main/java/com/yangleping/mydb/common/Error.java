package com.yangleping.mydb.common;

/**
 * @package:com.yangleping.mydb.common
 * @user LePingYang
 * @date 2022/1/3
 */
public class Error {
    //common
    public static final Exception FileExistsException = new RuntimeException("File already exists!");
    public static final Exception FileCannotRWException = new RuntimeException("File cannot read or write!");
    public static final Exception FileNotExistsException = new RuntimeException("File does not exists!");

    //tm
    public static final Exception BadXIDFileException = new RuntimeException("Bad XID file!");

}
