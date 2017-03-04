import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Flower flower1 = new Flower("Pion", "Black", 5, 10, 300);
        Flower flower2 = new Flower("Roza", "Red", 3, 15, 350);
        Flower flower3 = new Flower("Kaktus", "Green", 4, 5, 400);
        Flower flower4 = new Flower("Romashka", "Yellow", 1, 3,50);
        Flower flower5 = new Flower("Vasilek", " Blue", 2, 2, 70);

        List<Flower> flowersList = new ArrayList<Flower>();

        flowersList.add(flower1);
        flowersList.add(flower2);
        flowersList.add(flower3);
        flowersList.add(flower4);
        flowersList.add(flower5);
        for (Flower flower: flowersList ) {
            System.out.println(flower);
        }
        System.out.println("=========================");

//        flowersList.set(1, new Flower("5","6",7,8,9));
//        flowersList.set(2, new Flower("1","2",3,4,5));
//        flowersList.set(3, new Flower("2","3",4,5,6));
//        for (Flower flower:flowersList) {
//            System.out.println(flower);
//        }
//        System.out.println("==========================");

//        flowersList.contains(flower2);
//        for (Flower flower:flowersList) {
//            System.out.println(flower);
//        }
//        System.out.println("===========================");

        flowersList.indexOf("Pion");
        System.out.println(flowersList.get(1));
        for (Flower flower:flowersList) {
            System.out.println(flower);
        }
        
    }
}
