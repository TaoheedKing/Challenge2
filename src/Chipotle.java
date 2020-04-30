import java.security.cert.URICertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Chipotle {
    public static void main(String[] args) {
        Random randomGen = new Random();

        ArrayList<String> rice = new ArrayList<String>();
        rice.add("no rice");
        rice.add("white rice");
        rice.add("brown rice");
        rice.add("all rice");

        ArrayList<String> meat = new ArrayList<String>();
        meat.add("no meat");
        meat.add("chicken");
        meat.add("steak");
        meat.add("carnidas");
        meat.add("chorizo");
        meat.add("sofritas");
        meat.add("veggie meat");
        meat.add("all meat");

        ArrayList<String> beans = new ArrayList<String>();
        beans.add("no beans");
        beans.add("pinto beans");
        beans.add("black beans");
        beans.add("all beans");

        ArrayList<String> salsa = new ArrayList<String>();
        salsa.add("no salsa");
        salsa.add("mild salsa");
        salsa.add("medium salsa");
        salsa.add("hot salsa");
        salsa.add("all salsa");

        ArrayList<String> veggies = new ArrayList<String>();
        veggies.add("no veggies");
        veggies.add("lettuce");
        veggies.add("fajita veggies");
        veggies.add("all veggies");

        ArrayList<String> cheese = new ArrayList<String>();
        cheese.add("no cheese");
        cheese.add("add cheese");

        ArrayList<String> guac = new ArrayList<String>();
        guac.add("no guac");
        guac.add("add guac");

        ArrayList<String> queso = new ArrayList<String>();
        queso.add("no queso");
        queso.add("add queso");

        ArrayList<String> sourCream = new ArrayList<String>();
        sourCream.add("no sour cream");
        sourCream.add("add sour cream");


        for (int i = 0; i <= 25; i++) {
            int ingredients = 0;
            do {
                double sum = 3.00;
            int index = randomGen.nextInt(rice.size());
            System.out.println(rice.get(index) + ", ");
            int searchIndex = Collections.binarySearch(rice, rice.get(index));
            if (searchIndex == 0) {
                ingredients = 0;
                sum += 0.00;
            } else {
                sum += 0.50;
                ingredients = 1;
            }
            index = randomGen.nextInt(meat.size());
            System.out.print(meat.get(index) + ", ");
            searchIndex = Collections.binarySearch(meat, meat.get(index));
            if (searchIndex == 0) {
                sum += 0.00;
                ingredients += 0;
            } else {
                sum += 0.50;
                ingredients += 1;
            }
            index = randomGen.nextInt(beans.size());
            System.out.print(beans.get(index) + ", ");
            searchIndex = Collections.binarySearch(beans, beans.get(index));
            if (searchIndex == 0) {
                sum += 0.00;
                ingredients += 0;
            } else {
                sum += 0.50;
                ingredients += 1;
            }

            index = randomGen.nextInt(salsa.size());
            System.out.print(salsa.get(index) + ", ");
            searchIndex = Collections.binarySearch(salsa, salsa.get(index));
            if (searchIndex == 0) {
                sum += 0.00;
                ingredients += 0;
            } else {
                sum += 0.50;
                ingredients += 1;
            }

            index = randomGen.nextInt(veggies.size());
            System.out.print(veggies.get(index) + ", ");
            searchIndex = Collections.binarySearch(veggies, veggies.get(index));
            if (searchIndex == 0) {
                sum += 0.00;
                ingredients += 0;
            } else {
                sum += 0.50;
                ingredients += 1;
            }

            index = randomGen.nextInt(cheese.size());
            System.out.print(cheese.get(index) + ", ");
            searchIndex = Collections.binarySearch(cheese, cheese.get(index));
            if (searchIndex == 0) {
                sum += 0.00;
                ingredients += 0;
            } else {
                sum += 0.50;
                ingredients += 1;
            }
            index = randomGen.nextInt(guac.size());
            System.out.print(guac.get(index) + ", ");
            searchIndex = Collections.binarySearch(guac, guac.get(index));
            if (searchIndex == 0) {
                sum += 0.00;
                ingredients += 0;
            } else {
                sum += 0.50;
                ingredients += 1;
            }
            index = randomGen.nextInt(queso.size());
            System.out.print(queso.get(index) + ", ");
            searchIndex = Collections.binarySearch(queso, queso.get(index));
            if (searchIndex == 0) {
                sum += 0.00;
                ingredients += 0;
            } else {
                sum += 0.50;
                ingredients += 1;
            }
            index = randomGen.nextInt(sourCream.size());
            System.out.print(sourCream.get(index) + ", ");
            searchIndex = Collections.binarySearch(sourCream, sourCream.get(index));
            if (searchIndex == 0) {
                sum += 0.00;
                ingredients += 0;
            } else {
                sum += 0.50;
                ingredients += 1;
            }
                System.out.println(sum);
            } while (ingredients <= 9 && ingredients > 5);
        }
    }

}
