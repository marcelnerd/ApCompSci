
public class ForcefulHello {

	public static void newMain() {
		String target = "Hello World!";
		String current = "";
		int location = 0;
		while(location < target.length()-1) {
			for(int i = 30; i < 145; i++) {
				System.out.println(current + ((char) i));
				if(((char) i) == (target.charAt(location))) {
					current += ((char) i);
					location++;
					break;
				}
			}
		}
	}

}
