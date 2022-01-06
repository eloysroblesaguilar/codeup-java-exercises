import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {

//    1.
    public static Person[] addPerson(Person[] people, Person addedPerson) {


        Person[] newPeople = new Person[(people.length + 1)];

        for (int i = 0; i < people.length + 1; i++) {
            newPeople[i] = people[i];

            if (i == people.length + 1) {
                newPeople[i] = addedPerson;
            }

        }


        System.out.println(Arrays.toString(newPeople));

        return newPeople;
    }


    public static void main(String[] args) {
        Person[] people = {new Person("Eloys"), new Person("Eloys II"), new Person("Eloys III")};
        for (Person person : people){
            System.out.println(person.getName());
        }
        Person person4 = new Person("Eloys IV");

//        addPerson(people, person4);

    }
}
