package ru.ubmb.jstribog;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;
import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void testJCA512() throws NoSuchAlgorithmException, NoSuchProviderException {
        Security.addProvider(new StribogProvider());
        MessageDigest md = MessageDigest.getInstance("Stribog512", "JStribog");
        Assert.assertNotNull(md);
        md.update(new byte[]{
            0x32, 0x31, 0x30, 0x39, 0x38, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x30, 0x39, 0x38, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x30, 0x39, 0x38, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x30, 0x39, 0x38, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x30, 0x39, 0x38, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x30, 0x39, 0x38, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x30
        });
        Assert.assertArrayEquals(intToByte(new int[]{
            0x48, 0x6F, 0x64, 0xC1, 0x91, 0x78, 0x79, 0x41, 0x7F, 0xEF, 0x08, 0x2B, 0x33, 0x81, 0xA4, 0xE2, 0x11, 0xC3, 0x24, 0xF0, 0x74, 0x65, 0x4C, 0x38, 0x82, 0x3A, 0x7B, 0x76, 0xF8, 0x30, 0xAD, 0x00, 0xFA, 0x1F, 0xBA, 0xE4, 0x2B, 0x12, 0x85, 0xC0, 0x35, 0x2F, 0x22, 0x75, 0x24, 0xBC, 0x9A, 0xB1, 0x62, 0x54, 0x28, 0x8D, 0xD6, 0x86, 0x3D, 0xCC, 0xD5, 0xB9, 0xF5, 0x4A, 0x1A, 0xD0, 0x54, 0x1B
        }), md.digest());
        md.reset();

        md.update(intToByte(new int[]{
            0xFB, 0xE2, 0xE5, 0xF0, 0xEE, 0xE3, 0xC8, 0x20, 0xFB, 0xEA, 0xFA, 0xEB, 0xEF, 0x20, 0xFF, 0xFB, 0xF0, 0xE1, 0xE0, 0xF0, 0xF5, 0x20, 0xE0, 0xED, 0x20, 0xE8, 0xEC, 0xE0, 0xEB, 0xE5, 0xF0, 0xF2, 0xF1, 0x20, 0xFF, 0xF0, 0xEE, 0xEC, 0x20, 0xF1, 0x20, 0xFA, 0xF2, 0xFE, 0xE5, 0xE2, 0x20, 0x2C, 0xE8, 0xF6, 0xF3, 0xED, 0xE2, 0x20, 0xE8, 0xE6, 0xEE, 0xE1, 0xE8, 0xF0, 0xF2, 0xD1, 0x20, 0x2C, 0xE8, 0xF0, 0xF2, 0xE5, 0xE2, 0x20, 0xE5, 0xD1
        }));
        Assert.assertArrayEquals(intToByte(new int[]{
            0x28, 0xFB, 0xC9, 0xBA, 0xDA, 0x03, 0x3B, 0x14, 0x60, 0x64, 0x2B, 0xDC, 0xDD, 0xB9, 0x0C, 0x3F, 0xB3, 0xE5, 0x6C, 0x49, 0x7C, 0xCD, 0x0F, 0x62, 0xB8, 0xA2, 0xAD, 0x49, 0x35, 0xE8, 0x5F, 0x03, 0x76, 0x13, 0x96, 0x6D, 0xE4, 0xEE, 0x00, 0x53, 0x1A, 0xE6, 0x0F, 0x3B, 0x5A, 0x47, 0xF8, 0xDA, 0xE0, 0x69, 0x15, 0xD5, 0xF2, 0xF1, 0x94, 0x99, 0x6F, 0xCA, 0xBF, 0x26, 0x22, 0xE6, 0x88, 0x1E
        }), md.digest());
    }

    @Test
    public void testJCA256() throws NoSuchAlgorithmException, NoSuchProviderException {
        Security.addProvider(new StribogProvider());
        MessageDigest md = MessageDigest.getInstance("Stribog256", "JStribog");
        Assert.assertNotNull(md);
        md.update(new byte[]{
            0x32, 0x31, 0x30, 0x39, 0x38, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x30, 0x39, 0x38, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x30, 0x39, 0x38, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x30, 0x39, 0x38, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x30, 0x39, 0x38, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x30, 0x39, 0x38, 0x37, 0x36, 0x35, 0x34, 0x33, 0x32, 0x31, 0x30
        });
        byte[] digest = md.digest();
        Assert.assertArrayEquals(intToByte(new int[]{
            0x00, 0x55, 0x7b, 0xe5, 0xe5, 0x84, 0xfd, 0x52, 0xa4, 0x49, 0xb1, 0x6b, 0x02, 0x51, 0xd0, 0x5d,
            0x27, 0xf9, 0x4a, 0xb7, 0x6c, 0xba, 0xa6, 0xda, 0x89, 0x0b, 0x59, 0xd8, 0xef, 0x1e, 0x15, 0x9d}), digest);
        md.reset();
        
        md.update(intToByte(new int[]{
            0xFB, 0xE2, 0xE5, 0xF0, 0xEE, 0xE3, 0xC8, 0x20, 0xFB, 0xEA, 0xFA, 0xEB, 0xEF, 0x20, 0xFF, 0xFB, 0xF0, 0xE1, 0xE0, 0xF0, 0xF5, 0x20, 0xE0, 0xED, 0x20, 0xE8, 0xEC, 0xE0, 0xEB, 0xE5, 0xF0, 0xF2, 0xF1, 0x20, 0xFF, 0xF0, 0xEE, 0xEC, 0x20, 0xF1, 0x20, 0xFA, 0xF2, 0xFE, 0xE5, 0xE2, 0x20, 0x2C, 0xE8, 0xF6, 0xF3, 0xED, 0xE2, 0x20, 0xE8, 0xE6, 0xEE, 0xE1, 0xE8, 0xF0, 0xF2, 0xD1, 0x20, 0x2C, 0xE8, 0xF0, 0xF2, 0xE5, 0xE2, 0x20, 0xE5, 0xD1
        }));
        Assert.assertArrayEquals(intToByte(new int[]{
            0x50, 0x8f, 0x7e, 0x55, 0x3c, 0x06, 0x50, 0x1d, 0x74, 0x9a, 0x66, 0xfc, 0x28, 0xc6, 0xca, 0xc0,
            0xb0, 0x05, 0x74, 0x6d, 0x97, 0x53, 0x7f, 0xa8, 0x5d, 0x9e, 0x40, 0x90, 0x4e, 0xfe, 0xd2, 0x9d}), md.digest());
    }

    private byte[] intToByte(int[] inttc) {
        byte tc[] = new byte[inttc.length];
        for (int i = 0; i < tc.length; i++) {
            tc[i] = (byte) inttc[i];

        }
        return tc;
    }
    
}