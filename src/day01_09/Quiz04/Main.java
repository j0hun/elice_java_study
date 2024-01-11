package day01_09.Quiz04;

import java.time.LocalDate;

public class Main {
    public static void main(String args[]) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        int[] dateDifference = calculateDateDifference(year, month, day);

        System.out.println(String.format("차이 결과는 %d 개월 혹은 %d 일", dateDifference[0], dateDifference[1]));

    }

    public static int[] calculateDateDifference(int year, int month, int day) {
        LocalDate inputDate = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();

        long monthsDifference = java.time.temporal.ChronoUnit.MONTHS.between(inputDate, currentDate);
        long daysDifference = java.time.temporal.ChronoUnit.DAYS.between(inputDate, currentDate);

        long adjustedDaysDifference = monthsDifference * 30;

        return new int[]{(int) monthsDifference, (int) adjustedDaysDifference};
    }
}
