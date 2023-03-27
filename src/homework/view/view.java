package homework.view;

import homework.model.impl.Persister;
import homework.model.impl.User;

public class view {
    public static void runUser(User user){
        
        user.report();
        user.save();
    }

    public static void runPersister(Persister persister){
        
        persister.report();
        persister.save();
    }


}
