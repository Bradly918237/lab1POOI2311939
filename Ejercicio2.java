/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        int numero;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        numero = leer.nextInt();
        
        if(numero > 0 && numero%2 != 0){
            System.out.println("true");    
        
        }
    }
}