package org.example;

import java.util.ArrayList;

public class FuzzyFinder {
    private static final String FUZZY_COLOR_TO_FIND = "gold";

    public static int linearSearch(ArrayList<Fuzzy> fuzzies)
    {
        for (int i = 0; i < fuzzies.size(); i++)
        {
            if (fuzzies.get(i).color.equals(FUZZY_COLOR_TO_FIND))
            {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Fuzzy> fuzzies)
    {
        int low = 0;
        int high = fuzzies.size() - 1;

        while (low <= high)
        {
            int mid = (low + high) / 2;
            int comparison = fuzzies.get(mid).color.compareTo(FUZZY_COLOR_TO_FIND);

            if (comparison == 0)
            {
                return mid;
            }
            else if (comparison < 0)
            {
                low = mid + 1;
            }
            else
            {
                high = mid -1;
            }
        }
        return -1;
    }
}
