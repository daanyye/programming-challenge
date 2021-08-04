package de.exxcellent.challenge.models;

import com.opencsv.bean.CsvBindByPosition;

/**
     * This class represents WeatherData to be read from a CSV-File
*/
public class WeatherData 
{
    @CsvBindByPosition(position = 0)
    private String Day;

    @CsvBindByPosition(position = 1)
    private String MxT;

    @CsvBindByPosition(position = 2)
    private String MnT;

    public String GetDay()
    {
        return Day;
    }

    public String GetMxT()
    {
        return MxT;
    }

    public String GetMnT()
    {
        return MnT;
    }

    public void SetDay(String day)
    {
        Day = day;
    }

    public void SetMxT(String mxt)
    {
        MxT = mxt;
    }

    public void SetMnT(String mnt)
    {
        MnT = mnt;
    }

    @Override
    public String toString()
    {
        return "Day: " + Day + "\nMxT: " + MxT + "\nMnT: " + MnT + "\n";
    }
}