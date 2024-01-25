package devices;

public class SmartLight extends InteractiveDevice{
	private static final String id = "SmartLight";
	private static int lightCount;
	
	
	public SmartLight(String deviceName, double devicePrice, String interactionMode) {
		super(deviceName, devicePrice, interactionMode);
		lightCount++;
	}
	
	public static int getLightCount() {
		return lightCount;
	}
	
	public String toString() {
		return "SmartLight" + 
				"[ID= " + id + ", InteractiveDevice{" + 
				" deviceName= '" + deviceName +
				"', devicePrice= " + devicePrice +
		        ", deviceConnectivity= '" + deviceConnectivity +
		        "', interactionMode= '" + getInteractionMode() +
		        "', configurationStatus= '" + getConfigurationStatus() + "'}]";
	}
}
