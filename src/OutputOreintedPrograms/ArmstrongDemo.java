package OutputOreintedPrograms;

import java.util.Scanner;

public class ArmstrongDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter number");
		int x = sn.nextInt();
		int temp = x;
		int sum = 0;
		int temp1 = temp;
		int len = 0;
		while (x > 0) {
			x = x / 10;
			len++;
		}

		while (temp > 0) {
			int mul = 1;
			int num = temp % 10;
			temp = temp / 10;

			for (int i = 1; i <= len; i++) {
				mul *= num;
			}
			sum += mul;
		}

		if (temp1 == sum) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}

	}

}
