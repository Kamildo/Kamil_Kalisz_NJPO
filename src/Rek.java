
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
public class Rek extends Thread{
   public int wartosc=1;
    public Rek(int wartosc){
    this.wartosc=wartosc;
    }
    public BigInteger silnia(BigInteger a){
    if(a.compareTo(BigInteger.ONE)==0)
    {  return (BigInteger.ONE);}
       System.out.println(a);
    return a.multiply(silnia(a.subtract(BigInteger.ONE)));
    
    }
    public void run(){
        long czas0=0;
     long czas1=0;
        czas0=System.currentTimeMillis();
   
      
        BigInteger n=BigInteger.valueOf(wartosc);
    BigInteger wynik=silnia(n);
        czas1= System.currentTimeMillis()-czas0;
        
    JOptionPane.showMessageDialog(null,  wynik.toString()+" rekurencyjnie "+czas1);
    }
}
