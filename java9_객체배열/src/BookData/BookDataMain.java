package BookData;

import java.util.ArrayList;
import java.util.Scanner;

public class BookDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner sc = new Scanner(System.in);
	      ArrayList<BookData> al = new ArrayList<BookData>();

	      int menu = 0; // 사용자가 사용하고 싶은 메뉴 저장 변수
	      
	      while(menu!=4) {
	         System.out.println("1)책 추가 2)책 삭제 3)내가 살 수 있는 책 4)종료");
	         menu = sc.nextInt();
	         
	         if(menu==1) {
	            System.out.print("책 이름 : ");
	            String name = sc.next();
	            System.out.print("가격 : ");
	            int price = sc.nextInt();
	            System.out.print("작가 : ");
	            String writer = sc.next();
	            
	            al.add(new BookData(name, price, writer));
	            
	         }else if(menu==2) {
	            for(int i=0; i<al.size(); i++) {
	               System.out.printf("%d. %s\t%d\t%s\n",i+1, al.get(i).getTitle(), al.get(i).getPrice(), al.get(i).getWriter());
	            }
	            
	            System.out.print("삭제하고 싶은 책 >>");
	            int del_num = sc.nextInt();
	            
	            al.remove(del_num-1);
	         }else if(menu==3) {
	            System.out.print("금액을 입력하시오 : ");
	            int money = sc.nextInt();
	            
	            for(int i=0; i<al.size(); i++) {
	               if(money>=al.get(i).getPrice()) {
	                  System.out.printf("%d. %s\t%d\t%s\n",i+1, al.get(i).getTitle(), al.get(i).getPrice(), al.get(i).getWriter());
	               }
	            }
	         }
	      }

	   }

	}
