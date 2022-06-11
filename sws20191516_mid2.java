package MiddleExam;

import java.util.Random; //클래스명 변수명 = new 생성자(인수);
import java.util.Scanner;

public class sws20191516_mid2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //클래스명 변수명 = new 생성자(인수);
		Random random = new Random(); //상동.
		
		int user = 0;
		int com = random.nextInt(3)+1; // 컴퓨터는 1~3까지의 번호를 랜덤으로 받게 해준다
		
		//초기 화면
		System.out.println("───── COMPUTER와 함께하는 가위바위보 게임 ─────");
		System.out.println("안내 : 숫자를 입력해 진행해주세요.");	
		System.out.println("[1] 가위");
		System.out.println("[2] 바위");
		System.out.println("[3] 보 ");
		
		user = scanner.nextInt();
		
		//결과 값 출력
		switch (com) {
		case 1 : //컴퓨터가 가위일 경우
			switch (user) {
			case 1:
				System.out.println("컴퓨터 : 가위,  사용자 : 가위");
				System.out.println("심판 : 사용자, 컴퓨터 무승부 !");
				break;
			case 2:
				System.out.println("컴퓨터 : 가위,  사용자 : 바위");
				System.out.println("심판 : 사용자, 승리 !");
				break;
			case 3:
				System.out.println("컴퓨터 : 가위,  사용자 : 보");
				System.out.println("심판 : 컴퓨터, 승리 !");
				break;
			}
			break;
			
		case 2: //컴퓨터가 바위일 경우
			switch (user) {
			case 1:
				System.out.println("컴퓨터 : 바위,  사용자 : 가위");
				System.out.println("심판 : 컴퓨터, 승리 !");
				break;
			case 2:
				System.out.println("컴퓨터 : 바위,  사용자 : 바위");
				System.out.println("심판 : 사용자, 컴퓨터 무승부 !");
				break;
			case 3:
				System.out.println("컴퓨터 : 바위,  사용자 : 보");
				System.out.println("심판 : 사용자, 승리 !");
				break;
				}
			break;	
			
		case 3:  //컴퓨터가 보일 경우
			switch (user) {
			case 1:
				System.out.println("컴퓨터 : 보,  사용자 : 가위");
				System.out.println("심판 : 사용자, 승리 !");
				break;
			case 2:
				System.out.println("컴퓨터 : 보,  사용자 : 바위");
				System.out.println("심판 : 컴퓨터, 승리 !");
				break;
			case 3:
				System.out.println("컴퓨터 : 보,  사용자 : 보");
				System.out.println("심판 : 사용자, 컴퓨터 무승부 !");
				break;
				}
			break;	
			}
		System.out.println("");
		System.out.println("게임을 종료합니다, 이용해주셔서 감사합니다.");
        	}
	}