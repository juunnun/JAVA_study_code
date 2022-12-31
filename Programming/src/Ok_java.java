import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class Ok_java {

	public static void main(String[] args) {
		
		String id = "JAVA APT 507";
		//엘리베이터 콜
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		// 보안 꺼짐
		Security mySecurity = new Security("JAVA APT 507");
		mySecurity.off();
		
		//불 켜짐
		Lighting hallLamp = new Lighting("JAVA PAT 507 / Hall Lamp");
		hallLamp.on();
		Lighting floorLamp = new Lighting("JAVA PAT 507 / floor Lamp");
		floorLamp.on();
		
		
		
		
	}

}
