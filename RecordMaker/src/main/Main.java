package main;

import functions.AddMembers;

public class Main {

	public static void main(String[] args) {
		// main

		if(args.length!=1){
			System.out.println("입력 형식이 맞지 않습니다. argument 값 : 1개 필요");
		}else{
			AddMembers add = new AddMembers();
			add.addMembers(args[0]);
		}
		
	}

}
