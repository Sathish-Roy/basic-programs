package demo;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImp implements PaymentService {
    @Override
    public void makePayment() {
        System.out.println("Processing Payment (JDK Proxy)");
    }
}

