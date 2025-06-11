package com.my.sts.model.entity;

import com.my.sts.model.DeptVo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dept {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
//	@GeneratedValue(strategy = GenerationType.SEQUENCE) // oracle: sequence
//	@GeneratedValue(strategy = GenerationType.TABLE) // sequence에 해당하는 테이블 생성하여 관리
//	@GeneratedValue(strategy = GenerationType.AUTO) // 자동. application.properties의 dialect를 기반으로 자동 생성
	private int deptno;

	@Column(length = 10, nullable = false)
	private String dname;

	@Column(length = 10, nullable = true)
	private String loc;

//	@Transient
//	@Column(columnDefinition = "TEXT")
//	private String memo;

	public DeptVo voBuild() {
		return DeptVo.builder().deptno(deptno).dname(dname).loc(loc).build();
	}

}
