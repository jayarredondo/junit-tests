import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Constructor

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();

    }

    // Methods

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double averageGrade = 0;
        for (Integer grade : grades) {
            averageGrade += grade;
        }
        return averageGrade / grades.size();
    }

    public void updateGrade(int index, int newGrade) {
        grades.set(index, newGrade);
    }

    public void deleteGrade(int gradeToDelete) {
        grades.remove(grades.indexOf(gradeToDelete));
    }
}
