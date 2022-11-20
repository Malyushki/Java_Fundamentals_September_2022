import java.util.*;

public class ThePianist_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<String>> pianistMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\|");
            pianistMap.putIfAbsent(input[0],new ArrayList<>());
            pianistMap.get(input[0]).add(input[1]);
            pianistMap.get(input[0]).add(input[2]);

        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")){
            String [] commandType = command.split("\\|+");
            switch (commandType[0]){
                case "Add":
                    String pieceAdd = commandType[1];
                    String composerAdd = commandType[2];
                    String keyAdd = commandType[3];
                    if (!pianistMap.containsKey(pieceAdd)){
                        System.out.printf("%s by %s in %s added to the collection!%n",pieceAdd,composerAdd,keyAdd);
                        pianistMap.put(pieceAdd,new ArrayList<>());
                        pianistMap.get(pieceAdd).add(composerAdd);
                        pianistMap.get(pieceAdd).add(keyAdd);
                    }else {
                        System.out.printf("%s is already in the collection!%n",pieceAdd);
                    }
                    break;
                case "Remove":
                    String pieceRemove = commandType[1];

                    if (pianistMap.containsKey(pieceRemove)){
                        System.out.printf("Successfully removed %s!%n",pieceRemove);
                        pianistMap.remove(pieceRemove);
                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceRemove);
                    }
                    break;
                case "ChangeKey":
                    String pieceChangeKey = commandType[1];
                    String keyNew = commandType[2];
                    if (pianistMap.containsKey(pieceChangeKey)){
                        System.out.printf("Changed the key of %s to %s!%n",pieceChangeKey,keyNew);
                        pianistMap.get(pieceChangeKey).set(1,keyNew);
                    }else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceChangeKey);
                    }

                    break;

            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : pianistMap.entrySet()) {
            //"{Piece} -> Composer: {composer}, Key: {key}"
            System.out.printf("%s -> Composer: %s, Key: %s%n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1));

        }


    }
}
