package arraylist;

import java.util.ArrayList;

public class Ex01Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Arraylist 생성하기
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("연어회");
		list.add("잎새주");
		list.add("방어회");
		list.add("조개구이");
		list.add(2,"부대찌개");
		//list.size() 로 사용
		for(int i = 0; i<list.size(); i++)
		System.out.println(list.get(i));
		
		//list.remove(0);
		
		list.size();
	}

}
