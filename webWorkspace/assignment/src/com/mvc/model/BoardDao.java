package com.mvc.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mvc.util.Mysql;

public class BoardDao {
	Connection conn;
	Statement stmt;
	ResultSet rs;

	public int getTotalCount(String keyword) {
		int count = 0;
		String sql = "SELECT COUNT(*) FROM board WHERE title LIKE '%" + keyword + "%' OR content LIKE '%" + keyword
				+ "%'";

		try {
			conn = Mysql.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}

				if (stmt != null) {
					stmt.close();
				}

				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return count;
	}

	public List<BoardDto> getList(int page, String keyword) {
		List<BoardDto> list = new ArrayList<BoardDto>();
		int limit = 10;
		String sql = "SELECT * FROM board " + "WHERE title LIKE '%" + keyword + "%' OR content LIKE '%" + keyword
				+ "%' " + "ORDER BY id DESC " + "LIMIT " + ((page - 1) * limit) + ", " + limit;

		System.out.println(sql);
		try {
			conn = Mysql.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(new BoardDto(rs.getInt("id"), rs.getString("userId"), rs.getString("title"),
						rs.getString("content"), rs.getDate("created_at"), rs.getDate("updated_at")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}

				if (stmt != null) {
					stmt.close();
				}

				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}
}
