package demo;

import org.springframework.stereotype.Service;

@Service
public class SelfCallService {

    public void outerMethod() {
        System.out.println("Called outerMethod");
        innerMethod(); // Self-invocation: This will NOT be intercepted by AOP
    }

    public void innerMethod() {
        System.out.println("Called innerMethod (should have been logged by AOP, but won't)");
    }
}

