package de.exxcellent.challenge.analyzer;

import java.util.List;

import de.exxcellent.challenge.models.FootballData;

/**
     * This class represents an analyzer that analyzes the given FootballData
*/
public class FootballDataAnalyzer 
{
    /**
        * Contains the read FootballData
    */
    private List<FootballData> footballData;
    
    /**
    * This is the constructor for the FootballDataAnalyzer class
        * @param fData The FootballData that needs to be analyzed
    */
    public FootballDataAnalyzer(List<FootballData> fData)
    {
        footballData = fData;
    }

    /**
        * Analyzes the FootballData and returns the team with the smallest difference 
        between Goals and Goals allowed
        * @return Team with the smallest difference 
        between Goals and Goals allowed
    */
    public String GetTeamWithSmallestGoalsDistance()
    {
        int smallestGoalDistance = Integer.MAX_VALUE;
        String teamWithSmallestGoalDistance = "";

        for(FootballData fd : footballData)
        {
            int mxt = Integer.parseInt(fd.GetGoals());
            int mnt = Integer.parseInt(fd.GetGoalsAllowed());
            int spread = Math.abs(mxt - mnt);
            
            if(spread < smallestGoalDistance)
            {
                smallestGoalDistance = spread;
                teamWithSmallestGoalDistance = fd.GetTeam();
            }
        }

        return teamWithSmallestGoalDistance;
    }
}
