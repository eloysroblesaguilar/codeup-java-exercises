import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {

    //    1.
    public static Person[] addPerson(Person[] people, Person addedPerson) {

        Person[] newPeople = new Person[(people.length + 1)];

        for (int i = 0; i <= people.length; i++) {
            if (i == people.length) {
                newPeople[i] = addedPerson;
            } else {
                newPeople[i] = people[i];
            }
            System.out.println(newPeople[i].getName());
        }
        return newPeople;
    }


    public static void main(String[] args) {
        Person[] people = {new Person("Eloys"), new Person("Eloys II"), new Person("Eloys III")};
        for (Person person : people) {
            System.out.println(person.getName());
        }
        Person person4 = new Person("Eloys IV");
//        System.out.println(people.length);
        addPerson(people, person4);

    }
}
