package com.funkyganesha.autowiring.services;

public class FrenchGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "Bonjour Monde!";
    }
}
