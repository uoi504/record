package functions;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import objects.Member;

public class AddMembers {
	
	private Map<Integer,Member> mMembers;
	
	public void addMember(String arg){
		//add to hash and print set;
		
		mMembers = new HashMap<Integer,Member>();
		int cnt = Integer.parseInt(arg);
		if(cnt>100000){
			System.out.println("�ִ� ȸ������ �ʰ��Ͽ����ϴ�. ���α׷��� �����մϴ�.");
			System.exit(0);
		}
		
		for(int i=0;i<cnt;i++){
			
			Member nMember = createMember();			
			mMembers.put(nMember.getNumber(), nMember);
			System.out.println(nMember.toString());
		}

		mMembers.clear();
		System.out.println("--Complete--");
	}
	
	private Member createMember(){
		//create Member object random 
		int num = createNumber();
		
		Member member = new Member(num,createCode(num),createGrade());
		
		return member;
	}
	
	private int createNumber(){
		//create member number random range 0~99999
		Random random = new Random();
		int randNum;
		
		do{
		randNum= random.nextInt(100000);
		}while(!checkNumber(randNum));
		
		return randNum;
	}
	
	private boolean checkNumber(int rdNum){
		//check overlapping
		if(mMembers.get(rdNum)!=null){
			return false;	
		}else{
			return true;
		}
	}
	private String createCode(int num){
		//create member code with member number
		String code = String.format("%05d", num);
		
		return "NT"+code;
	}
	private int createGrade(){
		//random grade range 0~100
		Random random = new Random();
		
		return random.nextInt(100);
	}
}
