package homework.object3;

public class Run {

	public static void main(String[] args) {
		Employee em = new Employee();
		
		em.setEmpNo(100);
		em.setEmpName("홍길동");
		em.setDept("영업부");
		em.setJob("과장");
		em.setAge(25);
		em.setGender('남');
		em.setSalary(3000000);
		em.setBonus(0.05);
		em.setPhone("010-123-4567");
		em.setAddress("서울시 강남구");
		
		
		System.out.println("===홍길동의 정보===");
		System.out.println("사번 : " + em.getEmpNo());
		System.out.println("부서 : " + em.getDept());
		System.out.println("직급 : " + em.getJob());
		System.out.println("나이 : " + em.getAge());
		System.out.println("월급 : " + em.getSalary());
		System.out.println("전화번호 : " + em.getPhone());
		System.out.println("주소 : " + em.getAddress());
		

	}

}
