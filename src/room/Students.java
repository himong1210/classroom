package room;

public class Students {

	public static void main(String[] args) {
		String stName = "우리 반 훈련생 3명 명단";
		String[] student = {"김규리", "이소란", "유필립"};
		
		System.out.println("=== " + stName + " ===");
		
		for (int i = 0; i < student.length; i++) {
			if (i == 0) {
				System.out.println((i + 1) + ". [내국인] " + student[i]);
			} else {
				System.out.println((i + 1) + ". [외국인] " + student[i]);
			}
		}

	}

}



//'우리 반 훈련생 3명 명단' 또는 '오늘의 할 일(To-Do) 3가지'를 출력하는 소스코드를 작성하시오