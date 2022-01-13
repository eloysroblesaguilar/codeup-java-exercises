package groceries;
import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroceryApp {

//    A user should be prompted if they would like to create a grocery list.
//
//    If they pick yes, they will be prompted if they would like to enter a new item.
//
//    If the users picks yes, they should be given the following three prompts:
//
//    Given an ordered list of grocery categories to choose from, select the category.
//    Enter the name of the item.
//    Enter how many of the item.
//    The user will then be given the choice to finalize the list or add an item.
//
//    Once the user finalizes the list, they will be presented with a complete list organized alphabetically and grouped by a category, and including quantity.
//
//    As a bonus, allow users to filter the results by only one category of items at a time.
//
//    For a super gold star bonus, allow users to edit the list items.


    public static void listCreator(){
        Input input = new Input();


        HashMap<String, ArrayList<Foodstuff>> groceries = new HashMap<>();
        ArrayList<Foodstuff>dairy = new ArrayList<>();
        ArrayList<Foodstuff>bakery = new ArrayList<>();
        ArrayList<Foodstuff>vegetables = new ArrayList<>();
        ArrayList<Foodstuff>seafood = new ArrayList<>();
        ArrayList<Foodstuff>produce = new ArrayList<>();
        ArrayList<Foodstuff>deli = new ArrayList<>();
        ArrayList<Foodstuff>cans = new ArrayList<>();
        ArrayList<Foodstuff>baking = new ArrayList<>();
        groceries.put("dairy", dairy);
        groceries.put("bakery", bakery);
        groceries.put("vegetables", vegetables);
        groceries.put("seafood", seafood);
        groceries.put("produce", produce);
        groceries.put("deli", deli);
        groceries.put("cans", cans);
        groceries.put("baking", baking);


        System.out.println("What are you interested in purchasing?");
        System.out.println("Dairy | Bakery | Vegetables | Seafood | Produce | Deli | Canned Goods | Baking Supplies");
        String query = input.getString();

//        for (Map.Entry category : groceries.entrySet()) {
//            if ( query == category.getKey()) {
//                category.put();
//            }
//        }


    }

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Hello!");

        if (input.yesNo("Would you like to create a grocery list?")){
            listCreator();
        } else {
            System.out.println("Oh, well.. okay I guess... don't know why you would run the main method if you didnt want to actually do anything... bye..");
        }


    }
}
