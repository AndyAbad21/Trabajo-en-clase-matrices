/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.clase2;

/**
 *
 * @author PC-13
 */
public class Arreglo
{
   /* boolean llave=true;
    public boolean calcularConFor(String cadena)
    {
        for(int i=0; i<cadena.length(); i++)
        {
            if(!Character.isDigit(cadena.charAt(i)))
            {
                return llave=false;
                break;
            }
        }
        return llave;
    }
    public boolean calcularConWhile(String cadena)
    {
        boolean llave=true;
        int i=0;
        while(i<4)
        {
            if(!Character.isDigit(cadena.charAt(i)))
            {
                return llave=false;
                break;
            }
            i=i+1;
        }
        return llave;
    }
    public boolean esNumero()
    {
        boolean llave=true;
        int i=0;
        char[] vector=new char[3];
        while(i<4){
            
        }  
        return llave;
    }*/
   public int[][] crearMatriz(int numf, int numc)
   {
       int[][] matriz=new int[numf][numc];
       int e=0;
       for(int i=0; i<numf; i++)
       {
           for(int j=0; j<numc; j++)
           {
               double n=Math.random();
               if(n>=0.0 && n<=0.1)
                   e=0;
               if(n>=0.1 && n<=0.2)
                   e=1;
               if(n>=0.2 && n<=0.3)
                   e=2;
               if(n>=0.3 && n<=0.4)
                   e=3;
               if(n>=0.4 && n<=0.5)
                   e=4;
               if(n>=0.5 && n<=0.6)
                   e=5;
               if(n>=0.6 && n<=0.7)
                   e=6;
               if(n>=0.7 && n<=0.8)
                   e=7;
               if(n>=0.8 && n<=0.9)
                   e=8;
               if(n>=0.9 && n<=1.0)
                   e=9;
               matriz[i][j]=e;
           }
       }
       return matriz;
   }
   public int[][] sumarMatrices(int[][] m1, int[][] m2)
   {
       int[][] matrizf=new int[m1.length][m1[0].length];
       for(int i=0; i<m1.length; i++)
       {
           for(int j=0; j<m1[0].length; j++)
           {
               matrizf[i][j]=m1[i][j]+m2[i][j];
           }
       }
       return matrizf;
   }
   public int[] crearVector(int f)
   {
        int[] vector=new int[f];
        int e=0;
        for(int i=0; i<f; i++)
        {
            double n=Math.random();
            if(n>=0.0 && n<=0.1)
                e=0;
            if(n>=0.1 && n<=0.2)
                e=1;
            if(n>=0.2 && n<=0.3)
                e=2;
            if(n>=0.3 && n<=0.4)
                e=3;
            if(n>=0.4 && n<=0.5)
                e=4;
            if(n>=0.5 && n<=0.6)
                e=5;
            if(n>=0.6 && n<=0.7)
                e=6;
            if(n>=0.7 && n<=0.8)
                e=7;
            if(n>=0.8 && n<=0.9)
                e=8;
            if(n>=0.9 && n<=1.0)
                e=9;
            vector[i]=e;
        }
        
        return vector;
   }
   public int[] sumarVectores(int[] v1, int[] v2)
   {
       int[] vectorf=new int[v1.length];
       for(int i=0; i<v1.length; i++)
       {
           vectorf[i]=v1[i]+v2[i];
       }
       return vectorf;
   }
}
