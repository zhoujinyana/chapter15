import org.junit.jupiter.api.Test;

import java.util.*;

@SuppressWarnings({"all"})
public class HomeWork02 {
    public static void main(String[] args) {

    }
@Test
    public void test(){
        DAO<User> dao = new DAO<>();
        dao.save("001",new User(1,10,"jack"));
        dao.save("002",new User(2,10,"jack"));
        dao.save("003",new User(3,10,"jack"));

        List<User> list = dao.list();
        System.out.println(list);
    }
}
class User{
    private int id,age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
class DAO<T>{
    private Map<String,T> map = new HashMap<>();
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entity){
        map.put(id,entity);
    }
    public List<T> list(){
        List<T> list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            list.add(map.get(key));
        }
        return list;

    }

    public void delete(String id){
        map.remove(id);
    }

    public void save(String id,T entity){
        map.put(id,entity);
    }




}