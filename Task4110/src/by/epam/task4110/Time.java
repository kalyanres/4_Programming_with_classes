package by.epam.task4110;


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
    if (this.hour + hour > 23)
      this.hour = (this.hour + hour) % 23 - 1;
    else
      this.hour += hour;
  }

  public void setMinute(int minute) {
    if (this.minute + minute > 59)
      this.minute = (this.minute + minute) % 59 - 1;
    else
      this.minute += minute;
  }

  public void setSecond(int second) {
    if (this.second + second > 59)
      this.second = (this.second + second) % 59 - 1;
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

  public boolean equals(Time time) {
    int t1 = hour * 3600 + minute * 60 + second;
    int t2 = time.hour * 3600 + time.minute * 60 +
            time.second;
    if (t1 > t2)
      return true;
    else
      return false;
  }

  @Override
  public String toString() {
    return "Time{" +
            "hour=" + hour +
            ", minute=" + minute +
            ", second=" + second +
            '}';
  }
}

