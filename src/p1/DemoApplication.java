package p1;

import java.util.*;
import java.util.stream.Collectors;

public class DemoApplication {
    static List<Employee> employees= Arrays.asList(
            new Employee(1, "Abraham", 29, "IT", "Mumbai", 20000, "Male"),
            new Employee(2, "Mary", 27, "Sales", "Chennai", 25000, "Female"),
            new Employee(3, "Joe", 28, "IT", "Chennai", 22000, "Male"),
            new Employee(4, "John", 29, "Sales", "Gurgaon", 29000, "Male"),
            new Employee(5, "Liza", 25, "Sales", "Bangalore", 32000, "Female"),
            new Employee(6, "Peter", 27, "Admin", "Mumbai", 31500, "Male"),
            new Employee(7, "Harry", 30, "Research", "Kochi", 21000, "Male")
    );

    //Find list of employees whose name starts with alphabet A
    public static void main(String[] args) {
       // List<Employee> employee = employees.stream().filter(e -> e.getName().startsWith("A")).collect(Collectors.toList());
      //  System.out.println(employee);
//Group The employees By Department Names
       // Map<String,List<Employee>> empByDept=employees.stream().collect(Collectors.groupingBy(Employee::getDepartmentNames));

       /* empByDept.forEach((department,Employee)-> {
            System.out.println("________________________________");
            System.out.println("Department: "+department);
            employee.forEach(e-> System.out.println(e));

        });*/
        /*long empCount=employees.stream().count();
        System.out.println(empCount);
*/

//        int maxAgeEmployee = employees.stream().mapToInt(Employee::getAge).max().getAsInt();
//        System.out.println(maxAgeEmployee);

        //find all the department names

        //employees.stream().map(e->e.getDepartmentNames()).distinct().forEach(s-> System.out.println(s));

        // find the count of employee each department

//       Map<String,Long>employeeCountByDept= employees.stream().collect(Collectors.groupingBy(emp->emp.getDepartmentNames(),Collectors.counting()));
//        System.out.println(employeeCountByDept);

        //find the list of employee whose age is less than 30

//        List<Employee> ageList=employees.stream().filter(e->e.getAge()<30).collect(Collectors.toList());
//        System.out.println(ageList);

        //Find the list of employees whose age is in between 26 and 31
//       List<Employee> ageList1= employees.stream().filter(e->e.getAge()>26 && e.getAge()<31).collect(Collectors.toList());
//        System.out.println(ageList1);

        //find the average age of male and female employee
//        Map<String, Double> avgAge=employees.stream().collect(Collectors.groupingBy(e->e.getGender(),Collectors.averagingInt(emp->emp.getAge())));
//        System.out.println(avgAge);

        // find the department whose is having maximum number of employee
//        Map.Entry<String, Long> deptMaxCount = employees.stream().collect(Collectors.groupingBy(Employee::getDepartmentNames, Collectors.counting()))
//                .entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get();
//
//        System.out.println(deptMaxCount);


        //find the employee whose stay in delhi and sort them by their names
//        List<Employee>employeeByCity=employees.stream().filter(e->e.getAddress().equalsIgnoreCase("Mumbai")).sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
//        System.out.println(employeeByCity);

        //find the average salary in all Department

//        Map<String,Double> empAvgSalary=employees.stream().collect(Collectors.groupingBy(Employee::getDepartmentNames,Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(empAvgSalary);

        //find the highest salary in each department
//       Map<String,Optional<Employee>>empDeptWithHighest=  employees.stream().collect(Collectors.groupingBy(Employee::getDepartmentNames,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
//        System.out.println(empDeptWithHighest);

        //find the list of employee and sort them by their salary

        employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());

// find the employees who has second lowest salary

        Employee employee = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).findFirst().get();

    }
}