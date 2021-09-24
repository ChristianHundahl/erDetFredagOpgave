package Services;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;

public class ZellersCongruence {
    public static void main(String[] args) throws MalformedURLException {
        System.out.println(ZellersCongruence());
    }

    public static String ZellersCongruence() throws MalformedURLException {
        // Get year, month and a day from Java inbuilt .Calendar method
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        int day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

        // Check if the month is January or February
        // If the month is January and February, convert to 13, and 14,
        // and year has to -1. (Go to previous year).
        if (month == 1 || month == 2) {
            month += 12;
            year--;
        }

        // Compute the answer
        int y = year;
        int q = day;
        int m = month;
        int h = (q + (int)((26 * (m + 1)) / 10.0) + y + (int)(y / 4.0) + 6 * (int)(y / 100.0) + (int)(y / 400.0) % 7);

        String result = "Det er ";
        URL fridayParty = new URL("https://c.tenor.com/o5_IiWpa1MIAAAAC/happy-rave.gif");
        //Display the name of the day of the week
        if (h > 6)
            result = result + "<a " + "href=" + fridayParty + ">" + "FREDAG!!!" + "</a>";
        //<a href="people.htm?sort=name">Name</a>
        else
            result = result + "ikke fredag :-(";
        return result;
    }
}

