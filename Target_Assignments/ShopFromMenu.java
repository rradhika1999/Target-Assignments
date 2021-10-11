package Session7.ShoppingCart;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ShopFromMenu
{
    int choice, selection, amt;
    float total_amt;
    public static Queue<String> items = new LinkedList<>();
    ShoppingMain m = new ShoppingMain();
    public void Display() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("CATEGORIES: ");
        System.out.println("1. Furniture");
        System.out.println("2. Groceries");
        System.out.println("3. Electronics");
        System.out.println("Choose a category by entering the number: ");
        choice = sc.nextInt();
        DisplayChoice(choice);
    }
    public void ContinueShopping() throws Exception {
        //total_amt += amt;
        Scanner s = new Scanner(System.in);
        System.out.println("1.To continue shopping and add items to cart type YES\n"+
                "2.To continue shopping and remove items from cart type NO\n"+
                "3. To get the preview of items press 3\n"+
                "4.To quit type q");
        String answer = s.nextLine();
        if (answer.equals("YES"))
        {
            System.out.println("Taking u to display class");
            Display();
        }
        else if (answer.equals("NO"))
        {
            ShoppingMain m = new ShoppingMain();
            m.removeItemToCart(items);
        }
        else if (answer.equals("3"))
        {
            m.previewOfItems(items);
        }
        else if (answer.equals("q"))
        {
            m.quit(total_amt);
        }
    }
    public void ContinueShopping(int amt) throws Exception {
        total_amt += amt;
        Scanner s = new Scanner(System.in);
        System.out.println("1.To continue shopping and add items to cart type YES\n"+
                           "2.To continue shopping and remove items from cart type NO\n"+
                           "3. To get the preview of items press 3\n"+
                           "4.To quit type q");
        String answer = s.nextLine();
        if (answer.equals("YES"))
        {
            System.out.println("Taking u to display class");
            Display();
        }
        else if (answer.equals("NO"))
        {
            ShoppingMain m = new ShoppingMain();
            m.removeItemToCart(items);
        }
        else if (answer.equals("3"))
        {
            m.previewOfItems(items);
        }
        else if (answer.equals("q"))
        {
            m.quit(total_amt);
        }
    }
    public void DisplayChoice(int choice) throws Exception
    {
        Scanner s = new Scanner(System.in);
        switch (choice)
        {
            case 1:
                System.out.println("Kindly select the item you are looking for: ");
                System.out.println("OPTIONS: ");
                System.out.println("1. Sofa");
                System.out.println("2. Table");
                System.out.println("Choose an item by entering the number: ");
                selection = s.nextInt();
                if(selection == 1)
                {
                    items.add("Sofa");
                }
                else if(selection == 2)
                {
                    items.add("Table");
                }
                ProcessingAmountAccToCategory p = new ProcessingAmountAccToCategory();
                amt = p.ProcessTheAmountForFurniture(selection);
                ContinueShopping(amt);
                break;
            case 2:
                System.out.println("Kindly select the item you are looking for: ");
                System.out.println("OPTIONS: ");
                System.out.println("1. Spices");
                System.out.println("2. Oranges");
                System.out.println("Choose an item by entering the number: ");
                selection = s.nextInt();
                if(selection == 1)
                {
                    items.add("Spices");
                }
                else if(selection == 2)
                {
                    items.add("Oranges");
                }
                ProcessingAmountAccToCategory p1 = new ProcessingAmountAccToCategory();
                amt = p1.ProcessTheAmountForGroceries(selection);
                ContinueShopping(amt);
                break;
            case 3:
                System.out.println("Kindly select the item you are looking for: ");
                System.out.println("OPTIONS: ");
                System.out.println("1. Bluetooth Speaker");
                System.out.println("2. Television");
                System.out.println("Choose an item by entering the number: ");
                selection = s.nextInt();
                if(selection == 1)
                {
                    items.add("Bluetooth Speaker");
                }
                else if(selection == 2)
                {
                    items.add("Television");
                }
                ProcessingAmountAccToCategory p2 = new ProcessingAmountAccToCategory();
                amt = p2.ProcessTheAmountForGroceries(selection);
                ContinueShopping(amt);
                break;
            default:
                System.out.println("Kindly choose a number form the menu provided");

        }
    }
}
