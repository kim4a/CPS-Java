package television;

public class TestTV {

	public static void main(String[] args) {
		TV tv = new TV();
		TV tv2 = new TV(3);
		
		tv2.powerOn();
		System.out.printf("TV2 Channel %d\n", tv2.getChannel());
		
		tv.powerOn();
		
		for (int i = 0; i < 10; i++) {
			System.out.printf("Channel %d\n", tv.getChannel());
			tv.channelUp();
		}
		
//		int ch = tv.getChannel();
//		
//		if (ch > 0)
//			System.out.println(ch);
//		else
//			System.out.println("TV is off");
	}

}
