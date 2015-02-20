/**
  * Basis for Student and Professor classes
  * Saves and accesses Names
  * @author Jesse Fowler
  * @version 1.0
  */
public class Person {

    private String firstName;
    private String lastName;
    private String userName;

    /**
      * Sets Names of Person
      * @param setFirst Person's First Name
      * @param setLast Person's Last Name
      * @param setUser Person's Username
      */
    public Person(String setFirst, String setLast, String setUser) {
        this.firstName = setFirst;
        this.lastName = setLast;
        this.userName = setUser;
    }

    /**
      * Returns Person's First Name
      * @return Person's First Name
      */
    public String getFirstName() {
        return this.firstName;
    }

    /**
      * Returns Person's Last Name
      * @return Person's Last Name
      */
    public String getLastName() {
        return this.lastName;
    }

    /**
      * Returns Person's Username
      * @return Person's Username
      */
    public String getUserName() {
        return this.userName;
    }

}
