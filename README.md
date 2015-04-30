# ![Mockito logo](https://raw.githubusercontent.com/MaximeFrancoeur/How-do-tests/master/img/mockito_logo.png)  How do tests with Mockito.
### This page is under construction.

#### 1. Add dependency in your project Maven 
```java
<dependency>
	<groupId>org.mockito</groupId>
	<artifactId>mockito-core</artifactId>
	<version>2.0.7-beta</version>
</dependency>
```

#### 2. Create a test Class
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
