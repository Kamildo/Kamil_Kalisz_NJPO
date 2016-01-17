/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zadanie6_watki1;

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
public class watek extends Thread{
    
     public void run(){
    try{
		Random rand = new Random();
		File plik = new File("plik" + rand.nextLong());
		BufferedWriter write = new BufferedWriter(new FileWriter(plik));
		
		for(int i  = 0; i<1048576; i++)
		write.write(rand.nextInt(256));
		
		}catch(RuntimeException e){
			this.stop();
		} catch (IOException ex) {
            Logger.getLogger(watek.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
