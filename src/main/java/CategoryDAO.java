import java.util.HashMap;
import java.util.List;

public interface CategoryDAO {
    List<Category> queryAllCate();

    List<Category> queryCate();

    HashMap<String, Category> queryById();
    //分支写的代码
    void queryUserByName(String username);
}
