package optionalpack;

public class EnhancedSwitch {

	public static void main(String[] args) {
		int day=3;
		String message=switch(day) {
		case 1->"monday";
		case 2->"tuesday";
		case 3->"wednesday";
		case 4->"thursday";
		case 5->"friday";
		case 6->"saturday";
		case 7->"sunday";
		default->"invalid day";
		
		};
		System.out.println("day is :"+message);

	}

}
