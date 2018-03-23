package org.zz.gmhelper.test;

import org.junit.Assert;
import org.junit.Test;
import org.zz.gmhelper.Sm3Util;

import java.util.Arrays;

public class Sm3UtilTest extends GmBaseTest {
  @Test
  public void testHashAndVerify() {
    try {
      byte[] hash = Sm3Util.hash(SRC_DATA);
      System.out.println("SM3 hash result:\n" + Arrays.toString(hash));
      boolean flag = Sm3Util.verify(SRC_DATA, hash);
      if (!flag) {
        Assert.assertTrue(false);
      }
      Assert.assertTrue(true);
    } catch (Exception ex) {
      ex.printStackTrace();
      Assert.assertTrue(false);
    }
  }
}
