# ![Mockito logo](https://raw.githubusercontent.com/MaximeFrancoeur/How-do-tests/master/img/mockito_logo.png)  How do tests with Mockito.
### This page is under construction.

#### 1. Add dependency in your project Maven 
```java
<dependency>
	<dependency>
		<groupId>junit</groupId>
		<artifactId>junit</artifactId>
		<version>4.12</version>
		<scope>test</scope>
	</dependency>
	<dependency>
		<groupId>org.mockito</groupId>
		<artifactId>mockito-core</artifactId>
		<version>2.0.7-beta</version>
	</dependency>
	<dependency>
		<groupId>javax.inject</groupId>
		<artifactId>javax.inject</artifactId>
		<version>1</version>
	</dependency>
</dependency>
```

#### 2. Create a test Class
In Intellij open a Class and the shortcut to create a test Class is. : `CTRL + shift + t`

- Select Junit4
- Check setUp /@Before
- Check All the methods you want to test.

<p align="center">
<img align="center" src="https://raw.githubusercontent.com/MaximeFrancoeur/How-do-tests/master/img/create_test.png" alt="Create test">

  - Annote your Class test with @RunWith(MockitoJUnitRunner.class)
  - Add @InjectMocks on Class test
  - Add @Mock on all Class mock
  - Add @Before and init annotations

```java
// Example service
public class MyServiceImpl implements MyService {

    @Inject
    private MyRepositoryDAO myRepositoryDAO;

    public Foo testExample(final Integer id) throws Exception {
		...
    }
}

// Example class test
@RunWith(MockitoJUnitRunner.class)
public class MyServiceImplTest {

    @InjectMocks
    private MyServiceImpl myService;

    @Mock
    private MyRepositoryDAO myRepositoryDAO;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testExample() throws Exception {
	    ...
	}

}
```

#### 3. What test?

I have a service to test with his methods. I should do what test to cover the largest number of cases?

```java
public class MyServiceImpl implements MyService {

    @Inject
    private MyRepositoryDAO myRepositoryDAO;

    public Foo getById(final Integer id) throws Exception {

		// 1. Test if id is null : expected Exception
        if (id == null) {
            throw new Exception();
        }
        
		// 2. Test whether the argument is passed to the DAO.
		// 3. Test if the argument is the same as that through the method.
        final Foo foo = myRepositoryDAO.getById(id);

		// 4. Test if foo is null : expected Exception
        if (foo == null) {
            throw new Exception();
        }

		// 5. Finally a test with no error.
        return foo;
    }

    public List<Foo> findByName(final String name) throws Exception {

		// 1. Test if name is null : expected Exception
		// 2. Test if name is not null but empty ("") : expected Exception
        if (name == null || name.equals("")) {
            throw new Exception();
        }

		// 3. Test whether the argument is passed to the DAO.
		// 4. Test if the argument is the same as that through the method.
        final List<Foo> foo = myRepositoryDAO.findByName(name);

		// 5. Test if foo is null : excepted ArraysList empty
        if (foo == null) {
            return new ArrayList<Foo>();
        }
		
		// 5. Finally a test with no error.
        return foo;
    }

    public Foo updateFoo(Foo foo) throws Exception {

		// 1. Test if foo is null : expected Exception
		// 2. Test if foo is not null but if id is null : expected Exception
        if (foo == null || foo.getId() == null) {
            throw new Exception();
        }
		
		// 3. Test if lastModifiedDate is modified.
        foo.setLastModifiedDate(new Date());

		// 4. Finally a test with no error.
        return myRepositoryDAO.updateFoo(foo);
    }
}
```

#### 4. How mock private methode ?

#### 5. How captor a property ?

#### 6. How spy a methode ?

#### 7. Run test with covrage in Intellij

To run the tests with Intellij, you only have to click right on the Class or the Class has an external method if you click in a way only this test method will be run.

<p align="center">
<img align="center" src="https://raw.githubusercontent.com/MaximeFrancoeur/How-do-tests/master/img/right_click.png" alt="Run test with coverage">
<p>

<p>
After your test is finished, you can go into the Class or that you have tested. And look to your left. You will see green and red bars may be darker than me because I changed the configuration in Intellij gluer.
</p>

- The green bar means that one or tests are spent on its lines.
- The red bar means that no test cases have passed through his lines of code.

<p align="center">
<img align="center" src="https://raw.githubusercontent.com/MaximeFrancoeur/How-do-tests/master/img/covrage.png" alt="coverage">
</p>

<br/>
You can click the green bars to view the number of times that his line was covered by your tests.

<p align="center">
<img align="center" src="https://raw.githubusercontent.com/MaximeFrancoeur/How-do-tests/master/img/left_click_covrage.png" alt="Number hits">
</p>

<br/>
At the bottom right of your Intellij you your new option appear.
Click above to see the percentage of power line method and hedged Class.

<p align="center">
<img align="center" src="https://raw.githubusercontent.com/MaximeFrancoeur/How-do-tests/master/img/icon_covrage_right.png" alt="New icon coverage">
</p>

<br/>
Click in the packages you want to go and watch the number of percentage cover your project.

<p align="center">
<img align="center" src="https://raw.githubusercontent.com/MaximeFrancoeur/How-do-tests/master/img/covrage_detail.png" alt="All coverage">
</p>


#### 8. How test DAO with Flyway ?
  - Create Flyway config
  - Create Flyway insert data

#### 9. How test Controller ?

#### 10. Best practice
