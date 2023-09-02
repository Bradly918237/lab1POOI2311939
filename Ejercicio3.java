/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("numero A: ");
        int numA = scanner.nextInt();

        System.out.print("Ingresenumero B: ");
        int numB = scanner.nextInt();

        boolean ambosPositivos = numA > 0 && numB > 0;
        System.out.println(ambosPositivos);
    }
}
