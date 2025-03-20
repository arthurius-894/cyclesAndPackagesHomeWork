package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class WorkScheduleServiceTest {


    @Test
    void shoudCalcMonthsCount1() {
        WorkScheduleService service = new WorkScheduleService();

        // подготавливаем данные:
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        long expected = 3;

        // вызываем целевой метод:
        long actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shoudCalcMonthsCount2() {
        WorkScheduleService service = new WorkScheduleService();

        // подготавливаем данные:
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        long expected = 2;

        // вызываем целевой метод:
        long actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}


