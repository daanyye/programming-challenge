package de.exxcellent.challenge.models;

import com.opencsv.bean.CsvBindByPosition;

/**
     * This class represents FootballData to be read from a CSV-File
*/
public class FootballData 
{
    @CsvBindByPosition(position = 0)
    private String Team;

    @CsvBindByPosition(position = 5)
    private String Goals;

    @CsvBindByPosition(position = 6)
    private String GoalsAllowed;

    public String GetTeam()
    {
        return Team;
    }

    public String GetGoals()
    {
        return Goals;
    }

    public String GetGoalsAllowed()
    {
        return GoalsAllowed;
    }

    public void SetTeam(String team)
    {
        Team = team;
    }

    public void SetGoals(String goals)
    {
        Goals = goals;
    }

    public void SetGoalsAllowed(String goalsAllowed)
    {
        GoalsAllowed = goalsAllowed;
    }

    @Override
    public String toString()
    {
        return "Team: " + Team + "\nGoals: " + Goals + "\nGoals Allowed: " + GoalsAllowed + "\n";
    }
}
