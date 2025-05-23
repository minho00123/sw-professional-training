package com.my.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.myframework.JdbcTemplate;
//import com.myframework.JdbcTemplate1;
//import com.myframework.JdbcTemplate2;

public class DeptDao {
	Logger logger = Logger.getLogger(this.getClass().getCanonicalName());

	public DeptDao() {
		logger.setLevel(Level.INFO);
	}

	public List<DeptDto> selectAll() throws SQLException {
		String sql = "select * from dept";
		JdbcTemplate template = new JdbcTemplate(MyData.getConnection()) {

			@Override
			public Object rowMap(ResultSet rs) throws SQLException {
				return new DeptDto(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
			}

			@Override
			public void setPrepare(PreparedStatement pstmt) throws SQLException {
			}
		};
		return template.executeList(sql);
	}

	public DeptDto selectOne(int deptno) throws SQLException {
		String sql = "select * from dept where deptno=?";
		JdbcTemplate template = new JdbcTemplate(MyData.getConnection()) {

			@Override
			public void setPrepare(PreparedStatement pstmt) throws SQLException {
				pstmt.setInt(1, deptno);
			}

			@Override
			public Object rowMap(ResultSet rs) throws SQLException {
				return new DeptDto(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
			}
		};

		return (DeptDto) template.executeOne(sql);
	}

	public int insertOne(DeptDto bean) throws SQLException {
		String sql = "insert into dept values (?, ?, ?)";
		JdbcTemplate template = new JdbcTemplate() {

			@Override
			public void setPrepare(PreparedStatement pstmt) throws SQLException {
				pstmt.setInt(1, bean.getDeptno());
				pstmt.setString(2, bean.getDname());
				pstmt.setString(3, bean.getLoc());
			}

			@Override
			public Object rowMap(ResultSet rs) throws SQLException {
				return null;
			}
		};

		template.setConn(MyData.getConnection());
		return template.executeUpdate(sql);
	}

	public int deleteOne(int deptno) throws SQLException {
		String sql = "delete from dept where deptno=?";
		JdbcTemplate template = new JdbcTemplate() {

			@Override
			public void setPrepare(PreparedStatement pstmt) throws SQLException {
				pstmt.setInt(1, deptno);
			}

			@Override
			public Object rowMap(ResultSet rs) throws SQLException {
				return null;
			}
		};

		template.setConn(MyData.getConnection());
		return template.executeUpdate(sql);
	}

	public int updateOne(DeptDto bean) throws SQLException {
		String sql = "update dept set dname=?, loc=? where deptno=?";
		JdbcTemplate template = new JdbcTemplate(MyData.getConnection()) {

			@Override
			public void setPrepare(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, bean.getDname());
				pstmt.setString(2, bean.getLoc());
				pstmt.setInt(3, bean.getDeptno());
			}

			@Override
			public Object rowMap(ResultSet rs) throws SQLException {
				return null;
			}
		};

		return template.executeUpdate(sql);
	}

//	public int insertOne(DeptDto bean) throws SQLException {
//		String sql = "insert into dept values (?, ?, ?)";
//
//		return executeUpdate(sql, new Object[] { bean.getDeptno(), bean.getDname(), bean.getLoc() });
//	}
//
//	public int deleteOne(int deptno) throws SQLException {
//		String sql = "delete from dept where deptno=?";
//
//		return executeUpdate(sql, new Object[] { deptno });
//	}
//
//	public int updateOne(DeptDto bean) throws SQLException {
//		String sql = "update dept set dname=?, loc=? where deptno=?";
//		Object[] objs = { bean.getDname(), bean.getLoc(), bean.getDeptno() };
//
//		return executeUpdate(sql, objs);
//	}
//
//	public int executeUpdate(String sql, Object[] objs) throws SQLException {
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//
//		try {
//			conn = MyData.getConnection();
//			pstmt = conn.prepareStatement(sql);
//			for (int i = 0; i < objs.length; i++) {
//				pstmt.setObject(i + 1, objs[i]);
//			}
//
//			return pstmt.executeUpdate();
//		} finally {
//			close(null, pstmt, conn);
//		}
//	}

//	public void close(ResultSet rs, PreparedStatement pstmt, Connection conn) throws SQLException {
//		if (rs != null)
//			rs.close();
//		if (pstmt != null)
//			pstmt.close();
//		if (conn != null)
//			conn.close();
//	}
}
