/**
  * Extention of Student that adds hope and pizzaConsumed
  * @author Jesse Fowler
  * @version 1.0
  */
public class UndergradStudent extends Student {

    private int hope = 100;
    private int pizzaConsumed = 0;

    /**
      * Creates object
      * @param setFirst First Name of the Student
      * @param setLast Last Name of the Student
      * @param setUser Username of the Student
      * @param addStudying Hours Student has Studied
      * @param addNotStudying Hours Student hasn't Studied
      */
    public UndergradStudent(String setFirst, String setLast, String setUser,
                       Double addStudying, Double addNotStudying) {
        super(setFirst, setLast, setUser, addStudying, addNotStudying);
    }

    /**
      * Makes student lose Hope
      * and makes hope only decrease and can't drop below 0
      * @param ammount The ammount hope decreases
      */
    public void loseHope(int ammount) {
        if (this.hope - Math.abs(ammount) >= 0) {
            this.hope -= Math.abs(ammount);
        } else {
            this.hope = 0;
        }
    }

    /**
      * Increases total ammount of pizza eaten
      * @param ammount Ammount of pizza eaten
      */
    public void eatPizza(int ammount) {
        this.pizzaConsumed += Math.abs(ammount);
    }

    /**
      * Gets current hope
      * @return Hope
      */
    public int getHope() {
        return this.hope;
    }

    /**
      * Gets current pizza Consumed
      * @return pizzaConsumed
      */
    public int getPizza() {
        return this.pizzaConsumed;
    }

}
