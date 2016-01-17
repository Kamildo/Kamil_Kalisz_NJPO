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
public class fabryka {
    
    
    public static Strona generujstrone(Typ typ){
    if(typ==Typ.AKTUALNOSCI)  
    {
       return new  AKTUALNOSCI();
    }
   else if(typ==Typ.GALERIA)    
    {
         return new  GALERIA();
    }
   else if(typ==Typ.INFORMACYJNA) 
    {
         return new  INFORMACYJNA();
    }
   else if(typ==Typ.KONTAKTOWA)
    {
         return new KONTAKTOWA();
    }
    return null;
    }
    
}
