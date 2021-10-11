package Session7.ShoppingCart;

public interface ProcessingAmount
{
    int ProcessTheAmountForFurniture(int a) throws Exception;
    int ProcessTheAmountForGroceries(int b) throws Exception;
    int ProcessTheAmountForElectronics(int c) throws Exception;
}
