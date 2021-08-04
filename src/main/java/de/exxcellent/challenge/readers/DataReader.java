package de.exxcellent.challenge.readers;

import java.util.List;

/**
     * This is an interface for all possible Datatypes to read like CSV, JSON etc.
*/
public interface DataReader
{
    /**
     * Reads and returns the data from the given file
     * @param src Path to the file
     * @param dataclass Class to parse the data to
     * @param <T> Generic type for different classes to parse the data to
    */
    public <T> List<T> GetDataFromFile(String src, Class<T> dataclass);
}