package de.exxcellent.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Example JUnit 5 test case.
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
class AppTest {

    @BeforeEach
    void SetUp() {
    }

    @Test
    void RunWeather() {
        App.main("--weather", "src/main/resources/de/exxcellent/challenge/weather.csv");
    }

    @Test
    void RunFootball() {
        App.main("--football", "src/main/resources/de/exxcellent/challenge/football.csv");
    }
}