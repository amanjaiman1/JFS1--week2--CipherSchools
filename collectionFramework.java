import java.util.ArrayList;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> states=new ArrayList<>();
        states.add("California");
        states.add("Alabama");
        states.add("Alaska");
        states.add("Arkanas");

        System.out.println("ArrayList: "+ states);

//      Accessing elements using .get() method

        String s = states.get(2);
        System.out.println("I got " + s);

//      Write loop for this

        System.out.println("ArrayList Size "+states.size());

        for (int i=0;i<states.size();i++) {
            System.out.println(states.get(i));
        }

//        Update elements using .set() method

        states.set(2,"Texas");
        System.out.println("After updation: "+states);

//        Removing elements using .remove() method

        String t=states.remove(3);
        System.out.println("State removed is "+t);
        System.out.println("ArrayList after deletion: " + states);

//        Sort in list using .sort() method
        states.sort(Comparator.naturalOrder());

        System.out.println("ArrayList after sorting "+states);

//        .contains() method

        System.out.println("Is NewYork There? "+states.contains("newyork"));

//        get index of element using .indexOf()
        System.out.println("Texas is at "+states.indexOf("Texas")+" index");

//        you can check if list is empty or not using .isEmpty() method

        System.out.println("Is list empty? "+states.isEmpty());
        states.removeAll(states);
        System.out.println("Is List empty? "+states.isEmpty());
    }
}
