package BMI;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.text.DecimalFormat;

public class FiveClassApp {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("trials.txt"));

        Group dundalkGroup = new Group();

        String fName, sName;
        double weight, height;

        double bmi;

        DecimalFormat df = new DecimalFormat("0.00");

        while(input.hasNext()){
            fName = input.next();
            sName = input.next();
            weight = input.nextDouble();
            height = input.nextDouble();

            bmi = weight/height/height * 703;
            bmi = Double.parseDouble(df.format(bmi));

            dundalkGroup.addParticipant(new Participant(fName + " " + sName,bmi));
        }
        input.close();

        System.out.println(dundalkGroup);
    }
}
