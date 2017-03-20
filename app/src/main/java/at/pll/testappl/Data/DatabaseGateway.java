package at.pll.testappl.Data;

import java.util.ArrayList;

/**
 * Created by Pascal on 16.03.2017.
 */

public class DatabaseGateway {
    private static DatabaseGateway singletonInstance = null;
    private ArrayList<Unit> listUnits = null;

    public static DatabaseGateway newInstance(){
        if(singletonInstance == null){
            singletonInstance = new DatabaseGateway();
        }

        return singletonInstance;
    }

    private DatabaseGateway(){
        listUnits = new ArrayList<Unit>();
    }
}
