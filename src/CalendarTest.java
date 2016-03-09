import java.util.Calendar;


public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		PrintDate(calendar);
		
		calendar.set(Calendar.YEAR, 2000); // set the year 2000
		calendar.set(Calendar.MONTH, 0); //1월로 돌린다.
		
		//윤달 잘못세팅 해서 넣어도 이상한 날짜가 나오진 않는다.
	}
	
	public static void PrintDate(Calendar calendar){
		String date = "";
		
		int year = calendar.get(Calendar.YEAR);
		date += (year + "년") ;
				
		//월 : 0~11
		int month = calendar.get(Calendar.MONTH);
		date += ((month + 1) + "월");
		

		int d = calendar.get(Calendar.DATE);
		date += (d + "일");

		//요일 (1~7)		
		final String[] days = {"일", "월", "화", "수", "목", "금", "토"};
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		date += ( "(" + days[day-1] + ")" );
		
		String ampm = calendar.get(Calendar.AM_PM) == 0 ? "오전" : "오후";
		date += (ampm + " ");
		
		int hour = calendar.get(Calendar.HOUR);
		date += (hour + ":");
		
		int minute = calendar.get(Calendar.MINUTE);
		date += (minute + ":");
		
		int second = calendar.get(Calendar.SECOND);
		date += second;
		
		System.out.println(date);
		
		
	}
}
