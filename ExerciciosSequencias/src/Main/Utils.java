package Main;

public class Utils {

	public static void say(String text) {
		try {
			System.out.println(text);
		} catch(Exception exception) {}
	}
	
	public static void say(String[] texts) {
		try {
			for(String text : texts) {
				System.out.println(text);
			}
		} catch(Exception exception) {}
	}
	
}
