package MiddleExam;
/* 메뉴창 : 게임시작/게임방법/개발자소개/게임종료 기능 구현
 * 게임시작시 : 가위바위보 입력칸 제공/결과화면 구성/회차 종료 후 첫 회면으로 리턴
 * 게임방법 : 게임 룰 설명
 * 개발자소개 : 본인 소개
 * 게임종료 : break문 이용 게임 종료 기능 구현
 */
import java.util.Random; //클래스명 변수명 = new 생성자(인수);
import java.util.Scanner;

public class sws20191516_mid1 {

	//단일 메소드를 이용한 가위바위보 게임
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); //클래스명 변수명 = new 생성자(인수);
		Random random = new Random(); //상동.
		
		System.out.println("Welcome ! 컴퓨터랑 하는 가위바위보 게임입니다."); 
			//게임 처음 시작시 나오는 안내 멘트
		while(true) { //break문을 통해 게임 종료를 안 시키는 이상 게임을 계속 반복 시키기 위함.
			//초기 화면
			System.out.println("────────────── COMPUTER와 함께하는 가위바위보 게임 ──────────────");
			System.out.println("안내 : 숫자를 입력해 진행해주세요.");	
			System.out.println("[1] 게임 시작");
			System.out.println("[2] 게임 방법");
			System.out.println("[3] 개 발 자");
			System.out.println("[4] 게임 종료");
		
			int num = scanner.nextInt();
				//[1]-1번 화면(가위바위보 선택)
			if (num == 1) {
				System.out.println("안내 : 숫자를 입력해 진행해주세요.");	
				System.out.println("[1] 가위");
				System.out.println("[2] 바위");
				System.out.println("[3] 보 ");
				
				int user = scanner.nextInt(); // 사용자 입력
				int com = random.nextInt(3)+1; // 컴퓨터는 1~3까지의 번호를 랜덤으로 받게 해준다.
					//[1]-2번 화면(가위바위보 결과 출력)
				if (user <= 3 && user >=1) { //1이상 3이하 경우에만 출력하기 위함.
					System.out.println("Sound : 가위 바위 보 !");
					System.out.println("===== 게임 결과 =====");
					
					
					if(user == 1) {
						System.out.println("사용자 : 가위");
						}
					else if(user == 2) {
						System.out.println("사용자 : 바위");
						}
					else {
						System.out.println("사용자 : 보");
						}
					
					
					if (com == 1) {
						System.out.println("컴퓨터 : 가위");
						}
					else if (com == 2) {
						System.out.println("컴퓨터 : 바위");
						}
					else {
						System.out.println("컴퓨터 : 보");
						}
				
	
					int result = user - com; // 0 : 무승부, -2과 1 사용자 승, -1과 2 컴퓨터 승
					
					if(result == -2 || result == 1) {
						System.out.println("심판 : 사용자 승!");
						System.out.println("처음 화면으로 되돌아갑니다.");
						System.out.println("");
						}
					else if (result == 0) {
						System.out.println("심판 : 사용자, 컴퓨터 무승부 !");
						System.out.println("처음 화면으로 되돌아갑니다.");
						System.out.println("");
						}
					else {
						System.out.println("심판 : 컴퓨터 승!");
						System.out.println("처음 화면으로 되돌아갑니다.");
						System.out.println("");
						}
					}
				else {
					System.out.println("잘못 입력했습니다.");
					}
				}
			else if (num == 2) { // [2]번 화면 - 게임 방법
				System.out.println("───────────────────────── 게임 방법 ────────────────────────");
				System.out.println("본 게임은 가위바위보 게임입니다.");
				System.out.println("가위바위보 게임의 룰은 컴퓨터와 게임을 하며 가위, 바위, 보 중에 한 가지를 내면 서로 상성관계에 의해 승패가 결정되는 방식 입니다.");
				System.out.println("처음으로 되돌아 갑니다.");
				System.out.println("");
				}
			else if (num == 3) { // [3]번 화면 - 개발자 소개
				System.out.println("────────────────────── Programmers ──────────────────────");
				System.out.println("동서대학교 소프트웨어학과 19학번 송원석");
				System.out.println("");
				System.out.println("본 게임을 이용해주셔서 정말 감사합니다, 처음 화면으로 되돌아갑니다.");
				System.out.println("");
				}
			else if (num == 4) { // [4]번 화면 - 게임 종료
				System.out.println("게임을 종료합니다, 이용해주셔서 감사합니다.");
				break; //프로그램 종료
			}
			
			else {               // 1 ~ 4 외 숫자 입력시 오류 내뱉기
				System.out.println("잘못된 번호를 입력하셨습니다.");
				System.out.println("처음 화면으로 되돌아갑니다.");
				System.out.println("");
			}
		}
	}
}