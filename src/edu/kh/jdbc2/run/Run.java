package edu.kh.jdbc2.run;

import edu.kh.jdbc2.model.service.TestService;
import edu.kh.jdbc2.model.vo.TestVO;

public class Run {

	public static void main(String[] args) {
		
		TestService ts = new TestService();
		
		// TB_TEST 테이블에 INSERT 수행
		TestVO vo1 = new TestVO(1, "제목1", "내용1");
		
		// TB_TEST 테이블에 insert를 수행하는 서비스 메서드를 
		// 호출 후 결과 반환 받기
		try {
			int result = ts.insert(vo1); // 1 // 0
			
			if(result>0) {
				System.out.println("insert성공");
			} else {
				System.out.println("insert실패");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
