package poly;


class Vehicle{
	public void run() {
		System.out.println("차량이 달립니다.");
	}
}


class Bus extends Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}



class Taxi extends Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}



class Driver{
	public void drive(Vehicle vehicle){
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
	
}


public class Ex04 {
	public static void main(String[] args) {
		
		Driver driver =  new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		//매개변수의 다형성
		driver.drive(bus);	
		driver.drive(taxi);
		
	}
}
