package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		//부모 타입에 자식 타입을 넣음
		Parent parent = new Child(); //자동 타입 변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
			
		// Parent 타입에는 없으므로 쓸 수 없다.
//		parent.field2 = "data2";
//		parent.method3();
		
		Child child = (Child) parent;  //강제 타입 변환 (원래 타입으로 돌아감)
		child.field2 = "yyy";  // 자식으로 타입을 변환해줘서 사용 가능해짐
		child.method3();
		
		

	}

}
