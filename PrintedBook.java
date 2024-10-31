public class PrintedBook extends Title {
    private int pages;

    PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies); //gets the title, literature type and copies from Title, whiich PrintedBook extends
        this.pages = pages;

    }
    @Override
    double calculatePoints(){
        return pages * calculateLiteraturePoints() * copies;

    }
    @Override
    double calculateLiteraturePoints(){
        switch (literatureType){ //switch statement to return literature points based on which genre it is
            case "BI":
            case "TE": return 3;
            case "LYRIK": return 6;
            case "SKØN": return 1.7;
            case "FAG": return 1;
            default: return 0;
        }
    }

    }

