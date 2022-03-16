import uaslp.objects.list.Iterator;
import uaslp.objects.list.List;
import uaslp.objects.list.arraylist.ArrayList;
import uaslp.objects.list.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("ArrayList");
        metodo(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        System.out.println("***************");

        System.out.println("LinkedList");
        metodo(new LinkedList<>(), new LinkedList<>(), new LinkedList<>());
    }

    public static void metodo(List<String> team1, List<String> team2, List<String> team3) {

        /*List<String> team1 = new ArrayList<>();
        List<String> team2 = new ArrayList<>();
        List<String> team3 = new ArrayList<>();
        */

        team1.addAtTail("Jesus");
        team1.addAtTail("Salomon");
        team1.addAtTail("Yael");

        team2.addAtFront("Cristian");
        team2.addAtFront("Daniel");
        team2.addAtFront("Diego");

        team3.addAtFront("Imelda");

        Iterator<String> iterator;

        iterator = team1.getIterator();

        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
        //Debio haber impreso
        //Jesús
        //Salomón
        //Yael

        iterator = team2.getIterator();

        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
        //Debio haber impreso
        //Diego
        //Daniel
        //Cristian

        team1.remove(0);
        team1.addAtFront("Rebeca");
        System.out.println("Team 1 tiene: " + team1.getSize() + " integrantes");
        //Debe imprimir "Team 1 tiene 3 integrantes"

        iterator = team1.getIterator();

        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
        //Debio haber impreso
        //Rebeca
        //Salomón
        //Yael

        team2.remove(2);
        team2.addAtTail("Rita");
        System.out.println("Team 2 tiene: " + team2.getSize() + " integrantes");
        //Debe imprimir "Team 2 tiene 3 integrantes"

        iterator = team2.getIterator();

        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
        //Debio haber impreso
        //Diego
        //Daniel
        //Rita

        team3.remove(0);
        team3.remove(0);
        //El elemento no existe pero el programa no deberia cerrarse por algún error

        team3.addAtTail("Tadeo");
        team3.addAtFront("Isai");

        System.out.println("Team 3 tiene: " + team3.getSize() + " integrantes");
        //Debe imprimir "Team 3 tiene 2 integrantes"

        iterator = team3.getIterator();

        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
        //Debio haber impreso
        //Tadeo
        //Isai

        if(team1.getAt(1).equals("Salomon")){
            team1.setAt(1, "Luis");
        }

        System.out.println("Team 1 tiene: " + team1.getSize() + " integrantes");
        //Debe imprimir "Team 1 tiene 3 integrantes"

        iterator = team1.getIterator();

        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }
        //Debio haber impreso
        //Rebeca
        //Luis
        //Yael
    }
}