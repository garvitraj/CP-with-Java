import java.util.*;

class Time {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String time = scan.next();
        String splitarr[] = time.split(":"); //spliting the array on basis of : as they are seperated by it
        String AmPm = splitarr[2].substring(2, 4); // getting weather its AM or PM
        int hh, mm, ss;
        hh = Integer.parseInt(splitarr[0]);
        mm = Integer.parseInt(splitarr[1]);
        ss = Integer.parseInt(splitarr[2].substring(0, 2));

        //checking the condition and applying the concept of 24 hr clock
        String checkPM = "PM", checkAM = "AM";
        int h = hh;
        if (AmPm.equals(checkAM) && hh == 12)
            h = 0;
        else if (AmPm.equals(checkPM) && hh < 12)
            h += 12;

        System.out.printf("%02d:%02d:%02d", h, mm, ss);
    }
}
