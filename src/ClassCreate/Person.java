package ClassCreate;

public class Person {
    // String array 생성.
    //가장 긴 글자수를 가진 문자를 찾기.
    //요일들을 거꾸로 출력해보기.
    private String[] Week;

    public Person(String... week) {
        Week = week;
    }
    public String findLongestLetter(){
        String A = "Monday";
        for(int i =0; i< Week.length; i++){
            if (A.length() < Week[i].length()){
                A=Week[i];
            }
        }
        return A;
    }
    public void printWeekBackwards(){
        for(int i = Week.length-1; i>-1; i--){
            System.out.println(Week[i]);
        }
    }
}

