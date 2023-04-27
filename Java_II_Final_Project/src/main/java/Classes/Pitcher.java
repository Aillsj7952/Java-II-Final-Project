/*
 * Joyce Aills
 * I have created the pitcher class with get and set methods. I also did a method to calculate era.
 * 
 */
package Classes;

/**
 *
 * @author Jon
 */
public class Pitcher {
 public class PitcherClass {

    private String firstName;
    private String lastName;
    private int nopitches;
    private int battersFaced;
    private int strikeouts;
    private double inningsPitched;
    private int hits;
    private int runScored;
    private int earnedRuns;
    private int walks;
    private int atBats;
    private int strikes;
    private int hitByPitch;
    private double era;
    
    public PitcherClass(){
        this.firstName = "";
        this.lastName = "";
        this.nopitches = 0;
        this.battersFaced = 0;
        this.strikeouts = 0;
        this.inningsPitched= 0.0;
        this.hits = 0;
        this.runScored = 0;
        this.earnedRuns = 0;
        this.walks = 0;
        this.walks = 0;
        this.atBats = 0;
        this.strikes = 0;
        this.hitByPitch = 0;
       
    
}
    public String getFirstName() {
        return firstName;
    }

   
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    public String getLastName() {
        return lastName;
    }

    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
  
    
    public int getNopitches() {
        return nopitches;
    }

    
    public void setNopitches(int nopitches) {
        this.nopitches = nopitches;
    }

    
    public int getBattersFaced() {
        return battersFaced;
    }

    
    public void setBattersFaced(int battersFaced) {
        this.battersFaced = battersFaced;
    }

    
    public int getStrikeouts() {
        return strikeouts;
    }

    
    public void setStrikeouts(int strikeouts) {
        this.strikeouts = strikeouts;
    }

    
    public double getInningsPitched() {
        return inningsPitched;
    }

    
    public void setInningsPitched(int inningsPitched) {
        this.inningsPitched = inningsPitched;
    }

    
    public int getHits() {
        return hits;
    }

    
    public void setHits(int hits) {
        this.hits = hits;
    }

    
    public int getRunScored() {
        return runScored;
    }

    
    public void setRunScored(int runScored) {
        this.runScored = runScored;
    }

    public int getEarnedRuns() {
        return earnedRuns;
    }

    
    public void setEarnedRuns(int earnedRuns) {
        this.earnedRuns = earnedRuns;
    }

    
    public int getWalks() {
        return walks;
    }

    
    public void setWalks(int walks) {
        this.walks = walks;
    }

    
    public int getAtBats() {
        return atBats;
    }

    
    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    public int getStrikes() {
        return strikes;
    }

   
    public void setStrikes(int strikes) {
        this.strikes = strikes;
    }

    
    public int getHitByPitch() {
        return hitByPitch;
    }

   
    public void setHitByPitch(int hitByPitch) {
        this.hitByPitch = hitByPitch;
    }

    private double getERA(double inningsPitched, int earnedRuns){
        era = earnedRuns/inningsPitched;
        return era;
    }
   
}
