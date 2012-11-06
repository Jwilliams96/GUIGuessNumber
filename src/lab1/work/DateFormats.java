/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.work;

/**
 *
 * @author Jwilliams96
 */
public enum DateFormats {
    TIME("hh:mm a"),
    TIME_SHORT_TIMEZONE("hh:mm a, z"),
    TIME_LONG_TIMEZONE("hh:mm a, zzzz"),
    MM_DD_YYYY("mm/dd/yyyy"),
    M_D_YYYY("m/d/yyyy"),
    DATE_AND_TIME("mm/dd/yyyy hh:mm a"),
    DATE_TIME_TIMEZONE("mm/dd/yyyy hh:mm a, z"),
    DAY_MONTH_YEAR("EEE, d MMM yyyy")
    ;
    
    private DateFormats(final String text) {
        this.text = text;
    }

    private final String text;

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return text;
    }
}
