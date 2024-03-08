import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Question questionOne = new Question("What is the primary cause of global warming?\n" +
                "\n" +
                " 1. Natural climate variability\n" +
                " 2. Deforestation\n" +
                " 3. Solar activity\n" +
                " 4. Greenhouse gas emissions", 4, 3,4,3, 3,1 );

        Question questionTwo = new Question( "Which gas is considered a major contributor to the greenhouse effect?\n" +
                "\n" +
                " 1. Nitrogen\n" +
                " 2. Oxygen\n" +
                " 3. Carbon Dioxide (CO2)\n" +
                " 4. Methane (CH4)", 4, 3, 4, 3, 3, 2);
        Question questionThree =new Question("What is the potential impact of global warming on sea levels?\n" +
                "\n" +
                " 1. Decrease in sea levels\n" +
                " 2. No change in sea levels\n" +
                " 3. Moderate rise in sea levels\n" +
                " 4. Significant rise in sea levels",4,3,4,3,3,3);
        Question  questionFour = new Question("Which of the following is a renewable energy source that can help mitigate global warming?\n" +
                "\n" +
                " 1. Coal\n" +
                " 2. Natural Gas\n" +
                " 3. Solar power\n" +
                " 4. Nuclear power\n", 4,3,4,3,3,4);

        Question questionFive =new Question("What is the consensus among scientists regarding human influence on global warming?\n" +
                "\n" +
                " 1. There is no consensus\n" +
                " 2. Human activities have no impact\n" +
                " 3. Human activities contribute to global warming\n" +
                " 4. It's unclear and debated among scientists", 4,3,4,3,3, 5);













    }





}