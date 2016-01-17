/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zadanie3_fabryka;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Kamildo
 */
public class KONTAKTOWA extends Strona{

    public KONTAKTOWA() {
          Random rand =new Random();
           try {
            BufferedWriter file = new BufferedWriter(new FileWriter(new File("KONTAKTOWA.html")));
            
              String tresc;
              for(int j=0;j<5;j++){
              tresc="";
            int i=0;
            while(i<rand.nextInt(10)+2)
            {
              tresc+=(char)(rand.nextInt(26)+97);//97-122
                
            i++;
            }
            file.write(tresc+" tel: ");
            tresc="";
            i=0;
             while(i<9)
            {
              tresc+=(char)(rand.nextInt(10)+48);//0-9
                
            i++;
            }
             i=0;
              file.write(tresc+" adr: ");
             while(i<rand.nextInt(15))
            {
              tresc+=(char)(rand.nextInt(26)+97);//97-122
                
            i++;
            }
            file.write(tresc+"<br>");
              }
            file.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(GALERIA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
