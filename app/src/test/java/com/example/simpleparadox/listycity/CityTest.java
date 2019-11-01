package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CityTest {
    @Test
    void testGetCityPopulation(){
        City c = new City("City", "Province");
        assertEquals(c.getPopulation(), 0);
    }
}
