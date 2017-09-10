package calendarpractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendarPractice {

   
    public static void main(String[] args) {
       
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 0);
        System.out.println(cal.getTime());
        
        SimpleDateFormat foro = new SimpleDateFormat("yyyy-mm-dd");
        String formatted = foro.format(cal.getTime());
        
        System.out.println(formatted);
                
    }
    
}
