package ru.netology.services;

public class WorkScheduleService {

    public long calculate(int income, int expenses, int threshold) {

        int countMonth = 0;
        int initialAmount = 0; //сумма на счету

        for (int i = 1; i <= 12; i++) {
            if (initialAmount < threshold) {
                //System.out.println("Месяц " + i + "." + " Денег " + initialAmount + " Придется работать");
                initialAmount = initialAmount + income - expenses;
            } else {
                //System.out.println("Месяц " + i + "." + " Денег " + initialAmount + " Буду отдыхать");
                initialAmount = (initialAmount - expenses) / 3;
                countMonth++;
            }

        }

        return countMonth;

    }
}
