package abstractfactory;

/**
 * Created by luisburgos on 17/07/15.
 */
public abstract class KingdomFactory {

    public abstract Castle makeCastle();
    public abstract King makeKing();
    public abstract Army makeArmy();

}
