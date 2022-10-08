    import java.lang.reflect.Array;
    import java.util.*;
    import java.util.stream.Collectors;

    public class PokemonDontGo_09 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List<Integer> distances = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
    int sum = 0;
            while (!distances.isEmpty()) {
                int index = Integer.parseInt(scanner.nextLine());
                int valueRemovedElement = 0;
                if (index < 0) {
                    valueRemovedElement = distances.get(0);
                    distances.set(0,distances.get(distances.size()-1));
                    sum +=valueRemovedElement;

                } else if (index > distances.size() - 1) {
                    valueRemovedElement = distances.get(distances.size()-1);
                    distances.set(distances.indexOf(distances.get(distances.size()-1)),distances.get(0));
                    sum +=valueRemovedElement;

                }else {
                    valueRemovedElement = distances.get(index);
                    sum +=valueRemovedElement;
                    distances.remove(index);

                }
                for (int i = 0; i < distances.size(); i++) {
                    if (distances.get(i)<=valueRemovedElement){
                        distances.set(i,distances.get(i)+valueRemovedElement);
                    }else {
                        distances.set(i,distances.get(i)-valueRemovedElement);
                    }
                }

            }
            System.out.println(sum);

        }
    }
