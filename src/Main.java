import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ФИО:");

        String[] fullName = scanner.nextLine().split(" ");

        String surname = fullName[0], firstName = fullName[1], lastName = fullName[2];

        System.out.println("Введите дату рождения в формате дд.мм.гггг");

        String strDate = scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        GregorianCalendar birthday = new GregorianCalendar(), currentTime = new GregorianCalendar();

        birthday.setTime(simpleDateFormat.parse(strDate));
        currentTime.setTime(new Date());

        int years = currentTime.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);

        String sex = lastName.endsWith("а") ? "Жен." : "Муж.";

        String ans = String.format("%s %s.%s., пол: %s, возраст в годах: %d",
                surname, firstName.charAt(0), lastName.charAt(0), sex, years);

        System.out.println(ans);
    }
}