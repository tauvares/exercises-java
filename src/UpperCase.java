
public class UpperCase {

	public static String upperCase(String s) {
		// TODO Auto-generated method stub
		if (s.isEmpty())
			return "The String should have at least one letter";
		else {
			byte bytes[] = s.getBytes();
			int difference = "A".getBytes()[0] - "a".getBytes()[0];
			int space = " ".getBytes()[0];
			int upperCase = "Z".getBytes()[0];
			for (int i = 0; i < bytes.length; i++) {
				if ((bytes[i] != space)&&(bytes[i]>upperCase))
					bytes[i] += difference;
			}
			return new String(bytes);
		}
	}

}
