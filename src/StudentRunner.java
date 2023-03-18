import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {

        Student student = new Student("Alice", new int[] {100, 99, 4, 4, 50});
        int number = student.getNumberOfMarks();
        System.out.println("number = " + number);
        int sum = student.getTotalSumOfMarks();
        System.out.println("sum = " + sum);
        int maximumMark = student.getMaximumMark();
        System.out.println("maximumMark = " + maximumMark);
        int minimumMark = student.getMinimumMark();
        System.out.println("minimumMark = " + minimumMark);
        BigDecimal average = student.getAverageMarks();
        System.out.println("average = " + average);
        System.out.println(student);
        student.addNewMark(1);
        System.out.println(student);
        student.removeMarkAtIndex(1);
        System.out.println(student);
    }
}