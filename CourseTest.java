/**
  * This class creates a course and test the functions of its elements
  * @author Jesse Fowler
  * @version 1.0
  */
public class CourseTest {

    /**
      * Creates and test a Course object
      * @param args No argument
      */
    public static void main(String[] args) {

        String title = "CS 1331";

        Professor prof = new Professor("Teacher", "McTeacher", "324234",
                                        4.00, 3.43);

        TA headTA = new TA("FirstNamé", "LastNamé", "21312",
                  13.2, 2.2, 3.2, 0.78, 0.65);
        TA ta1 = new TA("Creative", "Name", "24312",
                              13.2, 2.2, 3.2, 0.78, 0.65);
        TA[] tas = {ta1};

        Student s1 = new Student("Jerry", "Smith", "020190", 10.2, 11.2);
        UndergradStudent s2 = new UndergradStudent("Jimmy", "Johnson", "33892",
                                                    11.2, 14.4);
        GradStudent s3 = new GradStudent("Jennifer", "Jackson", "232131",
                                          14.2, 1.22);
        Student s4 = new Student("Megan", "Brown", "3434", 11.1, 33.2);
        Student[] students = {s1, s2, s3};

        Course c = new Course(title, prof, headTA, tas, students);

        // Test Course
        c.addStudent(s4);
        Student[] courseStudents = c.getStudents();
        TA[] courseTAs = c.getTAs();

        System.out.println(c.getTitle());
        System.out.println("");
        System.out.println(c.getProfessor().getFirstName());
        // Test GradStudent NonStudyHours
        System.out.println(courseStudents[2].getNonStudyHours());
        System.out.println(courseStudents[3].getStudyPercentage());
        System.out.println(courseStudents[3].getLastName());

        // Test UndergradStudent Functions
        System.out.println("");
        s2.loseHope(110);
        System.out.println(s2.getHope());
        System.out.print(s2.getPizza());
        s2.eatPizza(2);
        System.out.println(s2.getPizza());

        // Test TA functions
        System.out.println("");
        System.out.println(courseTAs[0].getPiazza());
        TA courseHeadTA = c.getHeadTA();
        System.out.println(courseHeadTA.getRecitation());
    }
}
