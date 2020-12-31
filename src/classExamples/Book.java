package classExamples;

import java.util.ArrayList;
import java.util.Random;


// класс BOOK(не экземпляр класса!)
// класс = поля(ты называешь свойства) + методы, которые работаю с данными
public class Book{
    private ArrayList<String> pages = new ArrayList<>();
    private String name;
    private int price;
    private String author;

    // конструктор, который вызывается при создании
    // обычно там инициализруются(уверена, что понимаешь это слово?) поля
    public Book(String name, String author){
        // this значит, мы смотрим поля именно этого экземпляра
        this.name = name;
        this.author = author;
    }

    // если мы определяем свой конструктор, то сразу пропадает базовый(без аргументов)
    // давай и про него не забудем. Пусть будет 2 способа создать Book
    public Book(){
        // я бесполезный конструктор, так как ничего не принимаю и не могу проинициализировать поля
        // зато я могу указать какую-то дефолтную цену
        this.price = 100;
    }

    // методы
    public void updatePrice(){
        Random random = new Random();
        price = (int) (price * (random.nextFloat()/10)+0.95);
    }

    // тот самый getter, благодаря которому мы можем вытягивать инкапсулированные(private) данные
    public String getName(){
        return name;
    }



}
