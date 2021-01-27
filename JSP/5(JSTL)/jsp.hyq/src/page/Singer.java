package page;

public class Singer {
	private int singerID;
	private String singerName;
	private String singerType;
	
	public Singer(){}
	public Singer(int singerID, String singerName, String singerType){
		this.singerID = singerID;
		this.singerName = singerName;
		this.singerType = singerType;
	}
	
	public int getSingerID() {
		return singerID;
	}
	public void setSingerID(int singerID) {
		this.singerID = singerID;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	public String getSingerType() {
		return singerType;
	}
	public void setSingerType(String singerType) {
		this.singerType = singerType;
	}
}
