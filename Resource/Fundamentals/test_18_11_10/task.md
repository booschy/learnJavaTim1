## Task: Using current project (learnJava) complete the following tasks:

1. Create a source code package named test_18_11_10 for the task below.

   #### 5 POINTS

2. Create a type to store the following information about a movie:
 
    name

    year (of release, int)

    ticketPrice (float)

    Use encapsulation, constructor from all fields, no setters, getters.

   #### 10 POINTS

   Override one method from this class so that

   System.out.println(movieInstance);

   will display:

       "Name: nameValue
       Year: yearValue
       Ticket price: ticketPriceValue $"
       
    #### 10 POINTS


3. Create an Interface called MovieUtils with only one method.

       ... getPrice(Movie movie){ ... }

    so that you can use it form anywhere like this:

    float price = MovieUtils.getPrice(movieInstance);

    #### 10 POINTS


4. Create a class named MovieTest with a main method within.

    - Create a list of 10 movies with the following information:

          Venom, 20018, 10
          Aquaman, 2018, 8
          Mile 22, 2018, 9
          Blade Runner 2049, 2017, 9
          Murder on the Orient Express, 2017, 8
          Baby Driver, 2017, 6
          Deadpool, 2016, 5
          Nocturnal Animals, 2016, 9
          Manchester by the Sea, 2016, 8
          The Invisible Guest, 2016, 7

      You can add them one by one to the list (if you want you can read the list from a file).
      Print all elements from the created movie list.

   #### 15 POINTS


   - Create a method that uses a movie list and gets the average price for movies in 2018 and 2016.

     Call created method in main for the movie list from a).
     Print result.


   #### 25 POINTS


   - Create a method that filters a list by prices bigger than a given value
   (it will return a list with all movies with prices bigger than the specified value).

     Use the method from MovieUtils to get the price for each movie.

     Call created method in main for the movie list from a) and the price 8.
     Print all elements from the returned list.

   #### 15 POINTS


5. Commit the code in the local repository and then push it to the remote one.

   #### 10 POINTS


## TOTAL 100 POINTS

## GOOD LUCK TEAMS!


##### EXTRA TASK (Homework)

Generate a map from the persons list with key = year, value = list of names.
