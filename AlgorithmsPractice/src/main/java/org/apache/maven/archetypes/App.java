package org.apache.maven.archetypes;

import org.apache.maven.archetypes.basicOperations.CountOddNumber;
import org.apache.maven.archetypes.sorting.AverageOddNumber;

public class App 
{
    public static void main( String[] args )
    {
        AverageOddNumber.average();
        CountOddNumber.count();
    }
}
