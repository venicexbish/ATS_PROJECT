/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 20:28:48 GMT 2023
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SmartBulb_ESTest extends SmartBulb_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb(")ZooF-IwT@+xw/i-1%e", true, (-4741), (-1774.6));
      smartBulb0.hashCode();
      assertEquals((-4741), smartBulb0.getTone());
      assertEquals((-1774.6), smartBulb0.getDimensao(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("Dimensao invalida!", false, (-568), 0.0);
      SmartBulb smartBulb1 = new SmartBulb(smartBulb0);
      smartBulb0.setDimensao(2961.36);
      boolean boolean0 = smartBulb1.equals(smartBulb0);
      assertEquals(2394.36, smartBulb0.consumoEnergia(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("VSof8leG*A_.@;(rvJ.", false, 0, 0);
      SmartBulb smartBulb1 = new SmartBulb(smartBulb0);
      smartBulb0.setTone(1);
      boolean boolean0 = smartBulb0.equals(smartBulb1);
      assertFalse(boolean0);
      assertEquals(1, smartBulb0.getTone());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("Dimensao invalida!", false, (-568), 0.0);
      SmartBulb smartBulb1 = new SmartBulb(smartBulb0);
      boolean boolean0 = smartBulb1.equals(smartBulb0);
      assertTrue(boolean0);
      assertEquals((-568), smartBulb1.getTone());
      assertEquals(0.0, smartBulb0.getDimensao(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("Dimensao invalida!", false, (-568), 0.0);
      smartBulb0.setDimensao(0.0);
      assertEquals((-568), smartBulb0.getTone());
      assertEquals(0.0, smartBulb0.getDimensao(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("VSof8leG*A_.@;(rvJ.", false, 0, 0);
      int int0 = smartBulb0.getTone();
      assertEquals(0.0, smartBulb0.getDimensao(), 0.01);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("69cU", true, (-43), 0.0);
      int int0 = smartBulb0.getTone();
      assertEquals((-43), int0);
      assertEquals(0.0, smartBulb0.getDimensao(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb(")ZooF-IwT@+xw/i-1%e", true, (-4741), (-1774.6));
      smartBulb0.setDimensao(2);
      double double0 = smartBulb0.getDimensao();
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("\n SmartBulb (\u001B[36m", true, (-3033), (-3033));
      double double0 = smartBulb0.getDimensao();
      assertEquals((-3033.0), double0, 0.01);
      assertEquals((-3033), smartBulb0.getTone());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("Dimensao invalida!", false, (-568), 0.0);
      smartBulb0.setDimensao(2961.36);
      double double0 = smartBulb0.consumoEnergia();
      assertEquals(2961.36, smartBulb0.getDimensao(), 0.01);
      assertEquals(2394.36, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("VSof8leG*A_.@;(rvJ.", false, 0, 0);
      SmartBulb smartBulb1 = smartBulb0.clone();
      assertEquals(0.0, smartBulb0.getDimensao(), 0.01);
      assertEquals(0, smartBulb1.getTone());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb(")ZooF-IwT@+xw/i-1%e", true, (-4741), (-1774.6));
      SmartBulb smartBulb1 = smartBulb0.clone();
      assertEquals((-4741), smartBulb1.getTone());
      assertTrue(smartBulb1.equals((Object)smartBulb0));
      assertEquals((-1774.6), smartBulb1.getDimensao(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb();
      assertEquals(0.0, smartBulb0.getDimensao(), 0.01);
      
      smartBulb0.setDimensao(1.0);
      smartBulb0.clone();
      assertEquals(1.0, smartBulb0.getDimensao(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb(")ZooF-IwT@+xw/i-1%e", true, (-4741), (-1774.6));
      smartBulb0.setDimensao(2);
      smartBulb0.clone();
      assertEquals(2.0, smartBulb0.getDimensao(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SmartBulb smartBulb0 = null;
      try {
        smartBulb0 = new SmartBulb((SmartBulb) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("SmartDevice", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb(")ZooF-IwT@+xw/i-1%e", true, (-4741), (-1774.6));
      double double0 = smartBulb0.consumoEnergia();
      assertEquals(0.0, double0, 0.01);
      assertEquals((-4741), smartBulb0.getTone());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb();
      int int0 = smartBulb0.getTone();
      assertEquals(0.0, smartBulb0.getDimensao(), 0.01);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb();
      double double0 = smartBulb0.getDimensao();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1, smartBulb0.getTone());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("\n SmartBulb (\u001B[36m", true, (-3033), (-3033));
      smartBulb0.setDimensao(1.0);
      double double0 = smartBulb0.consumoEnergia();
      assertEquals(1.0, smartBulb0.getDimensao(), 0.01);
      assertEquals((-3031.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb();
      SmartBulb smartBulb1 = new SmartBulb();
      smartBulb0.setTone(2);
      boolean boolean0 = smartBulb1.equals(smartBulb0);
      assertEquals(2, smartBulb0.getTone());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb();
      smartBulb0.setID("  ");
      SmartBulb smartBulb1 = new SmartBulb();
      boolean boolean0 = smartBulb0.equals(smartBulb1);
      assertFalse(boolean0);
      assertEquals(1, smartBulb1.getTone());
      assertEquals(0.0, smartBulb1.getDimensao(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb();
      boolean boolean0 = smartBulb0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(0.0, smartBulb0.getDimensao(), 0.01);
      assertEquals(1, smartBulb0.getTone());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb();
      boolean boolean0 = smartBulb0.equals(smartBulb0);
      assertEquals(1, smartBulb0.getTone());
      assertEquals(0.0, smartBulb0.getDimensao(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("\n SmartBulb (\u001B[36m", true, (-3033), (-3033));
      boolean boolean0 = smartBulb0.equals("\n SmartBulb (\u001B[36m");
      assertEquals((-3033), smartBulb0.getTone());
      assertFalse(boolean0);
      assertEquals(0.0, smartBulb0.consumoEnergia(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb("\n SmartBulb (\u001B[36m", true, (-3033), (-3033));
      String string0 = smartBulb0.toString();
      assertEquals("\n SmartBulb (\u001B[36m\n SmartBulb (\u001B[36m\u001B[0m,ON): Tone-> -3033  Dimensao-> -3033.0  Consumo Di\u00E1rio-> 0.0", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb();
      String string0 = smartBulb0.toString();
      assertEquals(0.0, smartBulb0.getDimensao(), 0.01);
      assertEquals("\n SmartBulb (\u001B[36m\u001B[0m,OF): Tone-> 1  Dimensao-> 0.0  Consumo Di\u00E1rio-> 0.0", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb();
      smartBulb0.setDimensao(2);
      SmartBulb smartBulb1 = new SmartBulb();
      boolean boolean0 = smartBulb0.equals(smartBulb1);
      assertEquals(4.0, smartBulb0.consumoEnergia(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb();
      smartBulb0.setDimensao((-1192.07581146));
      assertEquals(0.0, smartBulb0.getDimensao(), 0.01);
      assertEquals(1, smartBulb0.getTone());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SmartBulb smartBulb0 = new SmartBulb();
      smartBulb0.setTone(3181);
      assertEquals(2, smartBulb0.getTone());
  }
}