package createanddestroyingobjects.item5;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author: SunnyScent
 * @Date: 2016-12-20
 * @Time: 11:14
 */

public class Person {
    private Date birthDate;

    public Person(Date birthDate) {
        this.birthDate = birthDate;
    }

//    private final static Date BOOM_START;
//    private final static Date BOOM_END;

    static {

    }

    public boolean isBabyBoomer() {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        Date boom_start = gmtCal.getTime();
        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        Date boom_end = gmtCal.getTime();
        return birthDate.compareTo(boom_start) >= 0 && birthDate.compareTo(boom_end) < 0;
    }
}