package homework.homework01;

public class Run {
	public static void main(String[] args) throws Exception {
		
		String song = "나비야, 나비야 이리 날아오너라"
				+ "\n노랑나비, 흰 나비 춤을 추며 오너라"
				+"\n봄바람에 꽃잎도 방긋방긋 웃으며"
				+ "\n참새도 짹짹짹 노래하며 춤춘다";
		
		Practice p = new Practice();
		
		p.method1(song);
		System.out.println("method1 소요시간: " + System.nanoTime() + "ns");
		
		p.method2(song);
		System.out.println("method2 소요시간: " + System.nanoTime() + "ns");
	}

}
