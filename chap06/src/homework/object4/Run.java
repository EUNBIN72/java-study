package homework.object4;

public class Run {

	public static void main(String[] args) {
		Person pp = new Person();
		
		pp.setName("김철수");
		pp.setAge(20);
		
		System.out.println(pp.getName() + "는 " + pp.getAge() + "살 입니다.");

	}

}
