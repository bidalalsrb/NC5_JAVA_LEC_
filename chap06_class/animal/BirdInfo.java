package chap06_class.animal;

public class BirdInfo {

	public static void main(String[] args) {
		Bird bird = new Bird("참새","모이");
		Bird eagle = new Bird("독수리","뱀");
		Bird dakdulgi = new Bird("닭둘기", "잡식");
//		bird.fly();
//		bird.cry();
//		bird.walk();
		bird.eat();
		eagle.eat();
		dakdulgi.eat();

	}

}
