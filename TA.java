/**
  * Extention of Student that adds piazza, recitation, and officeHours values
  * @author Jesse Fowler
  * @version 1.0
  */
public class TA extends UndergradStudent {

    private Double piazza;
    private Double recitation;
    private Double officeHours;

    /**
      * Creates object and sets values
      * @param setFirst First Name of the Student
      * @param setLast Last Name of the Student
      * @param setUser Username of the Student
      * @param addStudying Hours Student has Studied
      * @param addNotStudying Hours Student hasn't Studied
      * @param setPiazza Piazza value
      * @param setRecitation Recitation value
      * @param setOfficeHours OfficeHours value
      */
    public TA(String setFirst, String setLast, String setUser,
              Double addStudying, Double addNotStudying,
              Double setPiazza, Double setRecitation, Double setOfficeHours) {
        super(setFirst, setLast, setUser, addStudying, addNotStudying);
        setPiazza(setPiazza);
        setRecitation(setRecitation);
        setOfficeHours(setOfficeHours);
    }

    /**
      * Sets piazza value and keeps it between 0 and 1
      * @param setPiazza TA Piazza value
      */
    public void setPiazza(Double setPiazza) {
        if (setPiazza <= 1.00) {
            if (setPiazza >= 0.00) {
                this.piazza = setPiazza;
            } else {
                this.piazza = 0.00;
            }
        } else {
            this.piazza = 1.00;
        }
    }

    /**
      * Sets recitation value and keeps it between 0 and 1
      * @param setRecitation TA Recitation value
      */
    public void setRecitation(Double setRecitation) {
        if (setRecitation <= 1.00) {
            if (setRecitation >= 0.00) {
                this.recitation = setRecitation;
            } else {
                this.recitation = 0.00;
            }
        } else {
            this.recitation = 1.00;
        }
    }

    /**
      * Sets OfficeHours value and keeps it between 0 and 1
      * @param setOfficeHours TA OfficeHours value
      */
    public void setOfficeHours(Double setOfficeHours) {
        if (setOfficeHours <= 1.00) {
            if (setOfficeHours >= 0.00) {
                this.officeHours = setOfficeHours;
            } else {
                this.officeHours = 0.00;
            }
        } else {
            this.officeHours = 1.00;
        }
    }

    /**
      * Gets TA Piazza value
      * @return Piazza value
      */
    public Double getPiazza() {
        return this.piazza;
    }

    /**
      * Gets TA Recitation value
      * @return Recitation value
      */
    public Double getRecitation() {
        return this.recitation;
    }

    /**
      * Gets TA OfficeHours value
      * @return OfficeHours value
      */
    public Double getOfficeHours() {
        return this.officeHours;
    }

}
