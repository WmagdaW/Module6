package com.kodilla.testing.collection;

import java.util.List;
import java.util.ArrayList;


public class OddNumbersExterminator {

        public List <Integer> exterminate (List <Integer> numbers) {
            List<Integer> evenNumbers = new ArrayList<>();

            for (int number : numbers) {
                if (number % 2 == 0) {
                    evenNumbers.add(number);
                }
            }

            return evenNumbers;
        }

    }


