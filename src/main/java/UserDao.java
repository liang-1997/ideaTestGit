import java.util.List;

public interface UserDao {

    List<User> queryAllUser();

    List<User> queryUser();

    List<User> query();

    User queryLike(String name);
}
