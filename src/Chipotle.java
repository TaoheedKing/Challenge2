import java.security.cert.URICertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Chipotle {
    public static void main(String[] args) {
        Random randomGen = new Random();

        ArrayList<String> rice = new ArrayList<String>();
        rice.add("white rice");
        rice.add("brown rice");
        rice.add("no rice");
        rice.add("all rice");

        ArrayList<String> meat = new ArrayList<String>();
        meat.add("chicken");
        meat.add("steak");
        meat.add("carnidas");
        meat.add("chorizo");
        meat.add("sofritas");
        meat.add("veggie meat");
        meat.add("no meat");
        meat.add("all meat");

        ArrayList<String> beans = new ArrayList<String>();
        beans.add("pinto beans");
        beans.add("black beans");
        beans.add("no beans");
        beans.add("all beans");

        ArrayList<String> salsa = new ArrayList<String>();
        salsa.add("mild salsa");
        salsa.add("medium salsa");
        salsa.add("hot salsa");
        salsa.add("no salsa");
        salsa.add("all salsa");

        ArrayList<String> veggies = new ArrayList<String>();
        veggies.add("lettuce");
        veggies.add("fajita veggies");
        veggies.add("no veggies");
        veggies.add("all veggies");

        ArrayList<String> cheese = new ArrayList<String>();
        cheese.add("add cheese");
        cheese.add("no cheese");

        ArrayList<String> guac = new ArrayList<String>();
        guac.add("add guac");
        guac.add("no guac");

        ArrayList<String> queso = new ArrayList<String>();
        queso.add("add queso");
        queso.add("no queso");

        ArrayList<String> sourCream = new ArrayList<String>();
        sourCream.add("add sour cream");
        sourCream.add("no sour cream");


        for (int i = 0; i <= 25; i++) {
            int ingredients = 0;
            do {
                double sum = 3.00;
                double temp = 0.00;
                double temp2 = 0.00;
            int index = randomGen.nextInt(rice.size());
            System.out.println(rice.get(index) + ", ");
            int searchIndex = Collections.binarySearch(rice, "no rice");
            if (searchIndex >= 0) {
                ingredients = 0;
                sum = 3.00;
            } else {
                sum = 3.50;
                ingredients = 1;
            }
            int index1 = randomGen.nextInt(meat.size());
            System.out.print(meat.get(index1) + ", ");
            int searchIndex1 = Collections.binarySearch(meat, "no meat");
            if (searchIndex1 >= 0) {
                temp = sum;
                sum = temp;
                ingredients += 0;
            } else {
                temp = sum + 0.50;
                sum = temp;
                ingredients += 1;
            }
            int index2 = randomGen.nextInt(beans.size());
            System.out.print(beans.get(index2) + ", ");
            int searchIndex2 = Collections.binarySearch(beans, "no beans");
            if (searchIndex2 >= 0) {
                temp = sum;
                sum = temp;
                ingredients += 0;
            } else {
                temp = sum + 0.50;
                sum = temp;
                ingredients += 1;
            }

            int index3 = randomGen.nextInt(salsa.size());
            System.out.print(salsa.get(index3) + ", ");
            int searchIndex3 = Collections.binarySearch(salsa, "no salsa");
            if (searchIndex3 >= 0) {
                temp = sum;
                sum = temp;
                ingredients += 0;
            } else {
                temp = sum + 0.50;
                sum = temp;
                ingredients += 1;
            }

            int index4 = randomGen.nextInt(veggies.size());
            System.out.print(veggies.get(index4) + ", ");
            int searchIndex4 = Collections.binarySearch(veggies, "no veggies");
            if (searchIndex4 >= 0) {
                temp = sum;
                sum = temp;
                ingredients += 0;
            } else {
                temp = sum + 0.50;
                sum = temp;
                ingredients += 1;
            }

            int index5 = randomGen.nextInt(cheese.size());
            System.out.print(cheese.get(index5) + ", ");
            int searchIndex5 = Collections.binarySearch(cheese, "no cheese");
            if (searchIndex5 >= 0) {
                temp = sum + 0.00;
                sum = temp;
                ingredients += 0;
            } else {
                temp = sum + 0.50;
                sum = temp;
                ingredients += 1;
            }
            int index6 = randomGen.nextInt(guac.size());
            System.out.print(guac.get(index6) + ", ");
            int searchIndex6 = Collections.binarySearch(guac, "no guac");
            if (searchIndex6 >= 0) {
                temp = sum + 0.50;
                sum = temp;
                ingredients += 0;
            } else {
                temp = sum + 0.50;
                sum = temp;
                ingredients += 1;
            }
            int index7 = randomGen.nextInt(queso.size());
            System.out.print(queso.get(index7) + ", ");
            int searchIndex7 = Collections.binarySearch(queso, "no queso");
            if (searchIndex7 >= 0) {
                temp = sum;
                sum = temp;
                ingredients += 0;
            } else {
                temp = sum + 0.50;
                sum = temp;
                ingredients += 1;
            }
            int index8 = randomGen.nextInt(sourCream.size());
            System.out.print(sourCream.get(index8) + ", ");
            int searchIndex8 = Collections.binarySearch(sourCream, "no sourCream");
            if (searchIndex8 >= 0) {
                temp = sum + 0.00;
                sum = temp;
                ingredients += 0;
            } else {
                temp = sum + 0.50;
                sum = temp;
                ingredients += 1;
                System.out.println(sum);
            }
        } while (ingredients <= 9 && ingredients > 5);
        }
    }

}
