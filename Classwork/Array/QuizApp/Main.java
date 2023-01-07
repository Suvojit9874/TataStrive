package TataStrive.Classwork.Array.QuizApp;
import java.util.Scanner;

public class Main {
    public static void takeTest(Question questions[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("***welcome to java quiz***");
        int score=0;
        String answer;
        for(int i=0;i<questions.length;i++)
        {
            System.out.println(questions[i].getQuestion());
            System.out.println("enter your answer here: ");
            answer=sc.next();
            if(questions[i].ans.equalsIgnoreCase(answer))
            {
                score++;
                System.out.println("correct answer");
            }
            else {
                System.out.println("wrong answer");
                System.out.println("correct ans is: "+questions[i].getAns());
            }
        }
        System.out.println("your score is: "+score+"/5");
        System.out.println("Your percentage is :  " + (100*score )/5.0f +"%");
    }

    public static void main(String[] args) {
        String q1="1. Who invented Java Programming?\r\n"
                + "a) Guido van Rossum\r\n"
                + "b) James Gosling\r\n"
                + "c) Dennis Richie\r\n"
                + "d) Bjarne Stroustrup";
        String q2="2. Which statement is true about Java?\r\n"
                + "a) Java is a sequence-dependent programming language\r\n"
                + "b) Java is a code dependent programming language\r\n"
                + "c) Java is a platform-dependent programming language\r\n"
                + "d) Java is a platform-independent programming language";
        String q3="3. Which component is used to compile, debug and execute the java programs?\r\n"
                + "a) JRE\r\n"
                + "b) JIT\r\n"
                + "c) JDK\r\n"
                + "d) JVM";
        String q4="4. Which one of the following is not a Java feature?\r\n"
                + "a) Object-oriented\r\n"
                + "b) Use of pointers\r\n"
                + "c) Portable\r\n"
                + "d) Dynamic and Extensible";
        String q5="5. Which of these cannot be used for a variable name in Java?\r\n"
                + "a) identifier & keyword\r\n"
                + "b) identifier\r\n"
                + "c) keyword\r\n"
                + "d) none of the mentioned";
        Question []questions= {new Question(q1,"b"),new Question(q2, "d")
                ,new Question(q3, "c"),new Question(q4, "b"),new Question(q5, "a")};

        Main.takeTest(questions);

    }

}
