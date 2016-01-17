/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie_1_singleton;

/**
 *
 * @author student
 */
public class Zadanie_1_singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.println( Kasyno.getInstance());
        Gracz_blackjack gracz1 = new Gracz_blackjack(2500);
        Gracz_jednoreki gracz2 = new Gracz_jednoreki();
    }
}
