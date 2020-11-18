import java.util.Scanner;

public class P362_Navida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//VARIABLES
		int numConsult = 0;
		int dia = 0;
		int mes = 0;
		
		
		//ALGORITME
		numConsult = sc.nextInt();
		
		for (int i = 0; i <= numConsult; i++) {
			dia = s.nextInt();
			mes = s.nextInt();

			if(dia == 25){
				if(mes == 12){
					System.out.println("SI");
				} else {
					System.out.println("NO");
				}
			} else {
				System.out.println("NO");
			}
