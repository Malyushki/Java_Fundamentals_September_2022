import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "(#|\\|)(?<item>[A-za-z\\s]+)\\1(?<date>[0-9]{2}[\\/][0-9]{2}[\\/][0-9]{2})\\1(?<calories>[\\d]{1,5})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int totalCalories = 0;
      //  LinkedHashMap<String, List<String>> foodMap = new LinkedHashMap<>();
        List<String> foodList = new ArrayList<>();
        List<String> dateList = new ArrayList<>();
        List<String> caloriesList = new ArrayList<>();
        while (matcher.find()) {
            String currentFood = matcher.group("item");
            String currentDate = matcher.group("date");
            String currentNutrition = matcher.group("calories");
            totalCalories += Integer.parseInt(currentNutrition);
            foodList.add(currentFood);
            dateList.add(currentDate);
            caloriesList.add(currentNutrition);


        /*foodMap.putIfAbsent(currentFood,new ArrayList<>());
        foodMap.get(currentFood).add(currentDate);
        foodMap.get(currentFood).add(currentNutrition);

        }
         */
        }
        System.out.printf("You have food to last you for: %d days!%n",totalCalories/2000);

 //       for (Map.Entry<String, List<String>> entry : foodMap.entrySet()) {
   //         System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1));
      //  }
        for (int i = 0; i <foodList.size() ; i++) {
            String currentFood = foodList.get(i);
            String currentDate = dateList.get(i);
            String currentNutrition = caloriesList.get(i);
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n",currentFood,currentDate,currentNutrition);

        }

        }

    }

