/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author Haruki
 */
public class Item {
    protected int value;
    protected String creator;
    
    public Item() {
        value = 0;
        creator = "";
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void output() {
        System.out.println(this.getClass().getName());
        System.out.println("\tValue: "+ value);
        System.out.println("Creator: " + creator);
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        int valueInput;
        String creatorInput;
        do {
            System.out.print("Value: ");
            valueInput = sc.nextInt(); sc.nextLine();
            System.out.print("Creator: ");
            creatorInput = sc.nextLine();
        } while (valueInput <= 0 || creatorInput.equals(""));
        
        this.value = valueInput;
        this.creator = creatorInput;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ": value=" + value + ", creator=" + creator;
    }
}
