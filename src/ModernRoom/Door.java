package ModernRoom;

import java.util.ArrayList;
import java.util.List;

public class Door {
	
	private List<Switch> switch1 = new ArrayList<>();
	public void addSwitch(Switch xx) {
		switch1.add(xx);
	}
	public void removeSwitch(Switch xx) {
		switch1.remove(xx);
	}
	
	public void open() {
		System.out.println("The Door is open");
		switch1.forEach(Switch::on);
		
	}
	
	
	public void close() {
		System.out.println("The Door is close");
		switch1.forEach(Switch::off);
		
	}

}
