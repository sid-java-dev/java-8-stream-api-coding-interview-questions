package p1;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String departmentNames;
    private String address;
    private double salary;
    private String gender;


    public Employee(int id,String name,int age,String departmentNames,String address,double salary,String gender){
        this.id=id;
        this.name=name;
        this.age=age;
        this.departmentNames=departmentNames;
        this.address=address;
        this.salary=salary;
        this.gender=gender;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartmentNames() {
        return departmentNames;
    }

    public void setDepartmentNames(String departmentNames) {
        this.departmentNames = departmentNames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", departmentNames='" + departmentNames + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }
}
