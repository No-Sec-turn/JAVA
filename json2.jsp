<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="member.MemberBean"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//프로그램 설치 : 자바에서 디비에 접속해서 => 디비내용을 json변경
// WebContent - WEB-INF - lib - json-simple-1.1.1.jar 
// - json에서 활용하는 배열 구문 잇음

//1단계 드라이버로더 (커넥션 풀 이용 가능)
Class.forName("com.mysql.jdbc.Driver");

//2단계 디비연결
String dbUrl = "jdbc:mysql://localhost:3306/jspdb1?serverTimezone=Asia/Seoul&useSSL=false";
//		
		String dbUser = "jspid";
		String dbPass = "jsppass";
		Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
//3단계 sql 구문 - member table 전체 조회
String sql = "select * from member";
PreparedStatement pstmt = con.prepareStatement(sql);
//4단계 rs <= 실행 결과 저장
ResultSet rs = pstmt.executeQuery();
// 5단계 rs 첫행으로 이동 데이터 있으면 true 
//                      자바빈객체생성 멤버변수 <= rs열 내용 저장
//                         배열 한칸에 저장
// List list = new ArrayList();

JSONArray list = new JSONArray();
while(rs.next()){
// 	MemberBean mb = new MemberBean();
	JSONObject mb = new JSONObject();
	
// 	mb.setId(rs.getString("id"));
// 	mb.setPass(rs.getString("pass"));
// 	mb.setName(rs.getString("name"));
// 	mb.setDate(rs.getTimestamp("date"));
	
	mb.put("id", rs.getString("id"));
	mb.put("pass", rs.getString("pass"));
	mb.put("name", rs.getString("name"));
	mb.put("date", rs.getString("date"));  //json에서는 date를 문자 취급
	
//배열 한칸 저장
	list.add(mb);
	
}

%>

<%=list%>
