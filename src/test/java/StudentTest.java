import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {

    private Student student;

    @Before
    public void setUp(){
        this.student = new Student("Jay", 1234567);
        student.addGrade(100);
        student.addGrade(75);
        student.addGrade(50);
    }

    @Test
    public void testCheckConstructor(){
        assertEquals(student.getName(), "Jay");
        assertEquals(student.getId(), 1234567);
        assertNotNull(student.getGrades());
    }

    @Test
    public void testAddGrade(){
        student.addGrade(100);


        assertEquals(1, student.getGrades().size());
        assertSame(100, student.getGrades().get(0));
    }

    @Test
    public void testGetGradeAverage(){
        double average = student.getGradeAverage();

        // test if grades are there and if they match the index.
        assertEquals(3, student.getGrades().size());
        assertSame(100, student.getGrades().get(0));
        assertSame(75, student.getGrades().get(1));
        assertSame(50, student.getGrades().get(2));

        // test output
        assertEquals(75, average, 0);

    }

    @Test
    public void testUpdateGrade(){
        assertSame(75, student.getGrades().get(1));

        student.updateGrades(student.getGrades(),75, 100);

        assertSame(100, student.getGrades().get(1));
    }
}
