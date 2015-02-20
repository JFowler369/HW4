/**
  * This class creates a course with a Title, Professor, TAs, and Students
  * @author Jesse Fowler
  * @version 1.0
  */
public class Course {

    private String title;
    private Professor professor;
    private TA headTA;
    private TA[] tas;
    private Student[] students;

    /**
      * Creates the course object and sets values
      * @param setTitle Title of the Course
      * @param setProfessor Professor of the Course
      * @param setHeadTA HeadTA of the Course
      * @param setTAs Course TAs
      * @param setStudents Course Students
      */
    public Course(String setTitle, Professor setProfessor, TA setHeadTA,
                  TA[] setTAs, Student[] setStudents) {
        this.title = setTitle;
        this.professor = setProfessor;
        this.headTA = setHeadTA;
        this.tas = setTAs;
        this.students = setStudents;
    }

    /**
      * Returns the Course Title
      * @return Course Title
      */
    public String getTitle() {
        return this.title;
    }

    /**
      * Returns the Course Professor
      * @return Course Professor
      */
    public Professor getProfessor() {
        return this.professor;
    }

    /**
      * Returns the Course Head TA
      * @return Course Head TA
      */
    public TA getHeadTA() {
        return this.headTA;
    }

    /**
      * Returns the Course TAs
      * @return Course TAs
      */
    public TA[] getTAs() {
        return this.tas;
    }

    /**
      * Returns the Course Students
      * @return Course Students
      */
    public Student[] getStudents() {
        return this.students;
    }

    /**
      * Calculates and returns the average study percentage of the course
      * students
      * @return Average Study Percentage of the course Students
      */
    public Double getAverageStudyPercentage() {
        Double totalStudyHours = 0.00;
        int totalStudents = this.students.length;
        for (Student student: this.students) {
            totalStudyHours += student.getStudyHours();
        }
        return totalStudyHours / totalStudents;
    }

    /**
      * Adds Students to the course
      * @param newStudent Student to be added to the course
      */
    public void addStudent(Student newStudent) {
        if (this.students.length < 299) {
            Student[] newStudents = new Student[this.students.length + 1];
            for (int i = 0; i < this.students.length; i++) {
                newStudents[i] = this.students[i];
            }
            newStudents[this.students.length] = newStudent;
            this.students = newStudents;
        }
    }

}
