/*
    Copyright (C) 2014  sarin

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ru.ubmb.jstribog;


import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author sarin
 */
public class AlgTest {
    
    @Test
    public void testXor() {
        int[] a = {0xFF};
        int[] b = {0xFF};
        Assert.assertEquals(0x00, Alg.xor(a, b)[0]);
        Assert.assertEquals(0x00, Alg.xor(b, a)[0]);
        a = new int[]{0x00};
        Assert.assertEquals(0xFF, Alg.xor(b, a)[0]);
    }
    
    @Test
    public void testAdd() {
        for (int[][] tc : TestVectors.AddMod) {
            Assert.assertArrayEquals(Alg.add(tc[0], tc[1]), tc[2]);
        }
    }
    
    @Test
    public void testL() {
        for (int[][] tc : TestVectors.L) {
            Assert.assertArrayEquals(Alg.L(tc[0]), tc[1]);            
        }
    }
    
    @Test
    public void testP() {
        int[] a = new int[64];
        for (int i = 0; i < 64; i++) {
            a[i] = 0xFC;
        }
        Assert.assertArrayEquals(Alg.P(a), a);
        for (int[][] tc : TestVectors.P) {
            Assert.assertArrayEquals(Alg.P(tc[0]), tc[1]);            
        }
    }
    
    @Test
    public void testS() {
        int[] a = new int[64];
        int[] res = new int[64];
        for (int i = 0; i < 64; i++) {
            a[i] = 0x00;
            res[i] = 0xFC;
        }
        Assert.assertArrayEquals(Alg.S(a), res);
        for (int[][] tc : TestVectors.S) {
            Assert.assertArrayEquals(Alg.S(tc[0]), tc[1]);            
        }
    }
    
    @Test
    public void testLPS() {
        for (int[][] tc : TestVectors.LPS) {
            Assert.assertArrayEquals(Alg.LPS(tc[0]), tc[1]);            
        }
    }
    
    @Test
    public void testKS() {
        int[] a = new int[64];
        for (int i = 0; i < 64; i++) {
            a[i] = 0x00;
        }
        for (int i = 0; i < 12; i++) {
            Assert.assertArrayEquals(Alg.ks(a, i), TestVectors.KS[i]);
        }
    }
    
    @Test
    public void testE() {
        for (int i = 0; i < TestVectors.L.length; i++) {
            int[][] tc = TestVectors.L[i];
            Assert.assertArrayEquals(Alg.E(tc[0], tc[1]), TestVectors.E[i]);
        }
    }
    
    @Test
    public void testGN() {
        for (int[][] tc : TestVectors.gN) {
            Assert.assertArrayEquals(tc[3], Alg.gN(tc[0], tc[1], tc[2]) );
        }
    }
    
    @Test
    public void testHash() {
        Assert.assertArrayEquals(TestVectors.SHORT_HASH512, Alg.hashX(new int[64], TestVectors.SHORT_MSG));
        Assert.assertArrayEquals(TestVectors.LONG_HASH512, Alg.hashX(new int[64], TestVectors.LONG_MSG));
    }
    
}
