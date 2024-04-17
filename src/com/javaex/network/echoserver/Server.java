package com.javaex.network.echoserver;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

// 에코 서버
public class Server {

	public static void main(String[] args) {
		ServerSocket serverSockect = null;
				
		try {
		
		// 서버 소켓 열기
		serverSockect = new ServerSocket();
		// 접속 아이피에 바인딩
		InetSocketAddress bindIp = new InetSocketAddress("0.0.0.0", 10000);
		serverSockect.bind(bindIp);
		
		System.out.println("<서버 시작>");
		System.out.println("[연결을 기다립니다.]");
		// 접속 대기
		while(true) {
		// 클라이언트 접속 -> 통신용 소켓 발급 -> 서버 쓸레드 생성
			Socket socket = serverSockect.accept();
			Thread thread = new ServerThread(socket);
			thread.start();
		}
		
//		System.out.println("=============");
//		System.out.println("<서버 종료>");
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			serverSockect.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	}

}
