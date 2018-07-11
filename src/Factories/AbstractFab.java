package Factories;

import Products.Button;
import Products.Calendar;

/**
 * Created by USER on 11.07.2018.
 */
public interface AbstractFab {
        Button ourButton();
        Calendar ourCalendar();
}
