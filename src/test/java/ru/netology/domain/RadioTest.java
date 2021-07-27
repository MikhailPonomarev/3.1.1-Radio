package ru.netology.domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void shouldUseAllArgsConstructor() {
        Radio radio = new Radio(10,5,0,10,34,0,100,10);
        assertEquals(10, radio.getCurrentStation());
        assertEquals(5, radio.getMiddleStation());
        assertEquals(0, radio.getMinStation());
        assertEquals(10, radio.getMaxStation());
        assertEquals(34, radio.getCurrentVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(100, radio.getMaxVolume());
        assertEquals(10, radio.getStationsAmount());
    }

    @Test
    public void shouldUseNoArgsConstructor() {
        Radio radio = new Radio();
        assertEquals(10, radio.getCurrentStation());
        assertEquals(5, radio.getMiddleStation());
        assertEquals(0, radio.getMinStation());
        assertEquals(10, radio.getMaxStation());
        assertEquals(0, radio.getCurrentVolume());
        assertEquals(0, radio.getMinVolume());
        assertEquals(100, radio.getMaxVolume());
        assertEquals(10, radio.getStationsAmount());
    }
}