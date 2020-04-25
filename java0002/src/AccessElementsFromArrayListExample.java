import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();
        System.out.println(" Is the topCompanies list empty? : " + topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        System.out.println("Here are the top" + topCompanies.size() + "companies in the world");
        System.out.println(topCompanies);

        String bestCompany = topCompanies.get(0);
        String secondBestCompanies = topCompanies.get(1);
        String lastCompanies = topCompanies.get(topCompanies.size() - 1);

        System.out.println("Best Company: " + bestCompany);
        System.out.println("Second Best Company" + secondBestCompanies);
        System.out.println("Last company in the list" + lastCompanies);

        topCompanies.set(4, "Walmart");
        System.out.println("Modified top companies list: " + topCompanies);
    }
}
