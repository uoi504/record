package main;

import functions.AddMembers;

public class Main {

	public static void main(String[] args) {
		// main

		if(args.length!=1){
			System.out.println("�Է� ������ ���� �ʽ��ϴ�. argument �� : 1�� �ʿ�");
		}else{
			AddMembers add = new AddMembers();
			add.addMembers(args[0]);
		}
		
	}

}
