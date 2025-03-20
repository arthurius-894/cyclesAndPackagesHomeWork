package ru.netology.services;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class WorkScheduleServiceTest {


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    void shoudCalcMonthsCount(int income, int expenses, int threshold, int expected) {

        WorkScheduleService service = new WorkScheduleService();

        long actual = service.calculate(income, expenses, threshold);

    }
}


