package Session7.ShoppingCart;

import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Logger;

public class ShoppingMain implements ShoppingCartFunctionalities
{
    //ShopFromMenu s = new ShopFromMenu();
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    int flag = 0;
    Scanner sc = new Scanner(System.in);
    String item_to_be_removed;
    @Override
    public void addItemToCart() throws Exception
    {
        new ShopFromMenu().Display();
    }

    @Override
    public void removeItemToCart(Queue items) throws Exception {
        System.out.println("Enter the name of the item you want to remove:");
        item_to_be_removed = sc.next();
        LOGGER.info("Beginning the process of removing the sepecified item from cart");
        for(Object i: items)
        {
            if(i.equals(item_to_be_removed))
            {
                items.remove(i);
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("Item has successfully been removed!");
            new ShopFromMenu().ContinueShopping();
        }
        else
        {
            System.out.println("No such item exists in Your cart. Kindly check again");
            new ShopFromMenu().ContinueShopping();
        }
    }

    @Override
    public void previewOfItems(Queue items) throws Exception {
        LOGGER.info("Previewing the item/items from cart");
        System.out.println(items);
        new ShopFromMenu().ContinueShopping();
    }

    @Override
    public void quit(float total_amt)
    {
        LOGGER.info("Logging out!");
        System.out.println("Amount: " + total_amt);
    }
}
