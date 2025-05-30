package com.am;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex02 {

	public static void main(String[] args) {
		String msg = "https://www.google.com/search?sca_esv=278fbbff388c9483&sxsrf=AHTn8zpMgmNJY8e9OSN18WYYqPoAB4c4uQ:1743390965268&q=%EB%8F%84%EB%A9%94%EC%9D%B8+%EA%B5%AC%EB%A7%A4&udm=2&fbs=ABzOT_CZsxZeNKUEEOfuRMhc2yCIle3NjqrdI1yz4YBXXweAYROj_ssEdoGUqgqRO4_tQus9UEXRd2cQ6AZUANa6BbALH9VlD13tY4dy6_S1MxiV5njdIGzcurINDFIuBw78-Z7mQWVkKsUGuBpL4lEoDnvD3qhWyQtn0_gvPEVU-UiHOKxWYE6GZkzloQ6wYB_W9a3rdJWYWwyj-cMrPsBgBuDlxG2EBQ&sa=X&ved=2ahUKEwjv28G5rbOMAxVbyzQHHZsnCAYQtKgLegQIHhAB&biw=1920&bih=945";
//		String msg = "http://123.0.0.1:9092";
		java.net.URL url = null;

		try {
			url = new URL(msg);
			System.out.println(url.getProtocol()); // 통신방식
			System.out.println(url.getHost()); // 도메인 -> ip
			System.out.println(url.getPort()); // http: 80, https: 443
			System.out.println(url.getDefaultPort());
			System.out.println(url.getPath()); // 찾고자하는 디렉토리 경로 / 요청경로 및 파일명
			System.out.println(url.getQuery()); // key=val 쌍의 요청 정보
			System.out.println(url.getRef()); // 위치 지시
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
