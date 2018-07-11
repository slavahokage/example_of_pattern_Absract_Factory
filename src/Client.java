import Factories.FabForMac;
import Factories.FabForWindows;
import Programm.Programm;

/**
 * Created by USER on 11.07.2018.
 */
public class Client {
    public static void main(String[] args) {
        FabForWindows fabForWindows = new FabForWindows();
        Programm programmForWindows = new Programm(fabForWindows);
        programmForWindows.clickButton();
        programmForWindows.clickCalendar();
        System.out.println();

        FabForMac fabForMac = new FabForMac();
        Programm programmForMac = new Programm(fabForMac);
        programmForMac.clickButton();
        programmForMac.clickCalendar();

    }
}
