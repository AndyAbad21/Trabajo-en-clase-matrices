/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ups.edu.ec.clase2;
import java.util.Scanner;
/**
 *
 * @author PC-13
 */
public class Clase2 {

    public static void main(String[] args) 
    {
        Scanner scanner=new Scanner(System.in);
        /*System.out.println("Ingrese un numero: ");
        String cadena=scanner.next();
        PrincipalScanner ps=new PrincipalScanner();
        if(ps.calcularConFor(cadena)==true)
        {
            System.out.println("Todos los numeros de la cadena son numeros");
        }else{
            System.out.println("No todos lo numeros de la cadena son numeros");
        }*/
        //Ingreso de el numero de filas y columnas de las dos matrices
       Arreglo a=new Arreglo();
       int numf;
       int numc;
       System.out.println("ingrese el numero de filas de matriz 1 ");
       numf=scanner.nextInt();
       System.out.println("Ingrese el numero de columnas de matriz 1"+"\n");
       numc=scanner.nextInt();
       System.out.println("");
       
       int[][] matrizf1=a.crearMatriz(numf, numc);
       System.out.println("MATRIZ 1");
       for(int i=0; i<numf; i++)
       {
           for(int j=0; j<numc; j++)
           {
              System.out.print(matrizf1[i][j]+" ");
           }
           System.out.println("");
       }
       System.out.println("");
       
       System.out.println("ingrese el numero de filas de matriz 2 ");
       numf=scanner.nextInt();
       System.out.println("Ingrese el numero de columnas de matriz 2");
       numc=scanner.nextInt();
       System.out.println("");
       
       int[][] matrizf2=a.crearMatriz(numf, numc);
       System.out.println("MATRIZ 2");
       for(int i=0; i<numf; i++)
       {
           for(int j=0; j<numc; j++)
           {
              System.out.print(matrizf2[i][j]+" ");
           }
           System.out.println("");
       }
       System.out.println("");
       
       //Calculo de la suma de las dos matrices
       System.out.println("La matris resultante es: ");
       int[][] matrizs=a.sumarMatrices(matrizf1, matrizf2);
       for(int i=0; i<matrizs.length; i++)
       {
           for(int j=0; j<matrizs[0].length; j++)
           {
               System.out.print(matrizs[i][j]+"  ");
           }
           System.out.println("");
       }
       System.out.println("");
      
       //Ingreso de tamanio del vector
       System.out.println("Ingrese el tamanio de vector 1: ");
       System.out.println("");
       numf=scanner.nextInt();
       int[] vector1=a.crearVector(numf);
       System.out.println("VECTOR 1");
       for(int i=0; i<vector1.length; i++)
       {
           System.out.print(vector1[i]+" ");
       }
       System.out.println("\n");
       
       System.out.println("Ingrese el tamanio de vector 2: ");
       System.out.println("");
       numf=scanner.nextInt();
       int[] vector2=a.crearVector(numf);
       System.out.println("VECTOR 2");
       for(int i=0; i<vector2.length; i++)
       {
           System.out.print(vector2[i]+" ");
       }
       System.out.println("\n");
       
       System.out.println("Vector resultante : ");
       int[] vectorf=a.sumarVectores(vector1, vector2);
       for(int i=0; i<numf; i++)
       {
           System.out.print(vectorf[i]+" ");
       }
       System.out.println("\n");
    }
}
