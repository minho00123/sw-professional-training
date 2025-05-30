package com.my.sts.dept.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface DeptDao {

	@Select("SELECT * FROM dept")
	List<DeptVo> selectAll();

	@Insert("INSERT INTO dept VALUES (#{deptno}, #{dname}, #{loc})")
	void insertOne(DeptVo bean);

	@Select("SELECT * FROM dept WHERE deptno = #{pk}")
	DeptVo selectOne(int pk);

	@Update("UPDATE dept SET dname = #{dname}, loc = #{loc} WHERE deptno = #{deptno}")
	int updateOne(DeptVo bean);

	@Delete("DELETE FROM dept WHERE deptno = #{pk}")
	int deleteOne(int pk);

}
