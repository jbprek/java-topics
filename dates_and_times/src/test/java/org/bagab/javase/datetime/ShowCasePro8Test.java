package org.bagab.javase.datetime;

import org.junit.Test;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @author prekezes.
 */
public class ShowCasePro8Test {


    @Test
    public void testTzOffest() {
        // Example time zone Melbourne Australia
        TimeZone tz = TimeZone.getTimeZone("Australia/Melbourne");
        Calendar calDst = Calendar.getInstance(tz);
        calDst.set(Calendar.MONTH, Calendar.MARCH) ;
        calDst.set(Calendar.DAY_OF_MONTH, 1) ;

        System.out.println(calDst);
        System.out.println(tz.getOffset(calDst.getTimeInMillis()));


        Calendar calNonDst = Calendar.getInstance(tz);
        calDst.set(Calendar.MONTH, Calendar.OCTOBER) ;
        calDst.set(Calendar.DAY_OF_MONTH, 1) ;


        System.out.println(calDst);
        System.out.println(tz.getOffset(calDst.getTimeInMillis()));

        // Get a  specific time A for a timezone  when DST is in use

        // Get another  specific time B for a timezone  when DST is not in use

        // Calculate
        ShowCasePro8.localTimeMillis(Calendar.getInstance());
    }
}
