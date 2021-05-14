import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testStudent(){
        Student test = new Student("student", 1L);
        //mentioned from instructor, its a good idea to test if the student even exists
        Student nonExistent = null;

        assertNotNull(test);
        assertNull(nonExistent);
        assertEquals("student", test.getName());
        assertEquals(1L, test.getId());
    }

    @Test
    public void testGrade(){
        Student grade = new Student("grade", 2L);
        grade.addGrade(100);
        grade.addGrade(90);

        assertEquals(2, grade.getGrades().size());
        assertSame(100, grade.getGrades().get(0));
        assertSame(90, grade.getGrades().get(1));
        assertEquals(95, grade.getGradeAverage());
    }
}
