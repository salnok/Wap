import java.util.ArrayList;
import java.util.List;

public class UserDB {
    List<User> userDBS = new ArrayList<>();

    UserDB(){
        userDBS.add(new User("henok","1234"));
        userDBS.add(new User("eldana","4321"));
    }

    public List<User> getUserDBS() {
        return userDBS;
    }
}
