package com.yangleping.mydb.common;

import java.nio.ByteBuffer;

/**
 * @package:com.yangleping.mydb.common
 * @user LePingYang
 * @date 2022/1/3
 */
public class Parser {
    public static long parseLong(byte[] buf){
        ByteBuffer buffer = ByteBuffer.wrap(buf, 0, 8);
        return buffer.getLong();
    }

    public static byte[] long2Byte(long value){
        return ByteBuffer.allocate(Long.SIZE / Byte.SIZE).putLong(value).array();
    }
}
