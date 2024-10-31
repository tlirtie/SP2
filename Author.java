import java.util.*;

public class Author {

    private String name;
    ArrayList<Title> titles = new ArrayList<>();

    Author(String name){ //constructor
        this.name = name;
        this.titles = new ArrayList<>();

    }

    void addTitle(Title title){
        titles.add(title);
    }

    float calculateTotalPay(){
        double totalPay = 0;
        for (Title title : titles){
            totalPay = totalPay + title.calculateRoyalties();

        }

        return (float) totalPay; //transfer result to a float because this function requires that instead of a double for some reason, according to the class diagram

    }

    String getName(){
        return name;
    }
}
