package devices;

public abstract class SmartDevice implements Operable{
	private static int deviceCount;
	protected String deviceName;
	protected double devicePrice;
	protected String deviceConnectivity;
	
	public SmartDevice(String deviceName, double devicePrice) {
		if(deviceName != null && devicePrice >= 0) {
			this.deviceName = deviceName;
			this.devicePrice = devicePrice;
			deviceCount++;
		}
	}
	
	public String getDeviceName() {
		return deviceName;
	}
	
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	
	public static int getDeviceCount() {
		return deviceCount;
	}
	
	public void setDeviceConnectivity(String deviceConnectivity) {
		this.deviceConnectivity = deviceConnectivity;
	}
	
	public String getDeviceConnectivity() {
		return deviceConnectivity;
	}
	
	public abstract void setDeviceConnectivity();
	
	public abstract void operate();
	
	public abstract String toString();
}
