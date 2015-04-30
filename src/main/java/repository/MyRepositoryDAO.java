package repository;

import domain.Foo;

import java.util.List;

public interface MyRepositoryDAO {

    Foo getById(Integer id);

    List<Foo> findByName(String name);

    Foo updateFoo(Foo foo);

}
