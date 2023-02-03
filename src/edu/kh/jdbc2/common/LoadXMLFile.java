package edu.kh.jdbc2.common;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class LoadXMLFile {
	public static void main(String[] args) {
		
		// XML 파일 읽어오기(Properties, FileinputStream)
		
		try {
			Properties prop = new Properties(); // Map<String:String>
			
			// driver.xml 파일을 읽어오기 위한 InputStream 객체 생성
			FileInputStream fis = new FileInputStream("driver.xml");
			
			// 연결된 driver.xml파일에 있는 내용을 모두 읽어와
			// properties 객체에 k:v 형식으로 저장
			
			prop.loadFromXML(fis);
			
			System.out.println(prop);
			
			// Property : 속성(데이터)
			
			// prop.getProperty("key") : key가 일치하는 속성(데이터)를 얻어옴
			
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String user = prop.getProperty("user");
			String pw = prop.getProperty("pw");
			
			System.out.println();
			
			// debug 활용해서 객체에 들어간 값 확인해보기
			
			/*
			
			왜 XML 파일을 이용해서 DB 연결정보를 읽어와야 할까?
			
			1. 코드 중복 제거
			2. 별도 관리가 용이
			3. 재 컴파일을 하지않기위해서
			   - 코드가 길수록 컴파일에 소요되는 시간이 큼
			   - 따라서 코드 수정으로 인한 컴파일 소요시간 없앰
			   ( 파일의 내용을 읽어오는 코드만 작성해두면 java코드 수정없이, 
			   파일 내용만 수정하면 재 컴파일 수행되지않는다. )
			4. XML 파일에 작성된 문자열 형태를 그대로 읽어오기 때문에
			   SQL 작성시 편리하다.
		
			
			 */

			// driver.xml 파일에서 읽어온 값들을 이용해 Connection 생성
			  
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url,user,pw);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
