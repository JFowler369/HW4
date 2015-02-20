/**
  * Extention of Students that keeps NonStudyHours at 0
  * @author Jesse Fowler
  * @version 1.0
  */
public class GradStudent extends Student {

    /**
      * Creates object
      * @param setFirst First Name of the Student
      * @param setLast Last Name of the Student
      * @param setUser Username of the Student
      * @param addStudying Hours Student has Studied
      * @param addNotStudying Hours Student hasn't Studied
      */
    public GradStudent(String setFirst, String setLast, String setUser,
                       Double addStudying, Double addNotStudying) {
        super(setFirst, setLast, setUser, addStudying, addNotStudying);
    }

    /**
      * Overrides Student addNonStudyHours function so that nonStudyHours
      * can't increase
      * @param addNotStudying Isn't needed
      */
    @Override
    public void addNonStudyHours(Double addNotStudying) {

    }

}
