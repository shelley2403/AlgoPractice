package com.xyz.app.StringManipulation;

/*
N = 50, printed – A

50 / 2 = 25
50 / 5 = 5
5 / 5 = 1
// traverse from largest to smallest
5+5+2 = number of ways

Copy and paste it 4 times – printed – AAAAA, operations – 5
Copy and paste it 4 times – printed AA…..AA (25), operations – 5 + 5 = 10
Copy and paste – printed – AA…AAA (50 A’s), operations – 10 + 2 = 12
 */
// We will perform HCF and add the divisors to get the result

public class MinimumCopyPasteProblemHCF {
    int noOfSolutions = 0;

    public int findMinOperations(int number) {
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                noOfSolutions += i;
                number = number / i;
            }
        }
        return noOfSolutions;
    }

}
