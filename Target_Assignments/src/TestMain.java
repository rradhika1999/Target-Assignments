package Session7.ShoppingCart;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TestMain
{
    public static void main(String[] args) throws Exception
    {
        Queue<String> items = new LinkedList<>();
        float a = 0;
        ShoppingMain m = new ShoppingMain();
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("a - Add item to cart");
        System.out.println("b - Remove item from cart");
        System.out.println("c - Preview of Items");
        System.out.println("d - Quit");
        System.out.println();
        System.out.println("Choose and option:");
        char input = sc.next().charAt(0);
        if(input == 'a')
        {
            m.addItemToCart();
        }
        else if(input == 'b')
        {
            m.removeItemToCart(items);
        }
        else if(input == 'c')
        {
            m.previewOfItems(items);
        }
        else if(input == 'd')
        {
            m.quit(a);
        }
    }
}
