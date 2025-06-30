package demo;

import org.springframework.stereotype.Service;

@Service
public class refundService {
    public void processRefund() {
        System.out.println("Processing Refund (CGLIB Proxy)");
    }
}

