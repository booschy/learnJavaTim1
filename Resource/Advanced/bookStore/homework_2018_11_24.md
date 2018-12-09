## Task: Create an application for a book store.


### 1. Book 

 - name
 - author
 - year
 - genre : 
      - ROMANCE
      - FICTION
      - CHILDREN
      - MYSTERY
      
      (Tip: use Enum)
      
- price 

   Use encapsulation. Only the price can be updated for a book.


### 2. Book store

    - a map of books with unique id (a random string of 4 digits).
    - a map of book quantities (key=bookId, value=quantity)

    Create an empty book store.



### 3. Add book / books

 - add a book (one ore more of the same book, specify quantity)

    Manually add following books:

    The Hunger Games | Suzanne Collins | 2008 | FICTION | 11.25 $ | 1
    
    Beautiful Disaster | Jamie McGuire | 2011 | romance | 12.34 $ | 2
    
    A Wrinkle in Time | Madeleine L'Engle | 1973 | children | 11.97 $ | 5

 - print book store

 - add all books from file (books.txt)

 - print book store

### 4. Search

 All return a list of BookInfo

 - search books by name
 - search books by author
 - search books by genre - HOMEWORK
 - search books by name and author - HOMEWORK adding
 - search books cheaper than a specified price


 - get the cheapest book/books - 2 steps
    - get the lowest price
    - filter data by lowest price

 - get the oldest book/books - HOMEWORK

 - get the rarest book/books


### 5. Status

    - get the store status and save it in a file(bookStore\status\bookStoreStatus.txt);
 
    - use an object to store the status

    - store books quantity
     - total price for books in store

    - unique books quantities
    - books quantity and price by genre


5.1
- save BookStore as object to a file


### 6. Selling

 - sell book (by name, quantity)

    - if quantity is 0 after the sell, remove the book from store

    - if quantity is more than what we have in the store, then only sell what we have

    - generate invoice (use an Invoice object) and save in the file (bookStore\invoices\invoice.txt)

       Invoice: #invoiceNumber
       
       Item: Book.toString()
       
       Quantity: 5
       
       Price/item: 10 $

       Total price: 50 $

    - invoice number starts from 1

 - sell books (same logic as above), generate invoice in file

 - save final store status


### GOOD LUCK!
