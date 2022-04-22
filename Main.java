public class Main {

    private  static final String INVALID_VALUE_MESSAGE = "Invalid value";  //"final":can't change the value on the right side

    public static void main(String[] args) {
        System.out.println(getDurationString(125,59));
        System.out.println(getDurationString(161));
        System.out.println(getDurationString(-41));
    }
    private static String getDurationString(int minutes,int seconds){
        if(minutes >= 0 && (seconds >= 0 && seconds <= 59)){
            int hours = minutes / 60;
            minutes -= hours * 60;
            String hoursString = hours + "h";
            if (hours < 10){
                hoursString = "0" + hoursString;
            }
            String minutesString = minutes + "h";
            if (minutes < 10){
                minutesString = "0" + minutesString;
            }
            String secondsString = hours + "h";
            if (seconds < 10){
                secondsString = "0" + secondsString;
            }
            return hoursString + " " + minutesString + " " + secondsString + " ";
        }
        return INVALID_VALUE_MESSAGE;
    }
    private static String getDurationString(int seconds){
        if (seconds >= 0){
            int minutes = seconds / 60;
            int remainSeconds = seconds % 60;
            return getDurationString(minutes,remainSeconds);
        }
        return INVALID_VALUE_MESSAGE;
    }
}