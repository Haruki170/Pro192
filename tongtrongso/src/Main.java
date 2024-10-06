
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Haruki
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements
        int n = scanner.nextInt();
        int[] a = new int[n];

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Create an object of the Mang class and calculate the weight
        Mang mang = new Mang(a);
        long trongSo = mang.tinhTrongSo();

        // Print the result
        System.out.println(trongSo);

        scanner.close();
    }
    
}
