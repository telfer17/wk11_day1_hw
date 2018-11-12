public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int remainingPaper(){
        return this.paper;
    }

    public int remainingToner(){
        return this.toner;
    }

    public void print(int pages, int copies){
        int pagesNeeded = pages * copies;
        if(this.paper >= pagesNeeded && this.toner >= pagesNeeded){
            this.paper -= pagesNeeded;
            this.toner -= pagesNeeded;
        }
    }

    public int paperRefill(){
        return this.paper = 100;
    }


}
