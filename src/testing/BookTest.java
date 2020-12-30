package testing;

import classExamples.Book;

import java.util.ArrayList;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Тургенев", "Записки Охотника");
        Book book2 = new Book("Голубое сало", "Сорокин");


        ArrayList<Book> bookShop = new ArrayList<>();
        bookShop.add(book1);
        bookShop.add(book2);


        for (int i = 0; i < bookShop.size(); i++){
            System.out.println("Книга: " + bookShop.get(i).getName());
        }




        //----------------------------------------------------------------------------------------

//        sout(book1.getName());


    }
}
