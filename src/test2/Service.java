package test2;

import java.util.List;

public interface Service <T> {
    void insertObj(T Obj, List<T> Objs);
    void deleteObj(T Obj, List<T> Objs);
    void updateObj(T Obj, List<T> Objs);
}
