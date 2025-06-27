package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String Status){
        //logging
        //authenticaton & authorization
        //sanitize the data
        System.out.println("checkout method from shoppingcart called");
    }

    public int quantity(){
        return 2;
    }
}
