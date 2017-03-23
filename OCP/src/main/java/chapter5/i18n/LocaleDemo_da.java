package chapter5.i18n;

import java.util.ListResourceBundle;

/**
 * Created by M60095A on 22-3-2017.
 */
public class LocaleDemo_da extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][] {
            { "currency", "aKK" },
            {"hello", "Bluebla"}
        };
    }
}
