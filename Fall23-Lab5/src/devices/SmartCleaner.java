package devices;

public class SmartCleaner extends InteractiveDevice implements Autonomous{
	private static final String id = "SmartCleaner";
	private static int cleanerCount;
	private int batteryPercantage;
	
	public SmartCleaner(String deviceName, double devicePrice, String interactionMode){
		super(deviceName, devicePrice, interactionMode);
		batteryPercantage = 100;
		cleanerCount++;
	}
	
	public void automate(int hour) {
		if(batteryPercantage >= 20*hour) {
			System.out.println(deviceName + " automated in " + getInteractionMode() + " mode for " + hour + " hours.");
		}else {
			System.out.println(deviceName + " failed to automate, requires charging.");
		}
		batteryPercantage -= 20*hour;
	}
	
	public String toString() {
		return  
				"Device Type: " + id + "\n" +
		        "Interactive Device Name: " + deviceName + "\n" +
		        "Device Price: " + devicePrice + "\n" +
		        "Device Connectivity: " + deviceConnectivity + "\n" +
				"Interaction Mode: " + getInteractionMode() + "\n";
	}
}
