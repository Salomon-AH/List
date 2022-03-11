import uaslp.objects.list.Iterator;
import uaslp.objects.list.List;
import uaslp.objects.list.arraylist.ArrayList;
import uaslp.objects.list.linkedlist.LinkedList;

class Listas{
    private String list;

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public void GeneraListas (String list){
        if(list.equals("ArrayList")){
            List team1 = new ArrayList();
            List team2 = new ArrayList();
            List team3 = new ArrayList();

            team1.addAtTail("Jesus");
            team1.addAtTail("Salomon");
            team1.addAtTail("Yael");

            team2.addAtFront("Cristian");
            team2.addAtFront("Daniel");
            team2.addAtFront("Diego");

            team3.addAtFront("Imelda");

            Iterator iterator;

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
        else{
            if(list.equals("LinkedList")){
                List team1 = new LinkedList();
                List team2 = new LinkedList();
                List team3 = new LinkedList();

                team1.addAtTail("Jesus");
                team1.addAtTail("Salomon");
                team1.addAtTail("Yael");

                team2.addAtFront("Cristian");
                team2.addAtFront("Daniel");
                team2.addAtFront("Diego");

                team3.addAtFront("Imelda");

                Iterator iterator;

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
    }
}

public class Main {
    public static void main(String[] args) {
        Listas Array = new Listas();
        Listas Linked = new Listas();

        System.out.println("");
        System.out.println("ArrayList");
        System.out.println("");
        Array.GeneraListas("ArrayList");

        System.out.println("");
        System.out.println("LinkedList");
        System.out.println("");
        Linked.GeneraListas("LinkedList");
    }
}