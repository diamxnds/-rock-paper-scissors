package MiddleExam;
/* �޴�â : ���ӽ���/���ӹ��/�����ڼҰ�/�������� ��� ����
 * ���ӽ��۽� : ���������� �Է�ĭ ����/���ȭ�� ����/ȸ�� ���� �� ù ȸ������ ����
 * ���ӹ�� : ���� �� ����
 * �����ڼҰ� : ���� �Ұ�
 * �������� : break�� �̿� ���� ���� ��� ����
 */
import java.util.Random; //Ŭ������ ������ = new ������(�μ�);
import java.util.Scanner;

public class sws20191516_mid1 {

	//���� �޼ҵ带 �̿��� ���������� ����
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); //Ŭ������ ������ = new ������(�μ�);
		Random random = new Random(); //��.
		
		System.out.println("Welcome ! ��ǻ�Ͷ� �ϴ� ���������� �����Դϴ�."); 
			//���� ó�� ���۽� ������ �ȳ� ��Ʈ
		while(true) { //break���� ���� ���� ���Ḧ �� ��Ű�� �̻� ������ ��� �ݺ� ��Ű�� ����.
			//�ʱ� ȭ��
			System.out.println("���������������������������� COMPUTER�� �Բ��ϴ� ���������� ���� ����������������������������");
			System.out.println("�ȳ� : ���ڸ� �Է��� �������ּ���.");	
			System.out.println("[1] ���� ����");
			System.out.println("[2] ���� ���");
			System.out.println("[3] �� �� ��");
			System.out.println("[4] ���� ����");
		
			int num = scanner.nextInt();
				//[1]-1�� ȭ��(���������� ����)
			if (num == 1) {
				System.out.println("�ȳ� : ���ڸ� �Է��� �������ּ���.");	
				System.out.println("[1] ����");
				System.out.println("[2] ����");
				System.out.println("[3] �� ");
				
				int user = scanner.nextInt(); // ����� �Է�
				int com = random.nextInt(3)+1; // ��ǻ�ʹ� 1~3������ ��ȣ�� �������� �ް� ���ش�.
					//[1]-2�� ȭ��(���������� ��� ���)
				if (user <= 3 && user >=1) { //1�̻� 3���� ��쿡�� ����ϱ� ����.
					System.out.println("Sound : ���� ���� �� !");
					System.out.println("===== ���� ��� =====");
					
					
					if(user == 1) {
						System.out.println("����� : ����");
						}
					else if(user == 2) {
						System.out.println("����� : ����");
						}
					else {
						System.out.println("����� : ��");
						}
					
					
					if (com == 1) {
						System.out.println("��ǻ�� : ����");
						}
					else if (com == 2) {
						System.out.println("��ǻ�� : ����");
						}
					else {
						System.out.println("��ǻ�� : ��");
						}
				
	
					int result = user - com; // 0 : ���º�, -2�� 1 ����� ��, -1�� 2 ��ǻ�� ��
					
					if(result == -2 || result == 1) {
						System.out.println("���� : ����� ��!");
						System.out.println("ó�� ȭ������ �ǵ��ư��ϴ�.");
						System.out.println("");
						}
					else if (result == 0) {
						System.out.println("���� : �����, ��ǻ�� ���º� !");
						System.out.println("ó�� ȭ������ �ǵ��ư��ϴ�.");
						System.out.println("");
						}
					else {
						System.out.println("���� : ��ǻ�� ��!");
						System.out.println("ó�� ȭ������ �ǵ��ư��ϴ�.");
						System.out.println("");
						}
					}
				else {
					System.out.println("�߸� �Է��߽��ϴ�.");
					}
				}
			else if (num == 2) { // [2]�� ȭ�� - ���� ���
				System.out.println("�������������������������������������������������� ���� ��� ������������������������������������������������");
				System.out.println("�� ������ ���������� �����Դϴ�.");
				System.out.println("���������� ������ ���� ��ǻ�Ϳ� ������ �ϸ� ����, ����, �� �߿� �� ������ ���� ���� �󼺰��迡 ���� ���а� �����Ǵ� ��� �Դϴ�.");
				System.out.println("ó������ �ǵ��� ���ϴ�.");
				System.out.println("");
				}
			else if (num == 3) { // [3]�� ȭ�� - ������ �Ұ�
				System.out.println("�������������������������������������������� Programmers ��������������������������������������������");
				System.out.println("�������б� ����Ʈ�����а� 19�й� �ۿ���");
				System.out.println("");
				System.out.println("�� ������ �̿����ּż� ���� �����մϴ�, ó�� ȭ������ �ǵ��ư��ϴ�.");
				System.out.println("");
				}
			else if (num == 4) { // [4]�� ȭ�� - ���� ����
				System.out.println("������ �����մϴ�, �̿����ּż� �����մϴ�.");
				break; //���α׷� ����
			}
			
			else {               // 1 ~ 4 �� ���� �Է½� ���� �����
				System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�.");
				System.out.println("ó�� ȭ������ �ǵ��ư��ϴ�.");
				System.out.println("");
			}
		}
	}
}