package CollectionsBasic;

public class StudentSort implements Comparable<StudentSort>{
    private int id;
    private String name;

    public StudentSort(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return id + " " + name;
    }

    @Override
    public int compareTo(StudentSort that) {
        //id가 높은순으로 정렬하고싶어.
        return Integer.compare(this.id,that.id);
    }
}
