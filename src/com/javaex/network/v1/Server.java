package com.javaex.network.v1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

// v1. 접속 대기
public class Server {

	public static void main(String[] args) {
		// 서버 소켓 생성
		ServerSocket serverSocket = null;
		
		try {
		// ip와 포트에 연결 : blid
			serverSocket = new ServerSocket();
			InetSocketAddress local = new InetSocketAddress("127.0.0.1", 10000); // 허용할 ip주소를 ""<-여기에 넣어줘야한다.
			serverSocket.bind(local);
		
			System.out.println("<서버가 시작되었습니다>");
			System.out.println("[연결을 기다립니다]");
		// 연결 대기
			Socket socket = serverSocket.accept();
			
		// 클라이언트 접속시의 처리
			InetSocketAddress socketAddress
			= (InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println("[클라이언트가 연결되었습니다]");
			System.out.println(socketAddress.getAddress() +
					":" + socketAddress.getPort());
		// 후처리
			System.out.println("=========================================");
			System.out.println("<서버가 종료되었습니다>");
		// 접속 허용
		}catch(IOException e) {
			
		}finally {
			// 시스템 자원 해제
			try {
				serverSocket.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
