package room;

public class Test1 {
	public static void main(String[] args) {
		// 1. 변수 및 배열 선언
		String libraryName = "부산 AI 도서관";
		String[] books = {"이것이 자바다", "이것이 스프링 부트다", "Do it! SQL 입문"};
		System.out.println("=== " + libraryName + " 도서 목록 ===");
		
		
		// 2. 반복문(for)과 조건문(if) 활용
		for (int i = 0; i < books.length; i++) {
		if (i == 0) {
		System.out.println((i + 1) + ". [추천도서] " + books[i]);
		} else {
		System.out.println((i + 1) + ". [일반도서] " + books[i]);
		}
		}
}
}