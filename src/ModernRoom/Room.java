package ModernRoom;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Room {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Door door = new Door();
		Light light = new Light();
		Fan fan = new Fan();
		
		door.addSwitch(light);
		door.addSwitch(fan);
		
		door.open();
		TimeUnit.SECONDS.sleep(2);
		
		System.out.println("-".repeat(100));
		
//		door.removeSwitch(fan);
		
		door.close();
		TimeUnit.SECONDS.sleep(2);
		

	}

}
