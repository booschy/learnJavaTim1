## Individual Task
### Create main.advancedCoding.test_19_01_05 package and complete the following tasks:

1.  Create a type for storing information for an user account:
 
    email, first name, second name, password,
    cash credits, tutorial subscriptions.

    Available Tutorial subscriptions: Pluralsight, Udemy, LinkedIn learning, Coursera.

    Create 2 constructors: one from all fields and one without credits (default 0)
    and subscriptions (default empty).

    Two accounts are equal if they have the same email.

    Account information must pe printable as string:
    "danginkgo@yahoo.com, Dan, Rusu, 500, [Pluralsight, LinkedIn Learning]"


    All methods, but constructor, getters, and setters must be unit tested.
    Put unit tests in corresponding packages within the test package.

    #### 20 POINTS


2.  Each subscription will have a price per year
    - Pluralsight - 300 $
    - Udemy - 400 $
    - LinkedIn learning - 350 $
    - Coursera - 450 $

    Constraint: use enumerations.

    Refactor the user account to use the created enumeration values.

    Assure that the unit tests still pass.

    #### 20 POINTS


3.  Create a contract for an UserAccountCatalog that will have the following functionality:


    - add user account (unique user accounts)

    - find user account by email

    - remove user account by email

    - add subscription

    - remove subscription

    - gets catalog's size.

    #### 10 POINTS


4.  Create a UserAccountCatalog implementation (Catalog.java) that:

    - stores a list of user accounts; the catalog starts
    empty and you can add user unique user accounts

    - stores and updates subscription information

        key - subscription

        value - a list of (email, first name, second name) for the accounts
        that have the key subscription

    - adding a subscription can be done only if the user has credits; the credits for the
    added subscription will be removed;

    - throw custom Exceptions if any operation is not possible

    - use TDD.

    #### 50 POINTS


5.  Refactor the Catalog so that
    - you can add add a subscription to a user account if the user does not have enough credits
    but it has at least two other subscriptions
    - the credit will be negative after the adding
    - rerun the unit tests.

    #### 10 POINTS



## TOTAL 100 POINTS

## GOOD LUCK!

