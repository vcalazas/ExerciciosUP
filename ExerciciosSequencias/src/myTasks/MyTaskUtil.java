package myTasks;

public class MyTaskUtil {

	public static void say(String... text) {
		try {
			for(String s: text) {
				System.out.print(s);
			}
			 
		} catch(Exception exception) {}
	}
	public static void say(int number) { 	try { System.out.print(number); } catch(Exception exception) {}}
	public static void say(float number) {	try { System.out.print(number); } catch(Exception exception) {}}
	
}
