package by.epam.task416;

public class Time {
    int hour;
    int minute;
    int second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public Time(int hour, int minute, int second) {
        if (hour > 23)
            this.hour = 0;
        else
            this.hour = hour;

        if (minute > 59)
            this.minute = 0;
        else
            this.minute = minute;

        if (second > 59)
            this.second = 0;
        else
            this.second = second;
    }

    public void setHour(int hour) {
        if (hour > 23)
            this.hour = hour % 23 - 1;
        else
            this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute > 59)
            this.minute = minute % 59 - 1;
        else
            this.minute = minute;
    }

    public void setSecond(int second) {
        if (second > 59)
            this.second = second % 59 - 1;
        else
            this.second += second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        String time = new String();
        if (minute < 10 && second < 10) {
            time = "Time: " + hour + ":0" + minute + ":0" + second;
        } else if (minute < 10 && second > 10) {
            time = "Time: " + hour + ":0" + minute + ":" + second;
        } else if (minute > 10 && second < 10) {
            time = "Time: " + hour + ":" + minute + ":0" + second;
        } else {
            time = "Time: " + hour + ":" + minute + ":" + second;
        }
        return time;
    }
}
