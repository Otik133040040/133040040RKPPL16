/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ifunpas.rkppl.mavenproject2.quizrkppl16133040400;

import junit.framework.Assert;
import org.ifunpas.ac.id.data.Hewan;
import org.junit.Test;
import sun.applet.Main;

/**
 *
 * @author sb604-16
 */
public class Quiz {
    Hewan h = new Hewan();
    @Test
    public void test1(){
        h.setNama("");
        Assert.assertNull("Salah",h.getNama());
    }
    
    @Test
    public void test2(){
      h.setPemakan("Daging");
      Assert.assertSame(this, this);
    }
   
}
