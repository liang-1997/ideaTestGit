public class Category {
    private String cateName;
    private String levels;

    @Override
    public String toString() {
        return "Category{" +
                "cateName='" + cateName + '\'' +
                ", levels='" + levels + '\'' +
                '}';
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public String getLevels() {
        return levels;
    }

    public void setLevels(String levels) {
        this.levels = levels;
    }

    public Category(String cateName, String levels) {
        this.cateName = cateName;
        this.levels = levels;
    }

    public Category() {
    }
}
