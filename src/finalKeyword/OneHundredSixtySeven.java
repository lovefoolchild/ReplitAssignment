package finalKeyword;

/* For You To Do:
    Create a constant variable to hold value "[https://syntaxtechs.com](https://syntaxtechs.com/)"
    Print value of constant variable in the main method

    **Expected Output:**
    [https://syntaxtechs.com]
    (https://syntaxtechs.com/)
 */
public class OneHundredSixtySeven {

    final String website="[https://syntaxtechs.com]";
    final String website2="(https://syntaxtechs.com/)";

    void printInfo(String website, String website2) {
        System.out.println(website+" "+website2);
    }

    public static void main(String[] args) {
        OneHundredSixtySeven instance = new OneHundredSixtySeven();
        instance.printInfo(instance.website, instance.website2);
    }
}

