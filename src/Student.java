import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Student {
    private String name;
    private ArrayList<Integer> Marks = new ArrayList<>();

    public Student(String name, int... marks) {
        this.name = name;
        for(int mark:marks){
            this.Marks.add(mark);
        }
    }
    public int getNumberOfMarks(){
        return (Marks.size());
    }
    public int getTotalSumOfMarks(){
        int A =0;
        for(int mark:Marks){
            A+=mark;
        }
        return A;
    }
    public int getMaximumMark(){
        return Collections.max(Marks);
    }
    public int getMinimumMark(){
        return Collections.min(Marks);
    }
    public BigDecimal getAverageMarks(){
        int A=getTotalSumOfMarks();
        return new BigDecimal(A).divide(new BigDecimal(Marks.size()),
                3, RoundingMode.UP);
    }
    void print(int... values){
        System.out.println(Arrays.toString(values));
    }
    public String toString(){
        return name+Marks.toString();
    }

    public void addNewMark(int mark) {
        Marks.add(mark);
    }

    public void removeMarkAtIndex(int mark) {
        Marks.remove(mark);
    }
}
