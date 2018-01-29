package television;

public class TV {
	
	final int maxChannel = 8;
	private int channel;
	private boolean power;
	
	public TV() {
		this(0); // calls TV(0);
	}
	
	public TV(int c) {
		power = false;
		channel = c;
	}
	
	public int getChannel() {
		if (power)
			return (channel - 1) % maxChannel + 1;
		else
			return -1;
	}
	
	public void setChannel(int c) {
		if (power && c > 0 && c <= maxChannel)
			channel = c;
	}
	
	public void powerOn() {
//		channel = 1;
		power = true;
	}
	
	public void powerOff() {
		channel = 0;
		power = false;
	}
	
	public void channelUp() {
		channel++;
	}
	
	public void channelDown() {
		channel--;
	}

}
