import compaunds.BusinessClass;
import compaunds.EconomyClass;
import compaunds.FirstClass;
import primitives.Pilot;
import primitives.Stewardess;

import java.util.ArrayList;
import java.util.List;

import static primitives.Pilot.pilots;

public class Boarding {
    public static final int maxLuggageWeight=4000;
    protected EconomyClass economyClass;
    protected BusinessClass businessClass;
    protected FirstClass firstClass;
    protected Pilot pilots=new Pilot();
    protected Stewardess stewardesses=new Stewardess();
    protected int overWeight;

    public Boarding(EconomyClass economyClass, BusinessClass businessClass, FirstClass firstClass,
    int  countPilots, int countStewardesses){
        this.economyClass=economyClass;
        this.businessClass=businessClass;
        this.firstClass=firstClass;
        for(int i=0;i<countPilots;i++){
           this.pilots.add(new Pilot());
        }
        for(int i=0;i<countStewardesses;i++){
            this.stewardesses.add(new Stewardess());
        }
        if(countStewardesses==6 && countPilots==2) {
            if(this.checkBoarding())
            System.out.println("Ready to fly");
        }
        else{
            System.err.println("Can't fly");
        }
    }
    public boolean checkBoarding(){
        int s;
        s=this.economyClass.getSummaryWeight()+ this.businessClass.getSummaryWeight()+
                this.firstClass.getSummaryWeight();
        if(s<=maxLuggageWeight)
            return  true;
        System.err.println("The aircraft is overloading");
        this.overWeight=s-maxLuggageWeight;
        return false;
    }

    public  void removeLuggage(){
        if(!this.checkBoarding()){
            this.economyClass.removeLuggage(this.overWeight);
            System.out.println("Over weight was removed. Ready to fly!");
        }
    }
}
