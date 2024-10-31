public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        Author author1 = new Author("J.K. Rowling");
        PrintedBook b1 = new PrintedBook("Harry Potter and the Sorcerer's Stone", "SKØN", 1500, 500);
        PrintedBook b2 = new PrintedBook("Fantastic Beasts and where to find them", "TE", 700,120);
        AudioBook b3 = new AudioBook("Harry Potter and the Chamber of Secrets", "LYRIK",950,1000);
        author1.addTitle(b1);
        author1.addTitle(b2);
        author1.addTitle(b3);


        System.out.println(author1.getName() + ": " + author1.calculateTotalPay());




    }
}
