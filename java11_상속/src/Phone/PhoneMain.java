package Phone;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FolderPhone p2 = new FolderPhone();
		SmartPhone p3 = new SmartPhone();
		
		
		p2.call();
		
		//스마트폰에 따로 선언을 안했지만 Phone을 상속받았으므로 사용가능하다.
		p3.call();
		
		//부모의 기능을 조금 수정하여 사용하는 것 -> 오버라이딩
		
		
		//부모는 자식꺼 사용 X
		//p1.internet();
		
	
		System.out.println(p3.getSpeaker());
		
		//메서드에는 오버로딩 X
		
	}

}
