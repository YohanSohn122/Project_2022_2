package org.example;

public interface ICRUD {
    Object add();
    int update(Object obj);
    int delete(Object obj);
    void selectOne(int id);
}
