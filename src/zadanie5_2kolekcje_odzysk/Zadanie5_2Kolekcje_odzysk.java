/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zadanie5_2kolekcje_odzysk;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Kamildo
 */
public class Zadanie5_2Kolekcje_odzysk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        LinkedList lista=new LinkedList<Person>();
        lista.add(new  Person("dfs", "dfs", "2422342","dfs"));
          lista.add(new  Person("fhgfs", "sdfrs", "2682342","dfs"));
            lista.add(new  Person("zxvcfs", "aytts", "2652342","dfs"));
              lista.add(new  Person("nbns", "bnhs", "24322342","dfs"));
              Collections.sort(lista);
        
       
    }
    
}
