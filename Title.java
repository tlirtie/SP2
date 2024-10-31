public abstract class Title {
    protected String title;
    protected String literatureType;
    protected int copies;
    protected double rate = 0.067574;

    Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
        
    }


    double calculateRoyalties(){
        return calculatePoints() * rate;
    }

    abstract double calculatePoints();
    abstract double calculateLiteraturePoints();

}
