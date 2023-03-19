package level2_inheritance;

public class Student extends Person{
    private String collageName;
    private int year;

    public Student(String name, String collageName) {
        super(name);
        this.collageName = collageName;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
