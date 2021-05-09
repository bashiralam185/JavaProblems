public class Time {
    private int hour;
    private int minutes;
    private int second;

    public Time(int hour, int minutes, int second) {
        this.hour = hour;
        this.minutes = minutes;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minutes, int second) {
        this.hour = hour;
        this.second = second;
        this.minutes = minutes;

    }

    public String toString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinutes(), getSecond());
    }

    public Time nextSecond() {
        int checkSecond = getSecond();
        int checkHours = getHour();
        int checkMinutes = getMinutes();
        if (checkSecond == 59) {
            checkMinutes++;
            checkSecond = 0;
            if (checkMinutes == 60) {
                checkMinutes = 0;
                checkHours++;
                if (checkHours == 24) {
                    checkHours = 0;
                }
            }
        } else {
            checkSecond++;
        }
        return new Time(checkHours, checkMinutes, checkSecond);
    }

    public Time previousSecond() {
        int checkSecond = getSecond();
        int checkHours = getHour();
        int checkMinutes = getMinutes();
        if (checkSecond == 0) {
            checkMinutes--;
            checkSecond = 59;
            if (checkMinutes == 0) {
                checkMinutes = 59;
                checkHours--;
                if (checkHours < 0) {
                    checkHours = 23;
                }
            }
        } else {
            checkSecond--;
        }
        return new Time(checkHours, checkMinutes, checkSecond);
    }


}