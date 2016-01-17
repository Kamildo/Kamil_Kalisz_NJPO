
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kamildo
 */
public class Sortowanie {
    
    
    public static void sortuj(int tablica[], int x, int y) {
 
int i,j,v,temp;
 
i=x;
j=y;
v=tablica[(x+y) / 2];
do {
while (tablica[i]<v)
i++;
while (v<tablica[j])
j--;
if (i<=j) {
temp=tablica[i];
tablica[i]=tablica[j];
tablica[j]=temp;
i++;
j--;
}
}
while (i<=j);
if (x<j)
sortuj(tablica,x,j);
if (i<y)
sortuj(tablica,i,y);
}
 public static int [] generuj_tablice(){
  Random rand=new Random();
        int [] tablica=new int[10000000];
     for(int i=0;i<10000000;i++)   
     {
     tablica[i]=rand.nextInt();
     }
     return tablica;
 }
}
