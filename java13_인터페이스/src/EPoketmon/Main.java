package EPoketmon;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Epoketmon 으로는 객체 생성 불가능
		
		pikachu p =new pikachu();
		Coil c = new Coil();
		
		Epoketmon e1 = p;
		Epoketmon e2 = c;
		
		Epoketmon e_arr[] = new Epoketmon[2];
		
		e_arr[0] = e1;//=p, 피카츄가 자동으로 전기 포켓몬 타입으로 업캐스팅됨
		e_arr[1] = e2;//=c
		e_arr[0].attact();
	}

}
