package 메소드;

public class Ex07메소드_예제7_피보나치 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num4=10;
		int result4 = fibonacci(num4);
		
		System.out.println("피보나치 수열의 "+num4+"번째 항은 "+ result4+" 입니다.");
	}
	public static int fibonacci(int num4) {
		
		int result4=0;
		
		
		if(num4 ==1){
			result4 = 1;
		}
		else if(num4 == 2){
		result4 = 1;
		}
		else 
			result4 = fibonacci(num4-2)+fibonacci(num4-1);
		return result4;
		
		/*
		int a[] = new int[100];
		a[0] = 1;
		a[1] = 1;
		for(int i =0; i<a.length-2; i++) {
			a[i+2] = a[i]+a[i+1];
		}
		int result = a[num4-1];
		return result;
		*/
	}
}

/* if(num4 ==1){
	result4 = 1;
} else if(num4 == 2){
result4 = 1;
}
else{
result+fibonacci(num4);
}



}*/