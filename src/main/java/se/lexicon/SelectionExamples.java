package se.lexicon;

public class SelectionExamples {
    public static void main(String[] args) {


        ExamEvaluation(65);

        welcomeMessage("CEO");


    }

    /**
     * CEO, MANAGER, SUPPORT, TEACHER
     * @param employeeTitle
     */
    private static void welcomeMessage(String employeeTitle) {
        switch (employeeTitle){
            case "CEO":
                System.out.println("Hello, here is the report about the company's Health");
                break;

            case "MANAGER":
                System.out.println("Hello and Welcome back, here is the Report you asked about Yesterday!");
                break;

            default:
                System.out.println("Hm.. Not Sure who you are but i guess.. Welcome?");
        }
    }

    /**
     *  1. If grade is 65 or above = you passed
     *  2. if grade is 55 or above = your close but not passed
     *  3. else not passed
     */
    private static void ExamEvaluation(int gradeExam) {
        if(gradeExam >= 65){
            System.out.println("You passed the Test!");
        } else if (gradeExam >= 55){
            System.out.println("You almost passed the Test!");
        } else{
            System.out.println("You did not Pass The Test!");
        }
    }
}
