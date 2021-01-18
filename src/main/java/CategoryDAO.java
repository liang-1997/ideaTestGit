import java.util.HashMap;
import java.util.List;

public interface CategoryDAO {
    List<Category> queryAllCate();

    List<Category> queryCate();

    HashMap<String, Category> queryById();
    //分支写的代码
    void queryUserByName(String username);

    void queryUserByName(String username,int a);
    //主支写的代码
    User queryCategoryByTitle(String title);
}
