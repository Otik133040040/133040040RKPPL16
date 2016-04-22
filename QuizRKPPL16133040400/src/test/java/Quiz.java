
import junit.framework.Assert;
import org.ifunpas.ac.id.data.Hewan;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sb604-16
 */
public class Quiz {
    Hewan h = new Hewan();
    @Test
    public void test1(){
        h.setNama("kelinci");
        Assert.assertNull("Salah",h.getNama());
    }
    
    @Test
    public void test2(){
      h.setPemakan("Daging");
      Assert.assertSame("Harimau",h.getPemakan());
    }
    
    @Test
    public void test3(){
        h.setJenis("Amfibi");
        Assert.assertNotSame("Melata",h.getJenis());
    }
}
