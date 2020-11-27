package com.sz;

import com.sz.kryo.KryoSerializer;
import com.sz.kryo.Msg;
import com.sz.kryo.Serializer;
import org.junit.Test;


import java.util.Arrays;


public class test {
    @Test
    public  void test() {
        Serializer ser = new KryoSerializer(Msg.class);
        for (int i = 0; i < 10; i++) {

            Msg msg = new Msg();

            msg.setVersion_flag(new byte[] { 1, 2, 3 });
            msg.setCrc_code((short) 1);
            msg.setMsg_body(new byte[] { 123, 123, 123, 43, 42, 1, 12, 45, 57, 98 });
            byte[] bytes = new byte[300];
            long start = System.nanoTime();
            ser.serialize(msg, bytes);
            System.err.println("序列化耗时：" + (System.nanoTime() - start));
            System.out.println(msg);
            System.out.println(Arrays.toString(bytes));

            Msg newmsg = null;
            start = System.nanoTime();
            newmsg = ser.deserialize(bytes);
            System.err.println("反序列化耗时：" + (System.nanoTime() - start));
            System.out.println(newmsg);
        }
    }
}
