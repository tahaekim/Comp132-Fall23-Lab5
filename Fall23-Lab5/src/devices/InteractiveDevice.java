package devices;

public class InteractiveDevice extends SmartDevice implements Configurable{
	private String interactionMode;
	private boolean configurationStatus;
	
	public InteractiveDevice(String deviceName, double devicePrice, String interactionMode){
		super(deviceName, devicePrice);
		this.interactionMode = interactionMode;
		configurationStatus = false;
	}
	
	public void setDeviceConnectivity() {
		setDeviceConnectivity();
	}
	
	public void setInteractionMode(String interactionMode) {
		this.interactionMode = interactionMode;
	}
	
	public String getInteractionMode() {
		return interactionMode;
	}
	
	public void setConfigurationStatus(boolean configurationStatus) {
		this.configurationStatus = configurationStatus;
	}
	
	public boolean getConfigurationStatus() {
		return configurationStatus;
	}
	
	public void configure() {
		if(interactionMode != null) {
			configurationStatus = true;
			System.out.println(deviceName + " is configured");
		}
	}
	
	public void operate() {
		if(configurationStatus) {
			System.out.println(deviceName + " operated in " + interactionMode + " mode.");
		}else {
			System.out.println(deviceName + " failed to operate, requires configuration.");
		}
	}
	
	public String toString() {
		return " deviceName= " + deviceName +
		       ", devicePrice= " + devicePrice +
		       ", deviceConnectivity= " + deviceConnectivity +
		       ", interactionMode= " + interactionMode +
		       ", configurationStatus= " + configurationStatus;
	}
}
