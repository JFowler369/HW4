/**
  * Extension of Person that adds funFactor and gpaRating
  * @author Jesse Fowler
  * @version 1.0
  */
public class Professor extends Person {

    private Double funFactor;
    private Double gpaRating;

    /**
      * Creates Object and sets values
      * @param setFirst Professor's First Name
      * @param setLast Professor's Last Name
      * @param setUser Professor's Username
      * @param setFun Professor's Fun rating
      * @param setGpa Professor's Student's average GPA
      */
    public Professor(String setFirst, String setLast, String setUser,
                      Double setFun, Double setGpa) {
        super(setFirst, setLast, setUser);
        setFunFactor(setFun);
        setGpaRating(setGpa);
    }

    /**
      * Sets the Professor's Fun Factor
      * and makes sure it's between 0 and 1
      * @param setFun Professor's Fun Factor
      */
    public void setFunFactor(Double setFun) {
        if (setFun <= 1.00) {
            if (setFun >= 0.00) {
                this.funFactor = setFun;
            } else {
                this.funFactor = 0.00;
            }
        } else {
            this.funFactor = 1.00;
        }
    }

    /**
      * Sets the Professor's GPA Rating
      * and makes sure it's between 0 and 4
      * @param setGpa Professor's GPA Rating
      */
    public void setGpaRating(Double setGpa) {
        if (setGpa <= 4.00) {
            if (setGpa >= 0.00) {
                this.gpaRating = setGpa;
            } else {
                this.gpaRating = 0.00;
            }
        } else {
            this.gpaRating = 4.00;
        }
    }

    /**
      * Gets Professor's Gpa Rating
      * @return Professor's Gpa Rating
      */
    public Double getGpaRating() {
        return this.gpaRating;
    }

    /**
      * Gets Professor's Fun Factor
      * @return Professor's Fun Factor
      */
    public Double getFunFactor() {
        return this.funFactor;
    }

}
