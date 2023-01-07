package TataStrive.Classwork.Aggregation;


class TCS
{
    int comid;
    String comName;
    Address address;//entity reference
    public int getComid() {
        return comid;
    }
    public String getComName() {
        return comName;
    }
    public Address getAddress() {
        return address;
    }
    public TCS(int comid, String comName, Address address) {
        super();
        this.comid = comid;
        this.comName = comName;
        this.address = address;
    }

}
public class AggregationDemo{

    public static void main(String[] args) {
        Address add1=new Address(700024, "kolkata","India", "WB");
        Address add2=new Address(7209875,"new york","USA","eew");
        TCS com1=new  TCS(101, "TCS BPS", add1);
        TCS com2=new TCS(102, "TCS", add2);
        System.out.println("Company Id: "+com1.getComid()+
                "\nCompany Name: "+com1.getComName()+"\nPincode: "+com1.getAddress().getPincode()+""
                + "\ncity: "+com1.getAddress().getCity()+"Country: "+com1.getAddress().getCountry()+"\nState: "+com1.getAddress().getState());
        System.out.println("Company Id: "+com2.getComid()+
                "\nCompany Name: "+com2.getComName()+"\nPincode: "+com2.getAddress().getPincode()+""
                + "\ncity: "+com2.getAddress().getCity()+"Country: "+com2.getAddress().getCountry()+"\nState: "+com2.getAddress().getState());
    }

}

