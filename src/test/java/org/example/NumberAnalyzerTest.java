package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberAnalyzerTest {

    private final NumberAnalyzer analyzer = new NumberAnalyzer();

    @Test
    void testEmptyArray() {
        int[] numbers = {};
        String result = analyzer.analyze(numbers);

        assertEquals("Danh sách rỗng", result);
    }

    @Test
    void testNullArray() {
        String result = analyzer.analyze(null);

        assertEquals("Danh sách rỗng", result);
    }

    @Test
    void testPositiveSumWithEvenAndOddNumbers() {
        int[] numbers = {1, 2, 3, 4};
        String result = analyzer.analyze(numbers);

        assertEquals("Tổng dương - Số chẵn: 2, Số lẻ: 2", result);
    }

    @Test
    void testNegativeSumWithEvenAndOddNumbers() {
        int[] numbers = {-1, -2, -3};
        String result = analyzer.analyze(numbers);

        assertEquals("Tổng âm - Số chẵn: 1, Số lẻ: 2", result);
    }

    @Test
    void testZeroSumWithEvenAndOddNumbers() {
        int[] numbers = {-1, 1, 2, -2};
        String result = analyzer.analyze(numbers);

        assertEquals("Tổng bằng 0 - Số chẵn: 2, Số lẻ: 2", result);
    }

    @Test
    void testOnlyEvenNumbers() {
        int[] numbers = {2, 4, 6};
        String result = analyzer.analyze(numbers);

        assertEquals("Tổng dương - Số chẵn: 3, Số lẻ: 0", result);
    }

    @Test
    void testOnlyOddNumbers() {
        int[] numbers = {1, 3, 5};
        String result = analyzer.analyze(numbers);

        assertEquals("Tổng dương - Số chẵn: 0, Số lẻ: 3", result);
    }
}