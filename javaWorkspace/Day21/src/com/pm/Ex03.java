package com.pm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class Ex03 {
	static int id = 1;

	public static void main(String[] args) {
		// 학생성적관리 프로그램(ver 0.20.0)
		// 1.보기 2.입력 [3.수정 4.삭제] 0.종료

		Scanner sc = new Scanner(System.in);
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Properties properties = new Properties();
		properties.setProperty("user", "scott");
		properties.setProperty("password", "tiger");
		OracleDriver driver = new OracleDriver();
		Connection connection = null;
		Statement statement = null;
		java.sql.ResultSet resultSet = null;

		System.out.println("학생성적관리프로그램(ver 0.9.0)");
		try {
			String tableCreation = "CREATE table studentScoreData (id NUMBER, korean NUMBER, english NUMBER, math NUMBER, sum NUMBER, average NUMBER(5, 2))";
			connection = DriverManager.getConnection(url, properties);
			statement = connection.createStatement();
			resultSet = statement.executeQuery(tableCreation);

			while (true) {
				System.out.print("1.보기 2.입력 [3.수정 4.삭제] 0.종료> ");
				int userInput = sc.nextInt();

				if (userInput == 0) {
					System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
					return;
				}

				if (userInput == 1) {
					String dataSelection = "SELECT * FROM studentScoreData ORDER BY id";
					resultSet = statement.executeQuery(dataSelection);
					System.out.println("-----------------------------------------------");
					System.out.println("학번\t국어\t영어\t수학\t합계\t평균");
					System.out.println("-----------------------------------------------");
					while (resultSet.next()) {
						System.out.print(resultSet.getObject(1) + "\t");
						System.out.print(resultSet.getObject(2) + "\t");
						System.out.print(resultSet.getObject(3) + "\t");
						System.out.print(resultSet.getObject(4) + "\t");
						System.out.print(resultSet.getObject(5) + "\t");
						System.out.println(resultSet.getObject(6) + "\t");
					}
				}

				if (userInput == 2) {
					System.out.print("국어> ");
					int koreanScore = sc.nextInt();
					System.out.print("영어> ");
					int englishScore = sc.nextInt();
					System.out.print("수학> ");
					int mathScore = sc.nextInt();

					int sum = koreanScore + englishScore + mathScore;
					double average = sum / 3.0;

					String dataInsertion = String.format(
							"INSERT INTO studentScoreData VALUES (%d, %d, %d, %d, %d, %.2f)", id++, koreanScore,
							englishScore, mathScore, sum, average);
					resultSet = statement.executeQuery(dataInsertion);
				}

				if (userInput == 3) {
					System.out.print("학번> ");
					int updateId = sc.nextInt();
					System.out.print("국어> ");
					int koreanScore = sc.nextInt();
					System.out.print("영어> ");
					int englishScore = sc.nextInt();
					System.out.print("수학> ");
					int mathScore = sc.nextInt();

					int sum = koreanScore + englishScore + mathScore;
					double average = sum / 3.0;

					String scoreUpdate = String.format(
							"UPDATE studentScoreData set korean=%d, english=%d, math=%d, sum=%d, average=%.2f WHERE id=%d",
							koreanScore, englishScore, mathScore, sum, average, updateId);
					resultSet = statement.executeQuery(scoreUpdate);
				}

				if (userInput == 4) {
					System.out.print("학번> ");
					int deleteId = sc.nextInt();

					String scoreDelete = String.format("DELETE from studentScoreData WHERE id=%d", deleteId);
					resultSet = statement.executeQuery(scoreDelete);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
