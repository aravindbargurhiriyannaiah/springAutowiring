package com.funkyganesha.autowiring.services;

public class EnglishGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "Hello World!";
    }
}
