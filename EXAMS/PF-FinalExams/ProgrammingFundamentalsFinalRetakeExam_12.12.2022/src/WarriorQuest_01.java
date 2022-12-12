import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.Scanner;

public class WarriorQuest_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String skillName = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("For Azeroth")) {
            String[] commandType = command.split("\\s+");
            switch (commandType[0]) {
                case "GladiatorStance":
                    skillName = skillName.toUpperCase(Locale.ROOT);
                    System.out.println(skillName);
                    break;
                case "DefensiveStance":
                    skillName = skillName.toLowerCase(Locale.ROOT);
                    System.out.println(skillName);
                    break;
                case "Dispel":
                    int index = Integer.parseInt(commandType[1]);
                    String letter = commandType[2];
                    if (index>=0 && index<skillName.length()) {
                        StringBuilder stringBuilder = new StringBuilder(skillName);
                        stringBuilder.insert(index,letter);
                        stringBuilder.delete(index+1,index+2);

               //         stringBuilder.replace(index, index , letter);
                       skillName = stringBuilder.toString();
                       System.out.println("Success!");
                    }else {
                        System.out.println("Dispel too weak.");
                    }
                    break;
                case "Target":

                    if (commandType[1].equals("Change")) {
                        String firstSubstringChange = commandType[2];
                        String toSubstring = commandType[3];
                        if (skillName.contains(firstSubstringChange)){
                      //      StringBuilder stb = new StringBuilder(skillName);
                        //    int indexSubstring = stb.indexOf(firstSubstringChange);
                          //  stb.replace(indexSubstring,indexSubstring+firstSubstringChange.length(),toSubstring);
                           // skillName = stb.toString();
                            skillName = skillName.replace(firstSubstringChange,toSubstring);
                        }

                        System.out.println(skillName); // може и да не трябва да се принтира ако има попадение?
                    } else if (commandType[1].equals("Remove")) {
                        String removeSubstring = commandType[2];
                        if (skillName.contains(removeSubstring)){
                          //  StringBuilder stb = new StringBuilder(skillName);
                         //   int indexSubstring = stb.indexOf(removeSubstring);
                          //  stb.replace(indexSubstring,indexSubstring+removeSubstring.length(),"");
                         //   skillName = stb.toString();
                            skillName = skillName.replace(removeSubstring,"");
                            System.out.println(skillName);
                        }else {
                            System.out.println("Command doesn't exist!");
                        }
                    }
                    break;
                default:
                    System.out.println("Command doesn't exist!");
                    break;


            }


            command = scanner.nextLine();
        }


    }
}
