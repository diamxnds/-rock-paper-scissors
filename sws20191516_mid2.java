package MiddleExam;

import java.util.Random; //Ŭ������ ������ = new ������(�μ�);
import java.util.Scanner;

public class sws20191516_mid2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //Ŭ������ ������ = new ������(�μ�);
		Random random = new Random(); //��.
		
		int user = 0;
		int com = random.nextInt(3)+1; // ��ǻ�ʹ� 1~3������ ��ȣ�� �������� �ް� ���ش�
		
		//�ʱ� ȭ��
		System.out.println("���������� COMPUTER�� �Բ��ϴ� ���������� ���� ����������");
		System.out.println("�ȳ� : ���ڸ� �Է��� �������ּ���.");	
		System.out.println("[1] ����");
		System.out.println("[2] ����");
		System.out.println("[3] �� ");
		
		user = scanner.nextInt();
		
		//��� �� ���
		switch (com) {
		case 1 : //��ǻ�Ͱ� ������ ���
			switch (user) {
			case 1:
				System.out.println("��ǻ�� : ����,  ����� : ����");
				System.out.println("���� : �����, ��ǻ�� ���º� !");
				break;
			case 2:
				System.out.println("��ǻ�� : ����,  ����� : ����");
				System.out.println("���� : �����, �¸� !");
				break;
			case 3:
				System.out.println("��ǻ�� : ����,  ����� : ��");
				System.out.println("���� : ��ǻ��, �¸� !");
				break;
			}
			break;
			
		case 2: //��ǻ�Ͱ� ������ ���
			switch (user) {
			case 1:
				System.out.println("��ǻ�� : ����,  ����� : ����");
				System.out.println("���� : ��ǻ��, �¸� !");
				break;
			case 2:
				System.out.println("��ǻ�� : ����,  ����� : ����");
				System.out.println("���� : �����, ��ǻ�� ���º� !");
				break;
			case 3:
				System.out.println("��ǻ�� : ����,  ����� : ��");
				System.out.println("���� : �����, �¸� !");
				break;
				}
			break;	
			
		case 3:  //��ǻ�Ͱ� ���� ���
			switch (user) {
			case 1:
				System.out.println("��ǻ�� : ��,  ����� : ����");
				System.out.println("���� : �����, �¸� !");
				break;
			case 2:
				System.out.println("��ǻ�� : ��,  ����� : ����");
				System.out.println("���� : ��ǻ��, �¸� !");
				break;
			case 3:
				System.out.println("��ǻ�� : ��,  ����� : ��");
				System.out.println("���� : �����, ��ǻ�� ���º� !");
				break;
				}
			break;	
			}
		System.out.println("");
		System.out.println("������ �����մϴ�, �̿����ּż� �����մϴ�.");
        	}
	}