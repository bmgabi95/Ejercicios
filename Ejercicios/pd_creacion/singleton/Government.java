package singleton;

public class Government {

    static Government government;

    private Government () { }

    public synchronized static Government getGovernment(){
        if(government == null){
            government = new Government();
        }
        return government;

    }

}
