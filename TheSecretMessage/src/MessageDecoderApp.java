import java.util.Scanner;
public class MessageDecoderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		MessageDecoder MessageDecoder = new MessageDecoder();
		System.out.println(MessageDecoder.decodeCharacter(scan.next().charAt(0)));
		scan.close();
	}

}
