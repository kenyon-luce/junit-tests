import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testStudent(){
        Student test = new Student("student", 1L);

        assertEquals("student", test.getName());
        assertEquals(1L, test.getId());
    }

    @Test
    public void testGrade(){
        Student grade = new Student("grade", 2L);
        grade.addGrade(100);
        grade.addGrade(90);

//        assertEquals(100, grade.getGrades().get(0));
//        assertEquals(90, grade.getGrades().get(1));
        assertEquals(95, grade.getGradeAverage());
    }
}
