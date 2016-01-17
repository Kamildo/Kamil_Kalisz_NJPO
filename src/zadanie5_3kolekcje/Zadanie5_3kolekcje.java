
package zadanie5_3kolekcje;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author Kamildo
 */
public class Zadanie5_3kolekcje {

   
    public static void main(String[] args) {
       
        Random rand=new Random();
     ArrayList  ar=new ArrayList<Double>();
     LinkedList  link=new LinkedList<Double>();
     for(int i=0;i<7000000;i++){
         double a=rand.nextDouble();
     ar.add(a);
     link.add(a);
     }
     int test=0;
     while(test<5){
         test++;
       double a=rand.nextDouble();
     long czas1=0;
     long czas2=0;
     long czas0;
     System.out.println("wstawianie");
      czas0=System.currentTimeMillis();
      ar.add(0, a);
      czas1= System.currentTimeMillis()-czas0;
  //    System.out.println(czas1);
      czas0=System.currentTimeMillis();
      link.add(0, a);
      czas1= System.currentTimeMillis()-czas0;
   //   System.out.println(czas2);
      System.out.println(czas1-czas2);
      
      czas0=System.currentTimeMillis();
      ar.add(a);
      czas1= System.currentTimeMillis()-czas0;
 //     System.out.println(czas1);
      czas0=System.currentTimeMillis();
      link.add(a);
      czas1= System.currentTimeMillis()-czas0;
 //     System.out.println(czas2);
       System.out.println(czas1-czas2);
       
        czas0=System.currentTimeMillis();
      ar.add((ar.size()/2), a);
      czas1= System.currentTimeMillis()-czas0;
   //   System.out.println(czas1);
      czas0=System.currentTimeMillis();
      link.add((link.size()/2), a);
      czas1= System.currentTimeMillis()-czas0;
 //     System.out.println(czas2);
       System.out.println(czas1-czas2);
       
    System.out.println("usuwanie");
       czas0=System.currentTimeMillis();
      ar.remove(0);
      czas1= System.currentTimeMillis()-czas0;
   //   System.out.println(czas1);
      czas0=System.currentTimeMillis();
      link.remove(0);
      czas1= System.currentTimeMillis()-czas0;
   //   System.out.println(czas2);
      System.out.println(czas1-czas2);
      
       czas0=System.currentTimeMillis();
      ar.remove(ar.size()-1);
      czas1= System.currentTimeMillis()-czas0;
   //   System.out.println(czas1);
      czas0=System.currentTimeMillis();
      link.remove(link.size()-1);
      czas1= System.currentTimeMillis()-czas0;
  //    System.out.println(czas2);
       System.out.println(czas1-czas2);
       
        czas0=System.currentTimeMillis();
      ar.remove((ar.size()/2));
      czas1= System.currentTimeMillis()-czas0;
 //     System.out.println(czas1);
      czas0=System.currentTimeMillis();
      link.remove((link.size()/2));
      czas1= System.currentTimeMillis()-czas0;
  //    System.out.println(czas2);
       System.out.println(czas1-czas2);
       
      System.out.println("odczyt");
      double war;
      czas0=System.currentTimeMillis();
      ar.get(0);
      czas1= System.currentTimeMillis()-czas0;
   //   System.out.println(czas1);
      czas0=System.currentTimeMillis();
      link.get(0);
      czas1= System.currentTimeMillis()-czas0;
   //   System.out.println(czas2);
       System.out.println(czas1-czas2);
       
      czas0=System.currentTimeMillis();
      ar.get(ar.size()-1);
      czas1= System.currentTimeMillis()-czas0;
   //   System.out.println(czas1);
      czas0=System.currentTimeMillis();
      link.add(link.size()-1);
      czas1= System.currentTimeMillis()-czas0;
  //    System.out.println(czas2);
       System.out.println(czas1-czas2);
       
        czas0=System.currentTimeMillis();
      ar.get((ar.size()/2));
      czas1= System.currentTimeMillis()-czas0;
   //   System.out.println(czas1);
      czas0=System.currentTimeMillis();
      link.get((link.size()/2));
      czas1= System.currentTimeMillis()-czas0;
     // System.out.println(czas2);
       System.out.println(czas1-czas2);
     }
    }
    //linked szybsza dla środkowego
}
