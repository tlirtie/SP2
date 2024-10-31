public class AudioBook extends Title {
    private int durationInMinutes;


    AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title, literatureType, copies); //Gets the title, literaturetype, and copies from the Title class because AudioBook extends that class
        this.durationInMinutes = durationInMinutes;
    }
    @Override
    double calculatePoints(){
        return durationInMinutes * 0.1;

    }
    @Override
    double calculateLiteraturePoints(){
        switch (literatureType){
            case "BI":
            case "TE": return 1.5;
            case "LYRIK": return 3;
            case "SKØN": return 0.85;
            case "FAG": return 0.5;
            default: return 0;
        }


    }

}
