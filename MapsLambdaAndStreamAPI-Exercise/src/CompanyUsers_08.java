import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
//: "{companyName} -> {employeeId}".
        String input = scanner.nextLine();
        LinkedHashMap<String, List<String>> companyUsersMap = new LinkedHashMap<>();
        while (!input.equals("End")){
            String companyName = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];
companyUsersMap.putIfAbsent(companyName,new ArrayList<>());
if (!companyUsersMap.get(companyName).contains(employeeId)){
    companyUsersMap.get(companyName).add(employeeId);
}
        input=scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companyUsersMap.entrySet()) {
            System.out.println(entry.getKey());
            for (String id:entry.getValue()) {
                System.out.println("-- "+id);
            }
        }

    }
}
