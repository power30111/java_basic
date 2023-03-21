package CollectionsBasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<StudentSort>{
    @Override
    public int compare(StudentSort student1, StudentSort student2) {
        return Integer.compare(student1.getId(),student2.getId());
    }//학생들의 객체에서 Id를 받아와서 비교.
}
public class StudentsCollectionRunner {
    public static void main(String[] args) {
        List<StudentSort> studentSorts = List.of(new StudentSort(1,"Alice"),
                new StudentSort(100,"Adam"),new StudentSort(2,"Eve"));

        List<StudentSort> studentSorts1 = new ArrayList<>(studentSorts);

        System.out.println(studentSorts);
        System.out.println(studentSorts1);
        //Collections.sort(studentSorts1);
        System.out.println(studentSorts1);

        Collections.sort(studentSorts1, new DescendingStudentComparator());
        System.out.println("studentSorts1 = " + studentSorts1);


    }
}
