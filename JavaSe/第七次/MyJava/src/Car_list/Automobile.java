package Car_list;

public abstract class Automobile {

    private String number;		//���ƺ�
	
	public Automobile(){}
	public Automobile(String number){
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	//�������
	public abstract int calcRent(int days);

}
