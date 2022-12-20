package multithreads.synchronization;

import java.time.LocalDate;
import java.time.LocalTime;

public class AppointmentCenter {

    private LocalDate day=LocalDate.now();

    public synchronized LocalDate getAppointmentDate(){
        day=day.plusDays(1);
        return day;
    }
}
