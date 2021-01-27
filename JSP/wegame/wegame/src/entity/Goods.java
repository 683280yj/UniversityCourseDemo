package entity;

public class Goods {
    private int gid;
    private String gName;
    private double price;

    public Goods(){}
    public Goods(int gid, String gName, double price) {
        this.gid = gid;
        this.gName = gName;
        this.price = price;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
