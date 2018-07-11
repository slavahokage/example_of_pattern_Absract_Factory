package Factories;

import Products.Button;
import Products.ButtonForWindows;
import Products.Calendar;
import Products.CalendarForWindows;

/**
 * Created by USER on 11.07.2018.
 */
public class FabForWindows implements AbstractFab {
    @Override
    public Button ourButton() {
        return new ButtonForWindows();
    }

    @Override
    public Calendar ourCalendar() {
        return new CalendarForWindows();
    }
}
