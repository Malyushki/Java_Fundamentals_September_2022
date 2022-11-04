import java.util.*;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        LinkedHashMap<String,Integer> legendaryItemsMap = new LinkedHashMap<>(){{
            put("shards",0);
            put("fragments",0);
            put("motes",0);
        }};
        LinkedHashMap<String,Integer> junkMap  = new LinkedHashMap<>();
        boolean isTrue = true;
        while (isTrue){
            String[] inputLine = scanner.nextLine().split("\\s+");
            for (int i = 0; i <inputLine.length ; i+=2) {
                int quantity = Integer.parseInt(inputLine[i]);
                String material = inputLine[i+1].toLowerCase(Locale.ROOT);

                if (legendaryItemsMap.containsKey(material)){
                    legendaryItemsMap.put(material,legendaryItemsMap.get(material)+quantity);
                    if (legendaryItemsMap.get(material)>=250){
                        switch (material){
                            case "shards":
                                System.out.println("Shadowmourne obtained!");
                                break;
                            case "fragments":
                                System.out.println("Valanyr obtained!");
                                break;
                            case "motes":
                                System.out.println("Dragonwrath obtained!");
                                break;
                        }
                        legendaryItemsMap.put(material,legendaryItemsMap.get(material)-250);
                        isTrue = false;
                        break;
                    }
                }else {
                    junkMap.putIfAbsent(material,0);
                    junkMap.put(material,junkMap.get(material)+quantity);
                }
            }

        }

        for (Map.Entry<String, Integer> entry : legendaryItemsMap.entrySet()) {

                System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());

        }
            for (Map.Entry<String, Integer> entry1 : junkMap.entrySet()) {
                System.out.printf("%s: %d%n",entry1.getKey(),entry1.getValue());
            }

        }
    }

