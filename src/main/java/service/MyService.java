package service;

import domain.Foo;

import java.util.List;

public interface MyService {

    Foo getById(Integer id) throws Exception;

    List<Foo> findByName(String name) throws Exception;

    Foo updateFoo(Foo foo) throws Exception;

}
