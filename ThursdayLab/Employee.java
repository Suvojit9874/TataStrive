package TataStrive.ThursdayLab;

class DataofEmployee
{
    //Instance Variables
    int empId,servedYear,travelAllowance;
    String empName,designation;
    long basicSalary;
    //Setter method
    public void setData(int id,int year,String name,String desig,long salary)
    {
//Assigning values of local variables in Instance variables using this keyword
        this.empId=id;
        this.empName=name;
        this.basicSalary=salary;
        this.designation=desig;
        this.servedYear=year;
    }
    //Method to Check Appraisal
    public void getAppraisal()
    {
        if(servedYear>=1){
            float increment=basicSalary*(10*100);
            System.out.println("Increment is: "+increment);
        }


    }
    //Method to calculate TravelAllowance
    public void ta()
    {
        if(designation.equals("manager"))
        {
            basicSalary+=3000;
        }
        else
        {
            basicSalary+=1000;
            travelAllowance=1000;
        }
    }
    //Getter method
    public void getData()
    {
        System.out.print("Id: "+empId + "Name: "+empName+"Salary: "+basicSalary+"Year: "+servedYear+"Designation: "+designation+"Travel Allowance: "+travelAllowance);
    }
}
public class Employee
{
    public static void main(String[] args)
    {
//Object creation
        DataofEmployee de=new DataofEmployee();
//Using Set method
        de.setData(100, 2000, "Soumen", "Manager", 20000);
//Appraisal calling method
        de.getAppraisal();
//Travel Allowance calling method
        de.ta();
//Using get method
        de.getData();

    }
}
