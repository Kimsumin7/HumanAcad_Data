package com.human.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	public static void main(String args[]) {
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			//1. 사용할 DB선택
			//ojdbc8_g.jar파일이 등록되지 않았거나 오타가 있으면
			//ClassNotFoundException 예뢰가 발생함 예외처리를 해주어야 한다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩");
			
			//연결할 DB주소
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="c##human";//연결할 DB ID
			String pw="human";//연결할 DB PW
			//2.연결정보를 이용해서 연결 할때 필요한 정보 객체(Connection) 생성
			conn=DriverManager.getConnection(url,user,pw);
			System.out.println("데이터베이스 접속 성공");
			
			//3.연결된 상태 객체(Statement)를 생성
			st=conn.createStatement();
			//4.연결객체를 통해 executeQuery나 executeUpdate를 이용해서 데이터를 요청
			//executeQuery를 통해 생성된 데이터를 ResultSet객체에 담아서 처리함
			//sql 문자열이 잘못되면 SQLException이 발생한다.
			rs=st.executeQuery("select * from human");
			while(rs.next()) {//다음데이터가 있는지 확인해서 없으면 false,있으면 true 
				//true이면 다음데이터에 접근할수 있도록 rs데이터 세팅됨
//				int no=rs.getInt(1);//가져올 데이터 자료형에 따라 getInt나 getString등 을 사용
//				String hp=rs.getString("hp");//데이터컬럼을 컬럼이름으로 값을 가져옴
//				String addr=rs.getString(3);//데이터 컬럼을 숫자로 순서대로 값을 가져옴
//				String name=rs.getString(4);
//				System.out.println(no+":"+hp+":"+addr+":"+name);
			}
			System.out.println("출력완료");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {//사용한 객체를 역순으로 종료한다.
				if(rs!=null)rs.close();
				if(st!=null)st.close();
				if(conn!=null)conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}finally {
				rs=null;st=null;conn=null;
			}
		}
		System.out.println("TEST");
	}

}
