package entity;

public abstract
class Human {
    private String name;
    private String address;
    private int sdt;

    public Human() {
    }
    public Human(String name, String address, int sdt) {
        this.name = name;
        this.address = address;
        this.sdt = sdt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }
}
