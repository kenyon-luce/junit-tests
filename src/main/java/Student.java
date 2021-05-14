import java.util.ArrayList;

public class Student {
    private String name;
    private long id;
    private ArrayList<Long> grades;

    public Student(String name, long id){
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<Long>();
    }

    public String getName(){
        return this.name;
    }

    public long getId(){
        return this.id;
    }

    public ArrayList<Long> getGrades(){
        return this.grades;
    }

    public long getGradeAverage(){
        long total = 0;
        for(long grade : grades){
            total += grade;
        }

        return total/grades.size();
    }

    public void addGrade(long grade){
        grades.add(grade);
    }


}
