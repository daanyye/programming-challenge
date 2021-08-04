package de.exxcellent.challenge.analyzer;

import java.util.List;

import de.exxcellent.challenge.models.WeatherData;

/**
     * This class represents an analyzer that analyzes the given WeatherData
*/
public class WeatherDataAnalyzer 
{
    /**
        * Contains the read WeatherData
    */
    private List<WeatherData> weatherData;

    /**
    * This is the constructor for the WeatherDataAnalyzer class
        * @param wData The WeatherData that needs to be analyzed
    */
    public WeatherDataAnalyzer(List<WeatherData> wData)
    {
        weatherData = wData;
    }

    /**
        * Analyzes the WeatherData and returns the day with the smallest temperature spread
        * @return Day with the smallest temperature spread
    */
    public String GetDayOfSmallestWeatherSpread()
    {
        int smallestTemperatureSpread = Integer.MAX_VALUE;
        String smallestSpreadDay = "";

        for(WeatherData wd : weatherData)
        {
            int mxt = Integer.parseInt(wd.GetMxT());
            int mnt = Integer.parseInt(wd.GetMnT());
            int spread = mxt - mnt;
            
            if(spread < smallestTemperatureSpread)
            {
                smallestTemperatureSpread = spread;
                smallestSpreadDay = wd.GetDay();
            }
        }

        return smallestSpreadDay;
    }
}
