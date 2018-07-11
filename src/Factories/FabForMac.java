package Factories;

import Products.Button;
import Products.ButtonForMac;
import Products.Calendar;
import Products.CalendarForMac;

/**
 * Created by USER on 11.07.2018.
 */
public class FabForMac implements AbstractFab {
    @Override
    public Button ourButton() {
        return new ButtonForMac();
    }

    @Override
    public Calendar ourCalendar() {
        return new CalendarForMac();
    }
}
