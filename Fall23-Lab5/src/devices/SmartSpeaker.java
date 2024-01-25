package devices;

public class SmartSpeaker extends InteractiveDevice{
	private static final String id = "SmartSpeaker";
	private static int speakerCount;
	
	public SmartSpeaker(String deviceName, double devicePrice, String interactionMode) {
		super(deviceName, devicePrice, interactionMode);
		speakerCount++;
	}
	
	public static int getSpeakerCount() {
		return speakerCount;
	}
	
	public String toString() {
		return "SmartSpeaker" + 
				"[ID= " + id + ", InteractiveDevice{" + 
				" deviceName= '" + deviceName +
				"', devicePrice= " + devicePrice +
		        ", deviceConnectivity= '" + deviceConnectivity +
		        "', interactionMode= '" + getInteractionMode() +
		        "', configurationStatus= '" + getConfigurationStatus() + "'}]" ;
	}
}
