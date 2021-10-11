package Session7.ShoppingCart;

import java.util.Queue;

public interface ShoppingCartFunctionalities
{
    void addItemToCart() throws Exception;
    void removeItemToCart(Queue items) throws Exception;
    void previewOfItems(Queue items) throws Exception;
    void quit(float total_amt);
}
