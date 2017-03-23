package chapter5;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by M60095A on 22-3-2017.
 */
public class LocaleDemo {
    public static void main(String[] args) throws Exception{
        ResourceBundle rb = ResourceBundle.getBundle("LocaleDemo");
        System.out.println(rb.getString("hello"));

        Locale en = new Locale("en", "US");
        Locale fr = new Locale("fr", "CA");
        Locale da = new Locale("da", "DK");

        rb = ResourceBundle.getBundle("LocaleDemo", en);
        System.out.println(rb.getString("hello"));
        System.out.println(NumberFormat.getCurrencyInstance(en).getCurrency());

        rb = ResourceBundle.getBundle("LocaleDemo", fr);
        System.out.println(rb.getString("hello"));
        System.out.println(NumberFormat.getCurrencyInstance(fr).getCurrency());

        rb = ResourceBundle.getBundle("chapter5.i18n.LocaleDemo", da);
        System.out.println(rb.getString("hello"));

        System.out.println(NumberFormat.getCurrencyInstance(da).getCurrency());

        String sNumber = "1234567.12";
        System.out.println("");
        NumberFormat number = NumberFormat.getInstance(Locale.CANADA);
        System.out.format("Canada: \t");
        System.out.format("%f\t",number.parse(sNumber));
        System.out.format("%s\n",number.format(9876.12));

        number = NumberFormat.getInstance(Locale.GERMANY);
        System.out.format("Germany: \t");
        System.out.format("%f\t",number.parse(sNumber));
        System.out.format("%s\n",number.format(9876.12));

        number = NumberFormat.getInstance(Locale.FRANCE);
        System.out.format("France: \t");
        System.out.format("%f\t",number.parse(sNumber));
        System.out.format("%s\n",number.format(9876.12));



    }
}
