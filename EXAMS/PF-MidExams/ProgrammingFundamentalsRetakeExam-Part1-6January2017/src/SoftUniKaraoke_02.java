
import java.util.*;
import java.util.stream.Collectors;


public class SoftUniKaraoke_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> participantsList = Arrays.stream(scanner.nextLine().split(",\\s+")).collect(Collectors.toList());
        List<String> songList = Arrays.stream(scanner.nextLine().split(",\\s+")).collect(Collectors.toList());
        List<String> awardsList = new ArrayList<>();
        int[] countAward = new int[participantsList.size()];
        ArrayList[][] winnersList = new ArrayList[participantsList.size()][songList.size()];
        String command = scanner.nextLine();
        while (!command.equals("dawn")){
            String[] commandType = command.split(",\\s+");
            String participant = commandType[0];
            String song = commandType[1];
            String award = commandType[2];
            if (participantsList.contains(participant)&&songList.contains(song)){
                winnersList.add(new ArrayList<String>());
                winnersList.get(0).add("String");
                winnersList[1][0][0].add(song);
            }
            command = scanner.nextLine();
        }
        System.out.println(winnersList[0][0][0]);
        System.out.println(winnersList[1][0][0]);
     /*   for (int i = 0; i < awardsList.size()-1; i++) {
            if (awardsList.subList(i+1,awardsList.size()-1).contains(awardsList.get(i))){
                awardsList.remove(i);
                i--;
            }
        }
    //    String awardsListString = awardsList.toString().replaceAll("[\\[\\], ]","");
     //   System.out.println(awardsListString);
       awardsList = Arrays.stream(awardsList.toString().replaceAll("[\\[\\], ]","").split("--")).collect(Collectors.toList());

       for (int i = 0; i < awardsList.size(); i++) {
          System.out.println(awardsList.get(i));
       }
        for (int i = 0; i < participantsList.size(); i++) {
            for (int j = 0; j < awardsList.size(); j++) {
                if (participantsList.get(i).equals(awardsList.get(j))){
                    countAward[i]++;
            }
            }
        }
        for (int i = 0; i < countAward.length; i++) {
            if (countAward[i]>0){
                System.out.println(participantsList.get(i)+" "+countAward[i]);
            }
        }


        if (awardsList.isEmpty()){
            System.out.println("No awards");
        }

      */
        }
    }

