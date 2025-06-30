package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = false) // Use JDK by default
public class SpringAopProxyDemoApp implements CommandLineRunner {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private refundService refundService;

    @Autowired
    private SelfCallService selfCallService;

    public static void main(String[] args) {
        SpringApplication.run(SpringAopProxyDemoApp.class, args);
    }

    @Override
    public void run(String... args) {
        paymentService.makePayment();
        refundService.processRefund();
        selfCallService.outerMethod();
    }
}

