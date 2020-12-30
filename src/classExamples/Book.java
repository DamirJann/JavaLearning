package classExamples;

import java.util.ArrayList;
import java.util.Random;

public class Book{
    private ArrayList<String> pages = new ArrayList<>();
    private String name;
    private int price;
    private String author;
             // норма    // сорокин
             public Book(String name, String author){
        this.name = name;
        this.author = author;
    }


    public void updatePrice(){
        Random random = new Random();
        price = (int) (price * (random.nextFloat()/10)+0.95);
    }

    public int getCountOfExistsPages(){
        int count = 0;
        for (int i = 0; i < pages.size(); i++){
            if (pages.get(i) != null){
                count++;
            }
        }
        return count;
    }

    public String getName(){
        return name;
    }



}
