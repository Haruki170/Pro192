/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import DTO.Item;
import DTO.Painting;
import DTO.Statue;
import DTO.Vase;

/**
 *
 * @author Haruki
 */
public class AntiqueShop {
    public static void main(String[] args) {
        String[] options = {"Create a Vase", "Create a Statue", "Create a Painting", "Display the item"};
        Item item = null;
        int choice;

        do {
            choice = Menu.getChoice(options);
            switch (choice) {
                case 1:
                    item = new Vase();
                    ((Vase) item).inputVase();
                    break;
                case 2:
                    item = new Statue();
                    ((Statue) item).inputStatue();
                    break;
                case 3:
                    item = new Painting();
                    ((Painting) item).inputPainting();
                    break;
                case 4:
                    if (item != null) {
                        if (item instanceof Vase)
                            ((Vase) item).outputVase();
                        else if (item instanceof Statue)
                            ((Statue) item).outputStatue();
                        else if (item instanceof Painting)
                            ((Painting) item).outputPainting();
                    } else {
                        System.out.println("You need to create an item first.");
                    }
                    break;
            }
        } while (choice <= 4);
    }
}
