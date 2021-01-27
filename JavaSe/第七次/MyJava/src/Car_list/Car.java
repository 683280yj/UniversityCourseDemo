package Car_list;

public class Car extends Automobile{
	enum CarType {
		����, ���, ����
	}
	
	private CarType type;	//����
	
	public Car(String number, CarType type){
		super(number);
		this.type = type;
	}

	public CarType getType() {
		return type;
	}

	public void setType(CarType type) {
		this.type = type;
	}
	
	@Override
	public int calcRent(int days) {
		int price = 0;
		if(this.type == CarType.����){
			price = 500*days;
		}
		else if(this.type == CarType.���){
			price = 600*days;
		}
		else if(this.type == CarType.����){
			price = 300*days;
		}
		
		return price;
	}
}
