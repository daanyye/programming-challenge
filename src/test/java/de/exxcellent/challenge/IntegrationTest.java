package de.exxcellent.challenge;

import de.exxcellent.challenge.analyzer.FootballDataAnalyzer;
import de.exxcellent.challenge.analyzer.WeatherDataAnalyzer;
import de.exxcellent.challenge.models.FootballData;
import de.exxcellent.challenge.models.WeatherData;
import de.exxcellent.challenge.readers.CSVDataReader;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegrationTest 
{
    private WeatherDataAnalyzer WeatherDataAnalyzer;
    private FootballDataAnalyzer FootballDataAnalyzer;

    private CSVDataReader CsvDataReader;

    @BeforeEach
    void SetUp()
    {
        CsvDataReader = new CSVDataReader();
        List<WeatherData> weatherData = CsvDataReader.GetDataFromFile("src/main/resources/de/exxcellent/challenge/weather.csv", WeatherData.class);
        List<FootballData> footballData = CsvDataReader.GetDataFromFile("src/main/resources/de/exxcellent/challenge/football.csv", FootballData.class);

        WeatherDataAnalyzer = new WeatherDataAnalyzer(weatherData);
        FootballDataAnalyzer = new FootballDataAnalyzer(footballData);
    }

    @Test
    void SmallestTemperatureSpread()
    {
        String expectedDay = "14";
        String actualDay = WeatherDataAnalyzer.GetDayOfSmallestWeatherSpread();
        assertEquals(expectedDay, actualDay);
    }

    @Test
    void TeamWithSmallestGoalDifference()
    {
        String expectedTeam = "Aston_Villa";
        String actualTeam = FootballDataAnalyzer.GetTeamWithSmallestGoalsDistance();
        assertEquals(expectedTeam, actualTeam);
    }
}
