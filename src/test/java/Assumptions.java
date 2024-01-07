import org.junit.jupiter.api.Test;
import java.util.Calendar;

import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class Assumptions {

    // This test will pass everyday,
    // but will print "weekday test" only on weekday
    @Test
    void weekDayTest() {

        assumingThat(Assumptions::isWeekday,
                () -> {
                    System.out.println("weekday test");
                });

    }
    // This one will be aborted on weekends
    // and will print "weekday test" only on weekday
    @Test
    void weekDayTest2() {

        assumeTrue(Assumptions::isWeekday);
        System.out.println("weekday test");


    }


    static Boolean isWeekday() {
        Calendar c = Calendar.getInstance();
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        return (dayOfWeek != 1 && dayOfWeek != 7);
    }
}


