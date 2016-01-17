/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kamildo
 */
public class FunkcjaKwadratowa {
    private double a;
    private double b;
    private double c;
    
    public FunkcjaKwadratowa(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double gety(double x) {

        return Math.pow(x, 2) * this.a + this.b * x + this.c;

    }

    public int liczba_pierwiastkow() {
        double delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
        if (delta > 0) {
            return 2;
        } else if (delta == 0) {
            return 1;
        } else {
            return 0;
        }

    }

    public double[] wypiszMiejscaZerowe() {
        int liczbapi=this.liczba_pierwiastkow();
        
        if(liczbapi==0)
        {
        System.out.println("brak");
        return null;
        }
        else if(liczbapi==1){
            double[] a=new double[1];
            a[0]=(-this.b/(2*this.a));
            System.out.println((-this.b/(2*this.a)));
            return a;
        }
        else {
           double[] a=new double[2];
        double pdelta=Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c);
        a[0]=((-this.b+pdelta)/(2*this.a));
        a[1]=((-this.b-pdelta)/(2*this.a));
        System.out.println(((-this.b+pdelta)/(2*this.a))+" "+((-this.b-pdelta)/(2*this.a)));
        return a;
        }
    }
  
}
