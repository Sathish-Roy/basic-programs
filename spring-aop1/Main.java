package demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Main {
    public static void main(String []args){
        ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
        ShoppingCart cart=context.getBean(ShoppingCart.class);
        cart.checkout("Cancelled");
    }
}
