package level2_inheritance;

public class StudentRunner {
    public static void main(String[] args) {
//        ClassCreate.Student student = new ClassCreate.Student();
//        student.setName("Alice");
//        student.setEmail("Alice.com");
//
//        ClassCreate.Person person = new ClassCreate.Person();
//        System.out.println(person);
//        System.out.println(person.toString());
        Employee employee = new Employee("Alice","Programmer Analyst");
        employee.setEmail("Alice.com");
        employee.setPhoneNumber("123-234-234");
        employee.setEmployerGarde('A');
        employee.setTitle("Programmer Analyst");
        System.out.println(employee);
    }
}
