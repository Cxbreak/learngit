package cx.study.springinitialdemo.proxy;

/**
 * 房租出租代理
 */
public class RentHouseProxy implements IRenter{

    private HouseOwner houseOwner;

    public RentHouseProxy(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    @Override
    public void rent() {
        System.out.println("代出租一套房：$250");
        houseOwner.rent();
        System.out.println("收入$50");

    }

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }
}
