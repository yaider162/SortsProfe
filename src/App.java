import co.edu.uptc.models.Node;
import co.edu.uptc.models.SimpleListV2;
import co.edu.uptc.models.Thing;

// La tarea del profesor consiste en crear un algoritmo de sorteo para poder organizar los elementos
// en la lista por cualquiera de alguno de sus tres atributos

public class App {
    public static void main(String[] args) {
        SimpleListV2<Thing> list = new App().addInfo();
        System.out.println("Original list");
        list.showList();
        System.out.println("Sorted by name");
        list.sort(new Thing.NameComparator());
        list.showList();
//        System.out.println("Sorted by age");
//        list.sort(new Thing.AgeComparator());
//        list.showList();
//        System.out.println("Sorted by last name");
//        list.sort(new Thing.LastNameComparator());
//        list.showList();
    }

    // adds 20 elements to the list
    public SimpleListV2<Thing> addInfo() {
        SimpleListV2<Thing> list = new SimpleListV2<>();
        //metele diez elementos sin for
        list.add(new Thing("Juan", "Perez", 20));
        list.add(new Thing("Pedro", "Gomez", 30));
        list.add(new Thing("Maria", "Lopez", 40));
        list.add(new Thing("Ana", "Gomez", 50));
        list.add(new Thing("Luis", "Perez", 60));
        list.add(new Thing("Carlos", "Lopez", 70));
        list.add(new Thing("Andres", "Gomez", 80));
        list.add(new Thing("Jorge", "Perez", 90));
        list.add(new Thing("Javier", "Lopez", 100));
        list.add(new Thing("Jairo", "Gomez", 110));
        return list;
    }
}
