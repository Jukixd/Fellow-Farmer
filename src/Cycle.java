// Class for declaration date
public class Cycle {
    private int counter = 1;
    private int day;
     private int week = 1;
     private Season season;



    // method for starting new game to set date right
     public void Firstday(){
             setCounter(1);
             setDay(1);
             setWeek(1);
             setSeason(Season.Spring);
     }



    // method for Prooceeding to a next day
    public void procceedday(Cycle d,Farm j){
        setCounter(getCounter()+1);
        setDay(getDay()+1);
        j.Farmchceck(d);
    }

    // method for changing season
    public void nextseason(){
         if (season.equals(Season.Spring)){
             setSeason(Season.Summmer);
         }
         else if (season.equals(Season.Summmer)){
             setSeason(Season.Atumm);
         }
         else if (season.equals(Season.Atumm)){
             setSeason(Season.Winter);
         }
         else if (season.equals(Season.Winter)){
             setSeason(Season.Spring);
         }
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day>7){
            setDay(1);
            setWeek(getWeek()+1);
        }
        else {
            this.day = day;
        }
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        if (week>3){
            setWeek(1);
            nextseason();
        }
        else {
            this.week = week;
        }
    }


    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }


    @Override
    public String toString() {
        return season.name()+" Week: "+week+" Day: "+day+" (Counter: "+counter+")";
    }
}
