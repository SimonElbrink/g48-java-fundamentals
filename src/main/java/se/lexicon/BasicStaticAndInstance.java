package se.lexicon;

public class BasicStaticAndInstance {

    static int staticNumber = 9000;
    int number = 500;
    public static void main(String[] args) {


        int staticNumber = 40;

        System.out.println(staticNumber);
        System.out.println(BasicStaticAndInstance.staticNumber);

//        Can't DIRECTLY ACCESS INSTANCE VARIABLE / METHODS
//        System.out.println(number);
//        instanceMethod();

        //But via an instance we can access.
        BasicStaticAndInstance bSaI = new BasicStaticAndInstance(); // Instance of class
        System.out.println(bSaI.number);
        bSaI.instanceMethod();





    }

    public void instanceMethod(){
        int number = 5_000_000;

        System.out.println(number);
        System.out.println(this.number);

        System.out.println(BasicStaticAndInstance.staticNumber);
    }

}
