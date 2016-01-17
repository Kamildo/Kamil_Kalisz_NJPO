/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie_1_singleton;

/**
 *
 * @author student
 */
public class Gracz_jednoreki {
    
     private int stan=1000;
    
    public Gracz_jednoreki(int stan_start)
    {
    this.stan=stan_start;
    }
    public Gracz_jednoreki(){}
      public void wygrana(int x)
    {
    this.stan+=x;
    }
    public void przegrana(int x)
    {
    this.stan-=x;
    }
}
