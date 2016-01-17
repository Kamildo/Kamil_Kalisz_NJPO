/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie_1_singleton;

/**
 *
 * @author student
 */
public class Kasyno {
    
    private static Kasyno instance;
    private int stan=10000;
    
    public Kasyno()
    {}
    public static int getInstance()
    {
        if(instance==null)
        {
            instance =new Kasyno();
           
        }
       return  instance.stan;
    }
    public void wygrana(int x)
    {
    this.stan+=x;
    }
    public void przegrana(int x)
    {
    this.stan-=x;
    }
}
