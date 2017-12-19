package com.utils;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.util.StringUtils;

import java.io.UnsupportedEncodingException;

/**
 * 各种加密方式
 * Created by ZhengL on 2017/6/8.
 */
public class EncryptionUtils {

    /**
     * Base64 encode
     * */
    public static String base64Encode(String data){
        return Base64.encodeBase64String(data.getBytes());
    }

    /**
     * Base64 decode
     * @throws UnsupportedEncodingException
     * */
    public static String base64Decode(String data) throws UnsupportedEncodingException{
        return new String(Base64.decodeBase64(data.getBytes()),"utf-8");
    }

    /**
     * md5
     * */
    public static String md5Hex(String data){
        return DigestUtils.md5Hex(data);
    }

    /**
     * sha1
     * */
    public static String sha1Hex(String data){
        return DigestUtils.sha1Hex(data);
    }

    /**
     * sha256
     * */
    public static String sha256Hex(String data){
        return DigestUtils.sha256Hex(data);
    }


    /**
     * 平台加密方式
     * @param text 明文
     * @param saltStr 盐值
     * @return String 密文
     */
    public static String getPassword(String text,String saltStr){
        String ciphertext = "";
        String md5Pwd = md5Hex(text);
        if(StringUtils.isEmpty(saltStr)){
            saltStr = "666666";
        }
        String salt = md5Hex(saltStr);
        StringBuilder sb = new StringBuilder();
        int len = 32;
        for (int i = 0; i < len; i += 4) {
            sb.append(md5Pwd.substring(i, i + 4));
            sb.append(salt.substring(i, i + 4));
        }
        ciphertext =  sha256Hex(sb.toString());
        return ciphertext;
    }
}
