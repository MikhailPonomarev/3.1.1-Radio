package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void shouldUseAllArgsConstructor() {
        Radio radio = new Radio(8, 10);
        assertEquals(8, radio.getStationsAmount());
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldUseNoArgsConstructor() {
        Radio radio = new Radio();
        assertEquals(15, radio.getCurrentVolume());
        assertEquals(10, radio.getStationsAmount());
    }

    @Test
    public void middleStationLowerThanExpected() {
        Radio radio = new Radio();

        radio.setMiddleStation(4);

        int expected = 0;
        int actual = radio.getMiddleStation();
        assertEquals(expected, actual);
    }

    @Test
    public void middleStationHigherThanExpected() {
        Radio radio = new Radio();

        radio.setMiddleStation(6);

        int expected = 0;
        int actual = radio.getMiddleStation();
        assertEquals(expected, actual);
    }

    @Test
    public void middleStationMustBe5() {
        Radio radio = new Radio();

        radio.setMiddleStation(5);

        int expected = (0 + 10) / 2;
        int actual = radio.getMiddleStation();
        assertEquals(expected, actual);
    }

    @Test
    public void currentStationInInitialRange() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    //если текущая станция < минимальной, то должна переключиться на максимальную
    @Test
    public void ifCurrentStationLower() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 10;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);

    }

    //если текущая станция > максимальной, то должна переключиться на минимальную
    @Test
    public void ifCurrentStationHigher() {
        Radio radio = new Radio();

        radio.setCurrentStation(11);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    //минимальная станция должна быть №0
    @Test
    public void minStationMustBeZero() {
        Radio radio = new Radio();

        radio.setMinStation(1);

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

    //максимальная радиостанция должна быть №10
    @Test
    public void maxStationMustBe10() {
        Radio radio = new Radio();

        radio.setMaxStation(10);

        int expected = 10;
        int actual = radio.getMaxStation();

        assertEquals(expected, actual);
    }

    @Test
    public void maxStationLowerThanExpected() {
        Radio radio = new Radio();

        radio.setMaxStation(9);

        int expected = 10;
        int actual = radio.getMaxStation();

        assertEquals(expected, actual);
    }

    @Test
    public void maxStationHigherThanExpected() {
        Radio radio = new Radio();

        radio.setMaxStation(11);

        int expected = 10;
        int actual = radio.getMaxStation();

        assertEquals(expected, actual);
    }

    @Test
    public void currentVolumeInInitialRange() {
        Radio radio = new Radio(10, 50);

        assertEquals(50, radio.getCurrentVolume());
    }

//    @Test
//    public void currentVolumeLowerThanAvailable() {
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(-1);
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void currentVolumeHigherThanAvailable() {
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(11);
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void minVolumeMustBeZero() { //минимальная громкость должна быть = 0
//        Radio radio = new Radio();
//
//        radio.setMinVolume(0);
//
//        int expected = 0;
//        int actual = radio.getMinVolume();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void minVolumeLowerThanExpected() {
//        Radio radio = new Radio();
//
//        radio.setMinVolume(-1);
//
//        int expected = 0;
//        int actual = radio.getMinVolume();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void minVolumeHigherThanExpected() {
//        Radio radio = new Radio();
//
//        radio.setMinVolume(1);
//
//        int expected = 0;
//        int actual = radio.getMinVolume();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void maxVolumeMustBe10() { //максимальная громкость должна быть = 10
//        Radio radio = new Radio();
//
//        radio.setMaxVolume(10);
//
//        int expected = 10;
//        int actual = radio.getMaxVolume();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void maxVolumeLowerThanExpected() {
//        Radio radio = new Radio();
//
//        radio.setMaxVolume(9);
//
//        int expected = 10;
//        int actual = radio.getMaxVolume();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void maxVolumeHigherThanExpected() {
//        Radio radio = new Radio();
//
//        radio.setMaxVolume(11);
//
//        int expected = 10;
//        int actual = radio.getMaxVolume();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void switchingStationToNext() {
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(0);
//        radio.nextStation();
//
//        int expected = 1;
//        int actual = radio.getCurrentStation();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void nextStationOverThanAvailable() {
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(9);
//        radio.nextStation();
//
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void switchingStationToPrevious() {
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(9);
//        radio.prevStation();
//
//        int expected = 8;
//        int actual = radio.getCurrentStation();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void prevStationLowerThanAvailable() {
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(0);
//        radio.prevStation();
//
//        int expected = 9;
//        int actual = radio.getCurrentStation();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void increasingVolume() {
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(9);
//        radio.increaseVolume();
//
//        int expected = 10;
//        int actual = radio.getCurrentVolume();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void highestVolumeMustBe10() { //максимальная громкость должна быть = 10
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(10);
//        radio.increaseVolume();
//
//        int expected = 10;
//        int actual = radio.getCurrentVolume();
//
//        assertEquals(expected, actual);
//    }
//
//
//    @Test
//    public void decreasingVolume() {
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(1);
//        radio.decreaseVolume();
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void lowestVolumeMustBeZero() { //минимальная громкость должна быть = 0
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(0);
//        radio.decreaseVolume();
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//
//        assertEquals(expected, actual);
//    }

}