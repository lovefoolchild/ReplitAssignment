package encapsulation;

/* Create a Person class with the following:
**Class Variables**
    - firstname
    - lastname
    - birthmonth
    - birthday
    - birthyear
    - String ssn
**Constructor**
The main constructor should take in all values and assign them to their respective private class variables

**Methods**
Create a public getters to access all the variables.
Create a public method called formatBirthday, which will return a String composed of their birthday in mm/dd/yyyy format.
For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"**

In Main Class:
Instantiate and object of Person and provide values. follows below outputs for values.
Using getter and method print them separately.

**Expected Output:**
John
Doe
10/25/1900
123-45-6789
 */
public class Person {
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    private String ssn;

    public Person(String firstName, String lastName, int birthMonth, int birthDay, int birthYear, String ssn){
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthMonth=birthMonth;
        this.birthDay=birthDay;
        this.birthYear=birthYear;
        this.ssn=ssn;
    }

    public String formatBirthday(){
        return birthMonth+"/"+birthDay+"/"+birthYear;
    }

    public String setFirstName(String firstName){return firstName;}
    public String setLastName(String lastName){return lastName;}
    public int setBirthMonth(int birthMonth){return birthMonth;}
    public int setBirthDay(int birthDay){return birthDay;}
    public int setBirthYear(int birthYear){return birthYear;}
    public String setSsn(String ssn){return ssn;}
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public int getBirthMonth(){return birthMonth;}
    public int getBirthDay(){return birthDay;}
    public int getBirthYear(){return birthYear;}
    public String getSsn(){return ssn;}
}

class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 10, 25, 1900, "123-45-6789");
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.formatBirthday());
        System.out.println(person.getSsn());
    }
}