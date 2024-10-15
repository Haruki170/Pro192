/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import DTO.Item;
import DTO.Painting;
import DTO.ItemList;
import DTO.Statue;
import DTO.Vase;
import java.util.Scanner;

/**
 *
 * @author Haruki
 */
public class AntiqueShop2 {
    public static void main(String[] a) {
        ItemList obj = new ItemList();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Add a new vase");
            System.out.println("2. Add a new statue");
            System.out.println("3. Add a new painting");
            System.out.println("4. Display all items");
            System.out.println("5. Find the items by the creator");
            System.out.println("6. Update the item by its index");
            System.out.println("7. Remove the item by its index");
            System.out.println("8. Display the list of items by type");
            System.out.println("9. Sorts items in ascending in order based on their values");
            System.out.println("10. Exit");
            System.out.println("Input your choice: ");
            choice=sc.nextInt();
            switch(choice) {
                case 1:
                    Item tmp = new Vase();
                    tmp.input();
                    if (obj.addItem(tmp)) {
                        System.out.println("Added");
                    }
                    break;
                case 2:
                    Item tmp2 = new Statue();
                    tmp2.input();
                    if (obj.addItem(tmp2)) {
                        System.out.println("Added");
                    }
                    break;
                case 3:
                    Item tmp3 = new Painting();
                    tmp3.input();
                    if (obj.addItem(tmp3)) {
                        System.out.println("Added");
                    }
                    break;
                case 4:
                    obj.displayAll();
                    break;
                case 5:
                    System.out.println("Input creator: ");
                    String creator = sc.nextLine(); sc.nextLine();
                    Item result=obj.findItem(creator);
                    if( result==null) System.out.println("Not found");
                    else System.out.println("The item is found " + result);
                    break;
                case 6:
                    System.out.println("Input index: ");
                    int index1 = sc.nextInt(); sc.nextLine();
                    if( obj.updateItem(index1)){
                        System.out.println("After updating: ");
                        obj.displayAll();
                    }
                    else System.out.println("Can not update the item");
                    break;
                case 7:
                    System.out.println("Input index: ");
                    int index2 = sc.nextInt(); sc.nextLine();
                    if( obj.removeItem(index2)){
                        System.out.println("After removing: ");
                        obj.displayAll();
                    }
                    else System.out.println("Can not remove the item");
                    break;
                case 8:
                    System.out.println("Input type: ");
                    String type = sc.nextLine(); sc.nextLine();
                    obj.displayItemByType(type);
                    break;
                case 9:
                    obj.sortItems();
                    obj.displayAll();
                    break;
            }
        } while (choice <= 9);
    }
}
