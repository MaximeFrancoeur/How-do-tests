package controller;

import domain.Foo;

import java.util.List;

public interface MyController {

    Foo getById(Integer id);

    List<Foo> findByName(String name);

    Foo updateFoo(Foo foo);
}
