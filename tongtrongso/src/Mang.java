/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Haruki
 */
public class Mang {
    private int[] a;  // Array of integers
    private final long MOD = 1000000007;  // Modulo constant

    // Constructor to initialize the array
    public Mang(int[] a) {
        this.a = a;
    }

    // Method to calculate the weight of the array
    public long tinhTrongSo() {
        long totalWeight = 0;
        int countOdd = 0;  // Count of odd numbers
        int countEven = 0; // Count of even numbers

        // Count the number of odd and even numbers
        for (int num : a) {
            if (num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        // Calculate the total weight (number of odd * number of even)
        totalWeight = (long) countOdd * countEven % MOD;

        return totalWeight;
    }
}
