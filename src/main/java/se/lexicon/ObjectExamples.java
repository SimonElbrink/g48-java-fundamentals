package se.lexicon;

public class ObjectExamples {

    public static void main(String[] args) {

        Person simon = new Person();
        simon.firstName = "Simon";
        simon.lastName = "Elbrink";
        simon.birthYear = 1997;


        Person erik = new Person();
        erik.firstName = "Erik";
        erik.lastName = "Svensson";
        erik.birthYear = 1976;



//        String getSimonPersonInformation = simon.firstName + " " + simon.lastName + " Age: " + (2023 - simon.birthYear);
//        String getErikPersonInformation = erik.firstName + " " + erik.lastName + " Age: " + (2023 - erik.birthYear);
//        System.out.println(getSimonPersonInformation);

        System.out.println( simon.getPersonInformation() );
        System.out.println( erik.getPersonInformation() );

    }
}

class Person{

    String firstName;
    String lastName;
    int birthYear;

    public String getPersonInformation(){
        return firstName + " " + lastName + " Age: " + (2023 - birthYear);
    }

}
