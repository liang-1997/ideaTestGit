import java.util.List;

public interface UserDao {

    List<User> queryAllUser();

    List<User> queryUser();
}
