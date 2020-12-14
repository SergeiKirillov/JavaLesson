import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;

public class Calendar {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        int mount = date.getMonthValue();
        int day = date.getDayOfMonth();

        date = date.minusDays(day -1); //Первый день месяца - сегодняшнее число минус 1
        DayOfWeek weekday = date.getDayOfWeek(); //enum 1-Понедельник и т.д
        int dayWeek = weekday.getValue(); //Преобразуем enum в int

        System.out.println("Пон Вто Сре Чет Пят Суб Вос");
        for (int i = 1; i < dayWeek ; i++) System.out.print("    "); //Пустое место до первого числа месяца

        while (date.getMonthValue() == mount)
        {
            System.out.printf("%3d", date.getDayOfMonth());

            if (date.getDayOfMonth() == day) System.out.print("*");
            else  System.out.print(" ");

            date = date.plusDays((1));
            if (date.getDayOfWeek().getValue() == 1) System.out.println();

        }

        if (date.getDayOfWeek().getValue() != 1) System.out.println();

    }
}
