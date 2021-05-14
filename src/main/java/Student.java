import java.util.ArrayList;

public class Student {
    private String name;
    private long id;
    private ArrayList<Integer> grades;

    public Student(String name, long id){
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<Integer>();
    }

    public String getName(){
        return this.name;
    }

    public long getId(){
        return this.id;
    }

    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    public long getGradeAverage(){
        long total = 0;
        for(long grade : grades){
            total += grade;
        }

        return total/grades.size();
    }

    public void addGrade(int grade){
        getGrades().add(grade);
    }
}
