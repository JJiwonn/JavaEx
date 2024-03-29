package com.javaex.exception;


import java.io.IOException;

//checkedException: 반드시 예외 처리 필요
// ~try ~ catch로 하거나
// ~throw 로 예외 던지기를 한 경우
public class ThrowsExceptEx {

	public static void main(String[] args) {
		ThrowsExcept except = new ThrowsExcept();
		
		try {
			   except.divide(100,0);
			except.executeRuntimeException();
		except.excuteExcept(); 
		// 여기까지만 하면 checkedException을 아직 처리를 안해줬기 때문에 오류가 난다.
		// ~try ~ catch 나 ~throw 로 해결해줘야함
		} catch (IOException e){
//			e.printStackTrace();
			System.err.println(e.getMessage());
		}catch (CustomArithException e) {
			System.err.println("에러메시지:" + e.getMessage());
			// 상황 정보 확인
			System.err.println("나누어지는 수:" + e.getNum1());
			System.err.println("나누는 수:" + e.getNum2());
		}catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}

	}

}
