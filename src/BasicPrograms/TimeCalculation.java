package BasicPrograms;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TimeCalculation {
	
	public static void main(String[] args) throws ParseException {
		
		String time1 = "17:00:00";
		 SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		String timeStamp =format.format(Calendar.getInstance().getTime());
		//String timeStamp ="17:05:00";
		
		  Date date1 = format.parse(time1);
		  Instant end = Instant.now();
		  Date date2 = format.parse(timeStamp);
		  long diff = date1.getTime() - date2.getTime(); 
		  
		 // System.out.println("Time :: "+difference/60000);
		long diffSeconds = diff / 1000 % 60;
		  long diffMinutes = diff / (60 * 1000) % 60;
		  long diffHours = diff / (60 * 60 * 1000) % 24;
		 
		
		  if(diffSeconds<0||diffMinutes<0||diffHours<0)
		  {
			  System.out.println("Zoo is Closed!! Please Visit in Next Working Day");
		  }else{
			//  System.out.print(diffDays + " days, ");
			  System.out.print(diffHours + " hours, ");
			  System.out.print(diffMinutes + " minutes, ");
			  System.out.print(diffSeconds + " seconds."); 
		  }
		
		
	}

}
