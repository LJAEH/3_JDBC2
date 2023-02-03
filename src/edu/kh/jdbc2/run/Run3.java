package edu.kh.jdbc2.run;

import java.util.Scanner;

import edu.kh.jdbc2.model.service.TestService;
import edu.kh.jdbc2.model.vo.TestVO;

public class Run3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 번호, 제목, 내용을 입력받아
		// 번호가 일치하는 행의 제목, 내용 수정
		
		// 수정 성공시 "성공" 실패시 " 일치하는 번호 없음"
		// 예외 발생시 "예외 발생"
		
		Scanner sc = new Scanner(System.in);
		
		TestService ts = new TestService();
		
		System.out.print("수정할 번호 입력");
		int testNo = sc.nextInt();
		sc.nextLine();
		
		System.out.print("제목입력 : ");
		String testTitle = sc.nextLine();
		
		System.out.print("내용 입력: ");
		String testContent = sc.nextLine();
		
		TestVO vo = new TestVO(testNo, testTitle, testContent);
		
		try {
			int result = ts.update(vo);
			
			if(result>0) {
				System.out.println("go");
			} else {
				System.out.println("컷");
			}
		} catch (Exception e) {
			System.out.println("예외발생");
			e.printStackTrace();
		} 
		
	}

}
