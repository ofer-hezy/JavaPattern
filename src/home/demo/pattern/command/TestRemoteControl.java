package home.demo.pattern.command;

public class TestRemoteControl {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl();
	
		Light livingRoomLight = new Light("LivingRoom");
		Fun   livingRoomFan = new Fun("Kitchen");
		
		
		
		
		rc.setCommand(new StartFan(livingRoomFan));
		rc.buttonPressed();
		rc.setCommand(new TurnOnLight(livingRoomLight));
        rc.buttonPressed();
        rc.setCommand(new TurnOffLight(livingRoomLight));
        rc.buttonPressed();
        
	}

}
