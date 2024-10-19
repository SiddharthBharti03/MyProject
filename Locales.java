import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.*;
public class Locales {
    public static void getDate(Locale locale)
    {
        Date date=new Date();
        System.out.println(date);
        DateFormat dtf=DateFormat.getDateInstance(DateFormat.FULL,locale);
        System.out.println(dtf.format(date));

    }
    public static void main(String[] args) {
        Locale locale=new Locale("hi", "IN");
        System.out.println(locale);
        getDate(locale);

    }
    
}
