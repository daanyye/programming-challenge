package de.exxcellent.challenge.readers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

/**
     * This class represents a CSV - Reader that reads the data from .csv - Files
*/
public class CSVDataReader implements DataReader
{
    @Override 
    public <T> List<T> GetDataFromFile(String src, Class<T> dataclass)
    {
        try 
        {
            return new CsvToBeanBuilder<T>(new FileReader(src))
                                    .withType(dataclass)
                                    .withSkipLines(1)
                                    .build()
                                    .parse();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
            return List.of();
        }
    }
}
