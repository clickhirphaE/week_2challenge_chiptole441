
import javax.tools.OptionChecker;
import java.util.*;  //ArrayList,random and Scanner class belongs to java.util built-in package
public class Week_2_challenge {
    public static void main(String args[]) {
        //Week Two Challenge: Chipotle Jr+ (Room 441)
        ArrayList<String> Rice = new ArrayList<String>(Arrays.asList("White rice", "brown rice", "no rice"));
        ArrayList<String> Meat = new ArrayList<String>(Arrays.asList("Chicken meat", "Steak meat", "Carnidas meat", "chorizo meat", "Sofritas meat", "veggies meat"));
        ArrayList<String> Beans = new ArrayList<String>(Arrays.asList("pinto beans", "black beans", "no beans"));
        ArrayList<String> Salsa = new ArrayList<String>(Arrays.asList("mild salsa", "Medium salsa", "hot salsa", "no salsa"));
        ArrayList<String> veggies = new ArrayList<String>(Arrays.asList("lettuce veggies", "fajita veggies", "no veggies"));

        ArrayList<String> cheese = new ArrayList<String>(Arrays.asList("yes", "No"));
        ArrayList<String> Guac = new ArrayList<String>(Arrays.asList("yes", "No"));
        ArrayList<String> Queso = new ArrayList<String>(Arrays.asList("Yes", "No"));
        ArrayList<String> Sour_cream = new ArrayList<String>(Arrays.asList("yes", "No"));
        Random rand = new Random();
        Scanner ss = new Scanner(System.in);
        int i = 1;
        System.out.println("*********THE ASSEMBLED BURRITOS*******");
        do {

            int rice_index = rand.nextInt(Rice.size());
            int Meat_index = rand.nextInt(Meat.size());
            int Beans_index = rand.nextInt(Beans.size());
            int Salsa_index = rand.nextInt(Salsa.size());
            int veggies_index = rand.nextInt(veggies.size());

            System.out.println(" Burrito " + i + ":[" + Rice.get(rice_index) + "," + Meat.get(Meat_index) + "," + Beans.get(Beans_index) + "," + Salsa.get(Salsa_index) + "," + veggies.get(veggies_index) + "]");
            i++;
        } while (i <= 10);
    }}