package final_project.service;

import java.util.ArrayList;

public interface IService<T> {
    void insert(T object, ArrayList<T> objs);
    void update(T object, ArrayList<T> objs);
    void delete(T object, ArrayList<T> objs);
}
