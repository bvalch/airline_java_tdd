public class CabinCrew {

    private String name;
    RankType rankType;

    public CabinCrew(String name, RankType rankType){
        this.name=name;
        this.rankType=rankType;
    }
    public String getName(){
        return this.name;
    }

    public RankType getRankType() {
        return this.rankType;
    }


}
