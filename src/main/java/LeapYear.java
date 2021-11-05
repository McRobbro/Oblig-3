public class LeapYear {

    public static boolean leapYearCheck(int year) {

        boolean leap = false;

        if (year > 1582)
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    leap = year % 400 == 0;
                } else
                    leap = true;
            }
        return leap;
    }

}
