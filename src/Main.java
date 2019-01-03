import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // tworzymy listę armat
        LinkedList<Cannon> cannonList = new LinkedList<Cannon>();
        Random stateCannonGenerator = new Random();
        //Boolean load;

        //tworzenie instancji armat za pomocą funkcji Random i ładowanie ich pseudolosowym stanem boolean
        for (int i = 0; i < 20; i++) {

            cannonList.add(i,new Cannon(stateCannonGenerator.nextBoolean()));

        }

        for(Cannon cannon: cannonList){

            cannon.fire();

        }

    }
}
