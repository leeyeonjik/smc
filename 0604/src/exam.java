

import java.util.Scanner;
public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num ;
		int num2 ;
		int tprice = 8000, price=0;
		System.out.println("아동 수:");
		num =sc.nextInt();
		System.out.println("성인 수:");
		num2=sc.nextInt();
		
		price=(tprice-2000)*num + tprice*num2;
		System.out.println("총수량:"+(num+num2));
		System.out.println("금액"+price);
		
		
		
	}

}
