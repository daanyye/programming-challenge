package de.exxcellent.challenge;

import java.util.List;

import de.exxcellent.challenge.readers.CSVDataReader;
import de.exxcellent.challenge.analyzer.WeatherDataAnalyzer;
import de.exxcellent.challenge.analyzer.FootballDataAnalyzer;
import de.exxcellent.challenge.models.WeatherData;
import de.exxcellent.challenge.models.FootballData;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */

    public static void main(String... args)
    {
        if(args.length > 1)
        {
            switch(args[0])
            {
                case "--weather":
                    CSVDataReader weatherReader = new CSVDataReader();
                    List<WeatherData> weatherList = weatherReader.GetDataFromFile(args[1], WeatherData.class);
                    WeatherDataAnalyzer wData = new WeatherDataAnalyzer(weatherList);

                    String dayWithSmallestTempSpread = wData.GetDayOfSmallestWeatherSpread();
                    System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
                    break;

                case "--football":
                    CSVDataReader footballReader = new CSVDataReader();
                    List<FootballData> footballList = footballReader.GetDataFromFile(args[1], FootballData.class);
                    FootballDataAnalyzer fData = new FootballDataAnalyzer(footballList);

                    String teamWithSmallestGoalSpread = fData.GetTeamWithSmallestGoalsDistance();
                    System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
                    break;

                default:
                    System.out.println("Wrong arguments were given. Possible arguments are : --weather + .csv-File, --football + .csv-File");
                    break;
            }
        }
        else
            System.out.println("None or wrong arguments were given. Possible arguments are : --weather + .csv-File, --football + .csv-File");
    }
}