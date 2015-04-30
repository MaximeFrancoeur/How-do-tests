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

#### 2. Create first test with mock
  - Annotation config (@RunWith(MockitoJUnitRunner.class))
  - setup (@InjectMocks and @Mock)
  - mock service..
  - create builder object
  -  Expected Exception (@Test(expected = Exception.class))

#### 3. How mock private methode ?

#### 4. How captor a property ?

#### 5. How spy a methode ?

### 6. Run test with covrage in Intellij

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


#### 7. How test DAO with Flyway ?
  - Create Flyway config
  - Create Flyway insert data

#### 8. How test Controller ?

#### 9. Best practice

#### 10. Thank you
