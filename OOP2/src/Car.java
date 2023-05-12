
public class Car {

	String make;
	int speed;
	boolean isStar= false;
	
	Boolean Star() {
		return true;
	}
	void SpeedUp(int speed) {
		speed += speed;
		System.out.println("SpeedUP:"+ speed);
	}
void SlowDown(int speed) {
	speed -= speed;
	System.out.println("DownSpeed:"+ speed);
	}
int Stop() {
	return speed = 0;
}
boolean Turnoff() {
	return false;
}
}
