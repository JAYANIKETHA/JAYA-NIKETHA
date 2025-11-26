package nov25;
import java.util.Scanner;

public class multithreading {

	public static void main(String args[]) {
		
		Minute num = new Minute();
		Seconds alp = new Seconds();

		
		num.start();
		alp.start();
	
	}

}

class Minute extends Thread {
	int a = 0;

	public void run() {

		try {
			for (int i = 0; i <= 59; i++) {
				try {
				System.out.println("Minutes : " + a);
				a++;
				Thread.sleep(60000);
				}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

class Seconds extends Thread {
	int a=0;

	public void run() {
		try {
			for (int i = 0; i <= 59; i++) {

				try {
				System.out.println("Seconds :" + a);
				a++;
				Thread.sleep(1000);
				}
				catch(Exception e) {
					System.out.println("Issues in Minutes Thread class");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}