package de.exxcellent.challenge;

import de.exxcellent.challenge.analyzer.FootballDataAnalyzer;
import de.exxcellent.challenge.analyzer.WeatherDataAnalyzer;
import de.exxcellent.challenge.models.FootballData;
import de.exxcellent.challenge.models.WeatherData;

import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AnalyzerTest 
{
    private WeatherDataAnalyzer WeatherDataAnalyzer;
    private FootballDataAnalyzer FootballDataAnalyzer;

    @BeforeEach
    void SetUp()
    {
        WeatherDataAnalyzer = new WeatherDataAnalyzer(SetUpMockWeatherData());
        FootballDataAnalyzer = new FootballDataAnalyzer(SetUpMockFootballData());
    }

    private List<WeatherData> SetUpMockWeatherData() 
    {
        List<WeatherData> weatherData = new ArrayList<WeatherData>();

        for(int i = 1; i < 10; i++)
        {
            WeatherData wd = new WeatherData();
            wd.SetDay(String.valueOf(i));
            wd.SetMxT(String.valueOf(i * 2 + 10));
            wd.SetMnT(String.valueOf(i + 5));
            weatherData.add(wd);
        }

        return weatherData;
    }

    private List<FootballData> SetUpMockFootballData() 
    {
        List<FootballData> footballData = new ArrayList<FootballData>();

        FootballData fd1 = new FootballData();
        FootballData fd2 = new FootballData();
        FootballData fd3 = new FootballData();

        fd1.SetTeam("FC Bayern");
        fd2.SetTeam("Real Madrid");
        fd3.SetTeam("FC Barcelona");

        fd1.SetGoals("10");
        fd2.SetGoals("20");
        fd3.SetGoals("30");

        fd1.SetGoalsAllowed("44");
        fd2.SetGoalsAllowed("55");
        fd3.SetGoalsAllowed("66");

        footballData.add(fd1);
        footballData.add(fd2);
        footballData.add(fd3);

        return footballData;
    }

    @Test
    void SmallestTemperatureSpread()
    {
        String expectedDay = "1";
        String actualDay = WeatherDataAnalyzer.GetDayOfSmallestWeatherSpread();
        assertEquals(expectedDay, actualDay);
    }

    @Test
    void TeamWithSmallestGoalDifference()
    {
        String expectedTeam = "FC Bayern";
        String actualTeam = FootballDataAnalyzer.GetTeamWithSmallestGoalsDistance();
        assertEquals(expectedTeam, actualTeam);
    }
}
