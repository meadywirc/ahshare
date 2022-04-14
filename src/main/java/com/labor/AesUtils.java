package com.labor;

import com.microsoft.sqlserver.jdbc.StringUtils;
import org.apache.commons.codec.binary.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.validation.constraints.NotNull;
import java.security.Security;
import java.security.spec.AlgorithmParameterSpec;

/**
 * Created by jim.z.hu on 2019/3/20.
 */
public final class AesUtils {
    private static final String CHARSET_NAME = "UTF-8";
    private static final String AES_NAME = "AES";
    public static final String ALGORITHM = "AES/CBC/PKCS7Padding";

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    /**
     * 加密
     *
     * @param content
     * @param key
     * @return
     */
    public static String encrypt(@NotNull String content, @NotNull String key) {
        byte[] result = null;
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(CHARSET_NAME), AES_NAME);
            AlgorithmParameterSpec paramSpec = new IvParameterSpec(subBytes(key.getBytes(CHARSET_NAME)));
            cipher.init(Cipher.ENCRYPT_MODE, keySpec, paramSpec);
            result = cipher.doFinal(content.getBytes(CHARSET_NAME));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return Base64.encodeBase64String(result);
    }

    /**
     * 解密
     *
     * @param content
     * @param key
     * @return
     */
    public static String decrypt(@NotNull String content, @NotNull String key) {
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(CHARSET_NAME), AES_NAME);
            AlgorithmParameterSpec paramSpec = new IvParameterSpec(subBytes(key.getBytes(CHARSET_NAME)));
            cipher.init(Cipher.DECRYPT_MODE, keySpec, paramSpec);
            return new String(cipher.doFinal(Base64.decodeBase64(content)), CHARSET_NAME);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return StringUtils.EMPTY;
    }

    /**
     * 从一个byte[]数组中截取一部分
     * @param src
     * @return
     */
    public static byte[] subBytes(byte[] src) {
        if (src.length < 16) {
            throw new RuntimeException("无法从Key中获取偏移量!");
        }
        byte[] bs = new byte[16];
        for (int i=0; i<16; i++){
            bs[i] = src[i];
        }
        return bs;
    }
    
    public static void main(String[] args) {
		String value_encrypt = encrypt("342421197410132213", "5eeed1006dfa4fe8b1e8302779cb66c5");
		System.out.println(value_encrypt);
	}
}
