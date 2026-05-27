package org.example;

public class NumberAnalyzer {

    public String analyze(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return "Danh sách rỗng";
        }

        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            sum += number;

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        if (sum > 0) {
            return "Tổng dương - Số chẵn: " + evenCount + ", Số lẻ: " + oddCount;
        } else if (sum < 0) {
            return "Tổng âm - Số chẵn: " + evenCount + ", Số lẻ: " + oddCount;
        } else {
            return "Tổng bằng 0 - Số chẵn: " + evenCount + ", Số lẻ: " + oddCount;
        }
    }
}