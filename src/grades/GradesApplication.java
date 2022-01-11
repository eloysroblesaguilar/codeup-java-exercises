package grades;

import java.util.HashMap;
import java.util.Map;

import util.Input;


public class GradesApplication {

    public static <Int> void gradechecker(HashMap<String, Student> list) {
        Input input = new Input();

        System.out.println("Welcome!\nHere are the GitHub usernames of our students:");
        for (Map.Entry student : list.entrySet()) {
            String name = (String) student.getKey();
            System.out.printf("| %s | ", name);
        }

        String query = input.getString("\nWhat student would you like to see information on?");

        if (list.get(query) == null) {
            System.out.printf("\nSorry no student found with the GitHub username of \"%s\"\n", query);
        } else {
            String name = list.get(query).getName();
            double avg = list.get(query).getGradeAverage();
            System.out.printf("Name: %s GitHub Username: %s \nCurrent Average: %.1f", name, query, avg);
        }
        if (input.yesNo("\nWould you like to see another student?")) {
            gradechecker(list);
        } else{
            System.out.println("\nGoodbye, and have a wonderful day!");
        }

    }


    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student robert = new Student("Robert");
        robert.addGrade(85);
        robert.addGrade(98);
        robert.addGrade(90);

        Student bobert = new Student("Bobert");
        bobert.addGrade(95);
        bobert.addGrade(55);
        bobert.addGrade(100);

        Student herbert = new Student("Herbert");
        herbert.addGrade(77);
        herbert.addGrade(80);
        herbert.addGrade(83);

        Student wilbert = new Student("Wilbert");
        wilbert.addGrade(66);
        wilbert.addGrade(67);
        wilbert.addGrade(68);

        students.put("robertomaximus", robert);
        students.put("bobertosupreme", bobert);
        students.put("herbertthedestroyer", herbert);
        students.put("wilbertwildside", wilbert);


        System.out.println(students.get("robertomaximus").getName());

        gradechecker(students);
    }
}