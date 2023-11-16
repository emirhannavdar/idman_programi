package idmanProgramı;

import java.util.Scanner;

public class ana {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n***********************\tİDMAN PROGRAMINA HOSGELDİNİZ\t***********************\n");
		
		String idmanlar = "Geçerli hareketler:\n\n"
				+"Burpee hareketi\n"
				+"Pushup hareketi\n"
				+"Situp hareketi\n"
				+"Squat hareketi\n";
		System.out.println(idmanlar);
		
		System.out.println("Bir idman olusturun: ");
		
		System.out.print("Kaç tane burpee hareketi yapıcaksın:        ");
		int burpee = scanner.nextInt();
		System.out.print("Kaç tane pushup hareketi yapıcaksın:        ");
		int pushup = scanner.nextInt();
		System.out.print("Kaç tane situp hareketi yapıcaksın:        ");
		int situp = scanner.nextInt();
		System.out.print("Kaç tane squat hareketi yapıcaksın:        ");
		int squat = scanner.nextInt();
		
		scanner.nextLine();
		
		idman idman1 = new idman(burpee, pushup, situp, squat);
		
		System.out.println("\n********************\tİDMANINIZ BAŞLIYOR\t********************\n");
		
		while(idman1.idmanBittimi() == false) {
			System.out.print("Hangi hareketten yapıcaksın? (burpee,pushup,situp,squat)");
			String hareket = scanner.nextLine();
			System.out.print(hareket + " hareketinden kaç tane yapıcasın?");
			int adet = scanner.nextInt();
			scanner.nextLine();
			idman1.hareketYap(hareket, adet);
			
		}
	
	
	}

}
