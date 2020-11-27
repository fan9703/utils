package com.sz.kryo;

import java.util.Arrays;

public class Msg {
    public  byte[] version_flag ;
    public  short Crc_code;
    public  byte[] msg_body;

    @Override
    public String toString() {
        return "Msg{" +
                "version_flag=" + Arrays.toString(version_flag) +
                ", Crc_code=" + Crc_code +
                ", msg_body=" + Arrays.toString(msg_body) +
                '}';
    }

    public Msg() {
    }

    public void setVersion_flag(byte[] version_flag) {
        this.version_flag = version_flag;
    }

    public void setCrc_code(short crc_code) {
        Crc_code = crc_code;
    }

    public void setMsg_body(byte[] msg_body) {
        this.msg_body = msg_body;
    }
}
