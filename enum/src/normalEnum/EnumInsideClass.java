package normalEnum;

public class EnumInsideClass {
 enum Day{
	 Sunday,Monday,tUSEDAY,wednesDay,thursday,saturday,sunday;
 }
 public static void main(String[] args) {
	Day day=Day.Sunday;
	Day day1=Day.Monday;
	Day day2=Day.tUSEDAY;
	Day day3=Day.wednesDay;
	Day day4=Day.thursday;
	Day day5=Day.saturday;
	Day day6=Day.sunday;
	System.out.println(day);
	System.out.println(day1);
	System.out.println(day2);
	System.out.println(day3);
	System.out.println(day4);
	System.out.println(day5);
	System.out.println(day6);
}
 
}
