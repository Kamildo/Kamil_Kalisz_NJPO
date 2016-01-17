
import java.math.BigInteger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kamildo
 */
public class Ite extends Thread{
   public  int wartosc=1;
    public Ite(int wartosc){
    this.wartosc=wartosc;
    }
    
     public void run(){
         
           long czas0=0;
     long czas1=0;
        czas0=System.currentTimeMillis();
   
      
     BigInteger wynik = BigInteger.ONE;
     BigInteger n=BigInteger.valueOf(wartosc);
     while(n.compareTo(BigInteger.ONE)>0){
     wynik =  wynik.multiply(n);
	    n = n.subtract(BigInteger.ONE);
     }
     czas1= System.currentTimeMillis()-czas0;
      JOptionPane.showMessageDialog(null, wynik.toString()+" iteracyjnie "+czas1);
      
     }
}
