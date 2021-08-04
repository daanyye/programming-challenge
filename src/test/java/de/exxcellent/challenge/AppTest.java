package de.exxcellent.challenge;

import org.junit.jupiter.api.Test;

/**
    * Tests the two possible tasks in the main function
*/
class AppTest {

    /**
        * Tests the Weather Task
    */
    @Test
    void RunWeather() {
        App.main("--weather", "src/main/resources/de/exxcellent/challenge/weather.csv");
    }

    /**
        * Tests the Football Task
    */
    @Test
    void RunFootball() {
        App.main("--football", "src/main/resources/de/exxcellent/challenge/football.csv");
    }
}