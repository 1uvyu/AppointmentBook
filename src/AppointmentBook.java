public class AppointmentBook
{
    private boolean[][] schedule;

    public AppointmentBook(boolean[][] schedule)
    {
        this.schedule = schedule;
    }

    private boolean isMinuteFree(int period, int minute)
    {
        return schedule[period - 1][minute];
    }

    public int findFreeBlock(int period, int duration)
    {
        return 0;
    }

    public boolean makeAppointment(int startperiod, int endPeriod, int duation)
    {
        return false;
    }
}
