package ¹Ýº¹¹®;

public class Ex16¹Ýº¹¹®_for°úÁ¦ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i = 1; i <=5; i++)
		{
			for( j = 5; j>i;j--)
			{
				System.out.print(" ");
			}

			for( k = 1; k < i*2; k++) {
			System.out.print("*");
			}
			System.out.println(" ");
		}//À­»ï°¢Çü
		for(i=5; i>=1; i--) {
			for(j = i; j<5; j++) {
				System.out.print(" ");
			}
			for(k = 1; k <i*2; k++) {
				System.out.print("*");
				}
				System.out.print("\n");
			}//À­»ï°¢Çü
		}
	}


