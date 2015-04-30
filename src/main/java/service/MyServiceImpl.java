package service;

import domain.Foo;
import repository.MyRepositoryDAO;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;

public class MyServiceImpl implements MyService {

    @Inject
    private MyRepositoryDAO myRepositoryDAO;

    public Foo getById(final Integer id) throws Exception {

        if (id == null) {
            throw new Exception("Id is null...");
        }

        final Foo foo = myRepositoryDAO.getById(id);

        if (foo == null) {
            // ...
        }

        return foo;
    }

    public List<Foo> findByName(final String name) throws Exception {
        if (name == null || name.equals("")) {
            throw new Exception("Name is null...");
        }

        final List<Foo> foo = myRepositoryDAO.findByName(name);

        if (foo == null) {
            // ...
        }

        return foo;
    }

    public Foo updateFoo(Foo foo) throws Exception {

        if (foo == null || foo.getId() == null) {
            throw new Exception("...");
        }

        foo.setLastModifiedDate(new Date());

        final Foo fooUpdated = myRepositoryDAO.updateFoo(foo);

        return fooUpdated;
    }
}
