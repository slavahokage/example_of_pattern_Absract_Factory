package Programm;

import Factories.AbstractFab;
import Products.Button;
import Products.Calendar;

/**
 * Created by USER on 11.07.2018.
 */
public class Programm {
    Button button;
    Calendar calendar;

    public Programm(AbstractFab abstractFab) {
        button = abstractFab.ourButton();
        calendar = abstractFab.ourCalendar();
    }

    public void clickButton(){
        button.showText();
    }

    public void clickCalendar(){
        calendar.changeDate();
    }

}
