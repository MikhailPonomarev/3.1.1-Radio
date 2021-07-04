package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test
    public void middleStationInInitialRange() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);

        radio.setMiddleStation(4);

        int expected = 4;
        int actual = radio.getMiddleStation();
        assertEquals(expected, actual);
    }

    @Test
    public void middleStationLowerThanExpected() {
        Radio radio = new Radio();

        radio.setMiddleStation(3);

        int expected = 4;
        int actual = radio.getMiddleStation();
        assertEquals(expected, actual);

        radio.setMiddleStation(5);

        assertEquals(expected, actual);
    }

    @Test
    public void middleStationHigherThanExpected() {
        Radio radio = new Radio();

        radio.setMiddleStation(5);

        int expected = 4;
        int actual = radio.getMiddleStation();
        assertEquals(expected, actual);
    }

//    @Test
//    public void currentStationInInitialRange() {
//        Radio radio = new Radio();
//        radio.setMinStation(0);
//        radio.setMaxStation(9);
//
//        radio.setCurrentStation(4);
//
//        int expected = 4;
//        int actual = radio.getCurrentStation();
//        assertEquals(expected, actual);
//    }

    @Test
    public void currentStationLowerThanAvailable() {
        Radio radio = new Radio();
        radio.setMinStation(0);
        radio.setMaxStation(9);

        radio.setCurrentStation(-1);
        int expected = -1;
        int actual = radio.getCurrentStation();

    }
//    @Test
//    public void minStationInInitialRange() {
//        Radio radio = new Radio();
//        radio.minStation = 0;
//        radio.maxStation = 9;
//
//        radio.setMinStation();
//
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void maxStationInInitialRange() {
//        Radio radio = new Radio();
//        radio.minStation = 0;
//        radio.maxStation = 9;
//
//        radio.setMaxStation();
//    }
//}
}