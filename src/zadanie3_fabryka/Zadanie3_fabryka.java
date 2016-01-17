/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zadanie3_fabryka;

/**
 *
 * @author Kamildo
 */
public class Zadanie3_fabryka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Strona str1=fabryka.generujstrone(Typ.GALERIA) ;
        Strona str2=fabryka.generujstrone(Typ.AKTUALNOSCI) ;
        Strona str3=fabryka.generujstrone(Typ.INFORMACYJNA) ;
        Strona str4=fabryka.generujstrone(Typ.KONTAKTOWA) ;
        
    }
    
}
