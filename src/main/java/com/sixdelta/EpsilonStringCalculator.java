package com.sixdelta;

import java.util.stream.Stream;

public class EpsilonStringCalculator {
    public int add(String s){
    	return  Stream.of(s.split(","))
                      .mapToInt(Integer::parseInt)
                      .sum();


    	
    }
}
