

import java.util.Scanner;
public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num ;
		int num2 ;
		int tprice = 8000, price=0;
		System.out.println("�Ƶ� ��:");
		num =sc.nextInt();
		System.out.println("���� ��:");
		num2=sc.nextInt();
		
		price=(tprice-2000)*num + tprice*num2;
		System.out.println("�Ѽ���:"+(num+num2));
		System.out.println("�ݾ�"+price);
		
		
		
	}

}
