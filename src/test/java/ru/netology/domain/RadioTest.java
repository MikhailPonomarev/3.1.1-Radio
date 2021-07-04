package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class RadioTest {

    @Test
    public void middleStationLowerThanExpected() {
        Radio radio = new Radio();

        radio.setMiddleStation(3);

        int expected = 0;
        int actual = radio.getMiddleStation();
        assertEquals(expected, actual);
    }

    @Test
    public void middleStationHigherThanExpected() {
        Radio radio = new Radio();

        radio.setMiddleStation(5);

        int expected = 0;
        int actual = radio.getMiddleStation();
        assertEquals(expected, actual);
    }

    @Test
    public void middleStationMustBe4() {
        Radio radio = new Radio();

        radio.setMiddleStation(4);

        int expected = (0 + 9) / 2;
        int actual = radio.getMiddleStation();
        assertEquals(expected, actual);
    }

    @Test
    public void currentStationInInitialRange() {
        Radio radio = new Radio();

        radio.setCurrentStation(3);

        int expected = 3;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }


//    @Test
//    public void currentStationLowerThanAvailable() {
//        Radio radio = new Radio();
//        radio.setMinStation(0);
//        radio.setMaxStation(9);
//
//        radio.setCurrentStation(-1);
//
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//
//        assertEquals(expected, actual);
//
//    }
//
//    @Test
//    public void currentStationHigherThanAvailable() {
//        Radio radio = new Radio();
//        radio.setMinStation(0);
//        radio.setMaxStation(9);
//
//        radio.setCurrentStation(10);
//
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//
//        assertEquals(expected, actual);
//    }

    @Test
    public void minStationMustBeZero() { //минимальная станция должна быть №0
        Radio radio = new Radio();

        radio.setMinStation(0);

        int expected = 0;
        int actual = radio.getMinStation();

        assertEquals(expected, actual);
    }

    @Test
    public void minStationLowerThanExpected() {
        Radio radio = new Radio();

        radio.setMinStation(-1);

        int expected = 0;
        int actual = radio.getMinStation();

        assertEquals(expected, actual);
    }

    @Test
    public void minStationHigherThanExpected() {
        Radio radio = new Radio();

        radio.setMinStation(1);

        int expected = 0;
        int actual = radio.getMinStation();

        assertEquals(expected, actual);
    }

    @Test
    public void maxStationMustBe9() { //максимальная радиостанция должна быть №9
        Radio radio = new Radio();

        radio.setMaxStation(9);

        int expected = 9;
        int actual = radio.getMaxStation();

        assertEquals(expected, actual);
    }

    @Test
    public void maxStationLowerThanExpected() {
        Radio radio = new Radio();

        radio.setMaxStation(8);

        int expected = 9;
        int actual = radio.getMaxStation();

        assertEquals(expected, actual);
    }

    @Test
    public void maxStationHigherThanExpected() {
        Radio radio = new Radio();

        radio.setMaxStation(10);

        int expected = 9;
        int actual = radio.getMaxStation();

        assertEquals(expected, actual);
    }


}