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

        System.out.print("IngresenumA: ");
        int numA = scanner.nextInt();

        System.out.print("Ingrese numB: ");
        int numB = scanner.nextInt();

        boolean mismoSigno = (numA > 0 && numB > 0) || (numA < 0 && numB < 0);
        System.out.println(mismoSigno);
    }
}

