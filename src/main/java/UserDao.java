import java.util.HashMap;
import java.util.List;

public interface UserDao {

    List<User> queryAllUser();

    List<User> queryUser();

    List<User> query();

    User getLike(String name);

    void testGit();

    HashMap<String, User> queryById();
}
