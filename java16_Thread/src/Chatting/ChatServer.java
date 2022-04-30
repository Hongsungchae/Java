package Chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

//여러 사용자의 접속과 채팅을 동시에 수행하도록 해야함
public class ChatServer extends Thread {

	//좁속한 클라이언트의 소켓 저장
	ArrayList<Socket> clientList = new ArrayList<Socket>();
	Socket socket = null; //유저 소켓정보를 할당받을 필드
	
	public ChatServer(Socket socket) { //서버 소켓 생성자
		
		this.socket = socket;// 유저의 소켓정보를 할당
		clientList.add(socket);
	}
	//Thread의 run()메서드 오버라이딩, 같이 작업이 진행되야할 때 삽입
	public void run() {
		try {
		//1. 접속한 클라이언트의 ip주소 출력
		//getInetAddress() : 접속한 클라이언트 소켓정보중 ip주소 얻는 메소드
		System.out.println(socket.getInetAddress() + "IP클라이언트 접속!");
		
		//2. 클라이언트에게 서버에 잘 연결되었다는 메세지 보내기
		//OutputStream : 외부로 메세지를 보내기 위해 사용
		OutputStream out =socket.getOutputStream();
		//PrintWriter : 출력기능 수행
		PrintWriter writer = new PrintWriter(out, true);
		writer.println("채팅프로그램에 입장되었습니다. 사용할 닉네임을 작성해주세요!");
		
		//3. 클라이언트가 보낸 메세지 읽기
		//InputStream : 외부로부터 메세지를 받기 위해 사용
		InputStream in = socket.getInputStream();
		//InputStreamReader : 입력스트림으로부터 읽은 데이터를 지정된 인코딩방식으로 문자를 변환하는 기능 
		//BufferdReader : InputStreamReader는 읽은 데이터의 글자 수 만큼 배열을 생성을 해주어야함
		//이를 해결하기 위해서 임시저장공간 사용
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String message; //Client가 보낸 메세지 저장
		String nick = null; //Cient의 닉네임 저장
		boolean conn = false; //Client가 처음 연결시에는 false->true, 그다음 요청시에는 계속 true
		
		while((message = reader.readLine())!= null) { //클라이언트가 메세지를 입력할 때마다 수행
			if(!conn) {//4.맨처음 접속했을 때에만 실행할 부분
				nick = message;
				conn = true;
				writer.println(nick + "님이 접속하였습니다."); //서버 -> 클라이언트에게
			}else {//5. 한 클라이언트가 입력한 메세지를 다른 클라이언트에게 알려주기!
				for(int i = 0; i<clientList.size(); i++) {
					out = clientList.get(i).getOutputStream();
					writer = new PrintWriter(out,true);
					writer.println(nick + ":" + message);
					
				}
			
			}
			
		}
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		
		int socketPort = 1234;//서버소켓
		try {
			ServerSocket serverSocket = new ServerSocket(socketPort);
			//서버 오픈확인
			System.out.println(socketPort + "으로 서버 오픈!");
			//서버가 종료될때까지 클라이언트의 접속을 받아주고 채팅기능을 수행(쓰레드 시작)
			while(true) {
				
				Socket socketUser = serverSocket.accept();
				ChatServer server = new ChatServer(socketUser);
				server.start();//Thread 클래스에 정의되어 있는 메소드
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
 