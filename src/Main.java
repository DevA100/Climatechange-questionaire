import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int score = 0;

        Question questionOne = new Question("""
                  What is the primary cause of global warming?
                                                                                            
                
                 1. Natural climate variability
                                               
                 2. Deforestation
                                 
                 3. Solar activity
                                  
                 4. Greenhouse gas emissions
                 
               """, 4, 3,4,3, 3 );

        Question questionTwo = new Question( """
                Which gas is considered a major contributor to the greenhouse effect?
                
                " 1. Nitrogen
                " 2. Oxygen
                " 3. Carbon Dioxide (CO2)
                " 4. Methane (CH4)
                
                """, 4, 3, 4, 3, 3 );
        Question questionThree =new Question("""
                What is the potential impact of global warming on sea levels?
                
                " 1. Decrease in sea levels
                " 2. No change in sea levels
                " 3. Moderate rise in sea levels
                " 4. Significant rise in sea levels
                
                """,4,3,4,3,3);
        Question  questionFour = new Question("""
                Which of the following is a renewable energy source that can help mitigate global warming?
                
                " 1. Coal
                " 2. Natural Gas
                " 3. Solar power
                " 4. Nuclear power
                
                """, 4,3,4,3,3);

        Question questionFive =new Question("""
                What is the consensus among scientists regarding human influence on global warming?
                
                " 1. There is no consensus
                " 2. Human activities have no impact
                " 3. Human activities contribute to global warming
                " 4. It's unclear and debated among scientists
                
                """, 4,3,4,3,3 );

        System.out.println(questionOne.questions);
        int firstChoice = input.nextInt();
        if (firstChoice == questionOne.firstAnswer){
            score = score + 1;
        }
        System.out.println();
        System.out.println(questionTwo.questions);
        int secondChoice = input.nextInt();

        if (secondChoice == questionTwo.secondAnswer ){
            score = score + 1;
        }
        System.out.println();
        System.out.println(questionThree.questions);
        int thirdChoice = input.nextInt();
        if (thirdChoice == questionThree.thirdAnswer){
            score = score +1;
        }
        System.out.println();
        System.out.println(questionFour.questions);
        int fourthChoice = input.nextInt();
        if (fourthChoice == questionFour.fourthAnswer){
            score = score + 1;
        }
        System.out.println();
        System.out.println(questionFive.questions);
        int fifthChoice = input.nextInt();
        if (fifthChoice == questionFive.fifthAnswer){
            score = score + 1;
        }

        switch (score){

            case 5:
                System.out.println("Excellent");
                break;

            case 4:
                System.out.println("Very Good");

                break;

            default:
                System.out.println("Time to brush up on your knowledge of global warming: https://climate.nasa.gov/ ");

        }


















    }





}