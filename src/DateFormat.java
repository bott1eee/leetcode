import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2022-3-5");
        System.out.println(date);

        String date1 = "2022-3-5";
        String date2=date1.replace("-","/");
        System.out.println(date2);
    }
}
