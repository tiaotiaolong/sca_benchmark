package com.alipay.sofa.isle.sample;

import com.alibaba.fastjsonfordrm.JSON;
import org.apache.batik.transcoder.image.JPEGTranscoder;

/**
 * @author xuanbei 18/7/17
 */
public class SampleServiceImpl implements SampleService {
    private String message;

    public String message() {
        return message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        JSON.parseObject(this.message);
        JPEGTranscoder jpegTranscoder=new PEGTranscoder();
        jpegTranscoder.createImage(null,null);
    }
}
