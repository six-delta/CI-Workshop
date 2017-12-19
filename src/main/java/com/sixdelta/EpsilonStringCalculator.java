package com.sixdelta;

import java.util.stream.Stream;

public class EpsilonStringCalculator {
    public int add(String theStringToAdd){

        if(theStringToAdd.isEmpty()) return 0;

        String delim = ",|\\n";

        if(theStringContainsAnOptionalDelimiter(theStringToAdd)) {
            delim = extractTheDelimiterFromTheString(theStringToAdd);
            theStringToAdd = removingTheSeparatorIndicatorFromTheString(theStringToAdd);
        }

    	return  Stream.of(theStringToAdd.split(delim))
                      .mapToInt(Integer::parseInt)
                      .sum();
    }

    private boolean theStringContainsAnOptionalDelimiter(String theString){
      return theString.startsWith("//");
    }

    private String extractTheDelimiterFromTheString(String theString){
      return theString.substring(2,theString.indexOf("\n") );
    }

    private String removingTheSeparatorIndicatorFromTheString(String theString){
      return theString.substring(theString.indexOf("\n")+1);
    }
}
