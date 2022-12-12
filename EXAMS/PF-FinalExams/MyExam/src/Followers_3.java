import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Followers_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countFollower = 0;
        LinkedHashMap<String,Integer> amyFollowersMap = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("Log out")){
            String[] commandType = input.split(": ");
            switch (commandType[0]){
                case "New follower":
                    String newFollowerName = commandType[1];
                    amyFollowersMap.putIfAbsent(newFollowerName,0);
                    break;
                case "Like":
                    String usernameLike = commandType[1];
                    int countLikes = Integer.parseInt(commandType[2]);
                    amyFollowersMap.putIfAbsent(usernameLike,0);
                    countLikes +=amyFollowersMap.get(usernameLike);
                    amyFollowersMap.put(usernameLike,countLikes);
                    break;
                case "Comment":
                    String usernameComment = commandType[1];
                    int countComment = 1;
                    if (amyFollowersMap.containsKey(usernameComment)){
                        countComment +=amyFollowersMap.get(usernameComment);
                        amyFollowersMap.put(usernameComment,countComment);
                    }else {
                        amyFollowersMap.put(usernameComment,1);
                    }
                    break;
                case "Blocked":
                    String usernameDelete = commandType[1];
                    if (amyFollowersMap.containsKey(usernameDelete)){
                        amyFollowersMap.remove(usernameDelete);
                    }else {
                        System.out.printf("%s doesn't exist.%n",usernameDelete);
                    }


                    break;
            }





            input = scanner.nextLine();
        }

        System.out.printf("%d followers%n",amyFollowersMap.size());
        for (Map.Entry<String, Integer> entry : amyFollowersMap.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue());
        }

    }
}
