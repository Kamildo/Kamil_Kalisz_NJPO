/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zadanie6_watki1;

/**
 *
 * @author Kamildo
 */
public class Zadanie6_Watki1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      watek[] w=new watek[10];
        for(int i=0;i<10;i++)
        {
       w[i]= new watek();
       w[i].start();
        }
    }
    
}
