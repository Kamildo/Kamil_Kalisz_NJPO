/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie_2_3_dekorator;

import java.util.Random;
import java.util.Scanner;


        
public class Zadanie_2_3_dekorator {
 
    static Random rand=new Random();
   
     public static Scanner k = new Scanner(System.in);
    public int losujkierunek(){
        return rand.nextInt(4);
    
    }
    
    
    
 public static void rysuj_tablice(char[][] tablica) 
{
  for(int i=0;i<tablica.length;i++)
        {
            for(int j=0;j<tablica[i].length;j++)
            {
            System.out.print(tablica[i][j]);
            }
            System.out.println();
        }
}
  static  public char[][] pusta_tablica(){
     char[][] tablica=new char[25][25];
        
        for(int i=0;i<tablica.length;i++)
        {
            for(int j=0;j<tablica[i].length;j++)
            {
            tablica[i][j]='.';
            }
        }
    return tablica;
    }
    public static void main(String[] args) {
        
       int r1;
       int r2;
       int r3;
       boolean rower=false;        
         
        Uzytkownik_drogi uz1=new Uzytkownik_drogi() {};
        Uzytkownik_drogi uz2=new Uzytkownik_drogi() {};
        Uzytkownik_drogi uz3=new Uzytkownik_drogi() {};
        
         System.out.print("end aby zakończyć");
       
        Rower nr4=new Rower(null,-1,-1);;
        Pieszy nr1= new Pieszy(uz1,5,7);
        Rower nr2= new Rower(uz2,2,11);
        Auto nr3= new Auto(uz3,15,20);
        while(k.nextLine()!="end")
        {
            
            char[][] tablica=pusta_tablica();
           
 r1=rand.nextInt(4);
  r2=rand.nextInt(4);
   r3=rand.nextInt(4);  
            
            
                 if(rower)
            {
                nr4.ruch(r2);
                if((nr3.x==nr4.x&&nr3.y==nr4.y)||(nr4.x==nr2.x&&nr4.y==nr2.y))
                 break;
            }
                else
            {   
                nr1.ruch(r1);
                tablica[nr1.x][nr1.y]='P';
                 if((nr3.x==nr1.x&&nr3.y==nr1.y)||(nr4.x==nr1.x&&nr4.y==nr1.y))
                 break;
            }   
            if(nr2.x==nr1.x&&nr2.y==nr1.y)
            {
                nr4 = new Rower(nr1);
                tablica[nr4.x][nr4.y]='R';
                rower =true;
            }
           nr2.ruch(r2);
           if((nr3.x==nr2.x&&nr3.y==nr2.y)||(nr4.x==nr2.x&&nr4.y==nr2.y))
                 break;
            tablica[nr2.x][nr2.y]='R';
               nr3.ruch(r3);
               if((nr3.x==nr2.x&&nr3.y==nr2.y)||(nr4.x==nr2.x&&nr4.y==nr2.y))
                 break;
               
            tablica[nr3.x][nr3.y]='A';
            
            System.out.println("//////////////////");
             
            rysuj_tablice(tablica);
        System.out.println("//////////////////");
        }
       System.out.println("kraksa");
       
        
        
        
        
    }
    
}
