/**
  * Extention of Person that adds Study and NonStudy Hours
  * @author Jesse Fowler
  * @version 1.0
  */
public class Student extends Person {

    private Double studyHours = 0.00;
    private Double nonStudyHours = 0.00;
    private Double totalHours = studyHours + nonStudyHours;
    private Double studyPercentage = studyHours / totalHours;

    /**
      * Creates object
      * @param setFirst First Name of the Student
      * @param setLast Last Name of the Student
      * @param setUser Username of the Student
      * @param addStudying Hours Student has Studied
      * @param addNotStudying Hours Student hasn't Studied
      */
    public Student(String setFirst, String setLast, String setUser,
                   Double addStudying, Double addNotStudying) {
        super(setFirst, setLast, setUser);
        addStudyHours(addStudying);
        addNonStudyHours(addNotStudying);
    }

    /**
      * Adds study hours to total study hours
      * and updates the StudyPercentage
      * @param addStudying Hours to be added to total studyHours
      */
    public void addStudyHours(Double addStudying) {
        this.studyHours += Math.abs(addStudying);
        updatePercentage();
    }

    /**
      * Adds nonStudy hours to total nonStudy hours
      * and updates the StudyPercentage
      * @param addNotStudying Hours to be added to total nonStudyHours
      */
    public void addNonStudyHours(Double addNotStudying) {
        this.nonStudyHours += Math.abs(addNotStudying);
        updatePercentage();
    }

    /**
      * Gets total Study Hours
      * @return studyHours
      */
    public Double getStudyHours() {
        return this.studyHours;
    }

    /**
      * Gets total nonStudy Hours
      * @return nonStudyHours
      */
    public Double getNonStudyHours() {
        return this.nonStudyHours;
    }

    /**
      * Gets total Hours spent Studying and not Studying
      * @return totalHours
      */
    public Double getTotalHours() {
        updateTotalHours();
        return this.totalHours;
    }

    /**
      * Updates total hours then calculates and returns StudyPercentage
      * @return studyPercentage
      */
    public Double getStudyPercentage() {
        updatePercentage();
        return this.studyPercentage;
    }

    /**
      * Calculates the total hours spent Studying and not Studying
      */
    public void updateTotalHours() {
        this.totalHours = getStudyHours() + getNonStudyHours();
    }

    /**
      * Calculates the percentage of time spent studying
      */
    public void updatePercentage() {
        this.studyPercentage = getStudyHours() / getTotalHours();
    }

}
