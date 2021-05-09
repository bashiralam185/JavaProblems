public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(){};

    public MyTime(int hour, int minute, int second){
        if ( hour >= 0 && hour <= 23) {
            this.hour = hour;
        }else{
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
        if ( minute >= 0 && minute <= 59) {
            this.minute = minute;
        }else{
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
        if (second >=0 && second <=59){
            this.second=second;
        }else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }

    public void setTime(int hour, int minute, int second){
        if ( hour >= 0 && hour <= 23) {
            this.hour = hour;
        }else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
        if ( minute >= 0 && minute <= 59) {
            this.minute = minute;
        }else{
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
        if (second >=0 && second <=59){
            this.second=second;
        }else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
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

    public void setHour(int hour) {
        if ( hour >= 0 && hour <= 23) {
            this.hour = hour;
        }else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }

    public void setMinute(int minute) {
        if ( minute >= 0 && minute <= 59) {
            this.minute = minute;
        }else{
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }

    public void setSecond(int second) {
        if (second >=0 && second <=59){
            this.second=second;
        }else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }


    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public MyTime nextSecond(){
        int checkSec = getSecond();
        int checkHour=getHour();
        int checkMin=getMinute();
        if (checkSec == 59){
            checkSec=0;
            ++checkMin;
            //System.out.println(checkMin);
            if (checkMin==60){
                checkHour++;
                if (checkHour>=24){
                    checkHour=0;
                }
            }
        }else {
            checkSec++;
        }

        return new MyTime(checkHour, checkMin, checkSec);
    }

    public MyTime nextMinute(){
        int checkHour=getHour();
        int checkMin=getMinute();
        if (checkMin == 59){
            checkMin=0;
            checkHour++;
            if (checkHour>=24){
                checkHour=0;
            }
        }else {
            checkMin++;
        }
        return new MyTime(checkHour, checkMin, getSecond());
    }

    public MyTime nextHour(){
        return new MyTime(getHour()+1, getMinute(), getSecond());
    }

    public MyTime previousSecond(){
        int checkSec = getSecond();
        int checkHour=getHour();
        int checkMin=getMinute();
        if (checkSec == 0){
            checkSec=59;
            checkMin--;
            if (checkMin<0){
                checkMin=59;
                checkHour--;
                if (checkHour<0){
                    checkHour=23;
                }
            }
        }else {
            checkSec--;
        }

        return new MyTime(checkHour, checkMin, checkSec);
    }

    public MyTime previousMinute(){
        int checkHour=getHour();
        int checkMin=getMinute();
        if (checkMin == 0){
            checkMin=59;
            checkHour--;
            if (checkHour<0){
                checkHour=23;
            }
        }else {
            checkMin--;
        }

        return new MyTime(checkHour, checkMin, getSecond());
    }

    public MyTime previousHour(){
        int checkHour=getHour();
        if (checkHour==0){
            checkHour=23;
        }else {
            checkHour--;
        }
        return new MyTime(checkHour, getMinute(), getSecond());
    }
}
