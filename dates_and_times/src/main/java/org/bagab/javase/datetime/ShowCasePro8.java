package org.bagab.javase.datetime;

import java.util.Calendar;
import java.util.Objects;
import java.util.TimeZone;

/**
 * Date manipulation before Java 8
 */
public class ShowCasePro8 {

    /**
     * Returns the milliseconds since the epoch for the Timezone of  a Calendar Value
     * @param   Calendar value
     * @return  milliseconds since the epoch for the Timezone
     */
    public static  long  localTimeMillis(Calendar cal) {
        Objects.requireNonNull(cal);
        TimeZone tz = cal.getTimeZone();
        long gmtTimestamp = cal.getTimeInMillis();
        int offset = tz.getOffset(gmtTimestamp);
        return gmtTimestamp + offset;
    }

    /**
     * Returns the seconds since the epoch for the Timezone of  a Calendar Value
     * @param   Calendar value
     * @return  seconds since the epoch for the Timezone
     */
    public static  long  localTimeSeconds(Calendar cal) {
        Objects.requireNonNull(cal);
        return  localTimeMillis(cal)/1000;

    }
}
