import java.util.*;

public class Ranking_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> contestMap = new LinkedHashMap<>();
        LinkedHashMap<String, Candidate> candidatesMap = new LinkedHashMap<>();
        List<Candidate> candidatesList = new ArrayList<>();

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end of contests")) {
            String contest = inputLine.split(":")[0];
            String password = inputLine.split(":")[1];
            contestMap.putIfAbsent(contest, password);
            inputLine = scanner.nextLine();

        }
        String inputCandidates = scanner.nextLine();
        while (inputCandidates.equals("end of submissions")) {
            String contest = inputLine.split("=>")[0];
            String password = inputLine.split("=>")[1];
            String nameCandidate = inputLine.split("=>")[2];
            int points = Integer.parseInt(inputLine.split("=>")[3]);
            if (contestMap.containsKey(contest) && contestMap.get(contest).equals(password)) {

                candidatesMap.putIfAbsent(nameCandidate, new Candidate(nameCandidate));
                candidatesMap.get(nameCandidate).setCandidateMap(contest,points);
            }


            inputCandidates = scanner.nextLine();
        }
        for (Map.Entry<String, Candidate> entry : candidatesMap.entrySet()) {
            for (Map.Entry<String, Integer> entry2 : entry.getValue().candidateMap.entrySet()) {
                System.out.println(entry2.getValue());
            }

        }

    }
}

class Candidate {
    String name;
    LinkedHashMap<String, Integer> candidateMap;

    public Candidate(String name) {
        this.name = name;
    }

    public void setCandidateMap(String contest, int points) {
        this.candidateMap.putIfAbsent(contest, points);
        if (candidateMap.get(contest) < points) {
            this.candidateMap.put(contest, points);
        }
    }
}
