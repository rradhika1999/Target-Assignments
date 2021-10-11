package Session7.ShoppingCart;

import java.util.Scanner;
import java.util.logging.Logger;

// Demonstration of inheritance in Java
public class ProcessingAmountAccToCategory implements ProcessingAmount
{
    // Declaration and initialization of variables
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    int selection, total_amt, amt, no_of_items, no_of_sofa = 5, no_of_table = 5, no_of_spices = 5, no_of_oranges = 10, no_of_Bluetooth_Speaker = 5, no_of_television = 5,total = 0;
    int price_of_sofa = 50000, price_of_table = 25000, price_of_spice = 250, price_of_orange = 15, price_of_Bluetooth_Speaker = 7000, price_of_television = 90000;
    
    // Method definition to process amount for furniture
    public int ProcessTheAmountForFurniture(int selection)throws Exception
    {
        Scanner s = new Scanner(System.in);
        if(selection == 1)
        {
            System.out.print("Enter the count you want to buy from the selection: ");
            no_of_items = s.nextInt();
            if (no_of_items>0 && no_of_items<=no_of_sofa)
            {
                no_of_sofa = no_of_sofa - no_of_items;
                total += price_of_sofa*no_of_items;
            }
            else
            {
                LOGGER.warning("The specified number of items aren't available for the product! Sorry for the inconvinence");
                System.out.println("Item is out of stock! Sorry for the inconvenience");
            }
        }
        else if(selection == 2)
        {
            System.out.print("Enter the count you want to buy from the selection: ");
            no_of_items = s.nextInt();
            if (no_of_items>0 && no_of_items<=no_of_table)
            {
                no_of_table = no_of_table - no_of_items;
                total += price_of_table*no_of_items;
            }
            else
            {
                LOGGER.warning("The specified number of items aren't available for the product! Sorry for the inconvinence");
                System.out.println("Item is out of stock! Sorry for the inconvenience");
            }
        }
        else
        {
            throw new Exception("Kindly choose a number form the menu provided");
        }
        return total;
    }
    
    // Method definition to process amount for groceries
    public int ProcessTheAmountForGroceries(int selection) throws Exception {
        Scanner s = new Scanner(System.in);
        if(selection == 1)
        {
            System.out.print("Enter the count you want to buy from the selection: ");
            no_of_items = s.nextInt();
            if (no_of_items>0 && no_of_items<=no_of_spices)
            {
                no_of_spices = no_of_spices - no_of_items;
                total += price_of_spice*no_of_items;
            }
            else
            {
                LOGGER.warning("The specified number of items aren't available for the product! Sorry for the inconvinence");
                System.out.println("Item is out of stock! Sorry for the inconvenience");
            }
        }
        else if(selection == 2)
        {
            System.out.print("Enter the count you want to buy from the selection: ");
            no_of_items = s.nextInt();
            if (no_of_items>0 && no_of_items<=no_of_oranges)
            {
                no_of_oranges = no_of_oranges - no_of_items;
                total += price_of_orange*no_of_items;
            }
            else
            {
                LOGGER.warning("The specified number of items aren't available for the product! Sorry for the inconvinence");
                System.out.println("Item is out of stock! Sorry for the inconvenience");
            }
        }
        else
        {
            throw new Exception("Kindly choose a number form the menu provided");
        }
        return total;
    }
    
    // Method definition to process amount for Electronics
    public int ProcessTheAmountForElectronics(int selection) throws Exception
    {
        Scanner s = new Scanner(System.in);
        if(selection == 1)
        {
            System.out.print("Enter the count you want to buy from the selection: ");
            no_of_items = s.nextInt();
            if (no_of_items>0 && no_of_items<=no_of_Bluetooth_Speaker)
            {
                no_of_Bluetooth_Speaker = no_of_Bluetooth_Speaker - no_of_items;
                total += price_of_Bluetooth_Speaker*no_of_items;
            }
            else
            {
                LOGGER.warning("The specified number of items aren't available for the product! Sorry for the inconvinence");
                System.out.println("Item is out of stock! Sorry for the inconvenience");
            }
        }
        else if(selection == 2)
        {
            System.out.print("Enter the count you want to buy from the selection: ");
            no_of_items = s.nextInt();
            if (no_of_items>0 && no_of_items<=no_of_television)
            {
                no_of_television = no_of_television- no_of_items;
                total += price_of_television*no_of_items;
            }
            else
            {
                LOGGER.warning("The specified number of items aren't available for the product! Sorry for the inconvinence");
                System.out.println("Item is out of stock! Sorry for the inconvenience");
            }
        }
        else
        {
            LOGGER.warning("Kindly stick to the numbers given in the menu");
            throw new Exception("Kindly choose a number form the menu provided");
        }
        return total;
    }
}
