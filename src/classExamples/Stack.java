package classExamples;


// объявляем класс Stack
// он будет хранить в себе данные и методы, обрабатывающие эти данные
public class Stack {
    // array - массив, в котором хранятся элементы
    int[] array;
    // размер заполнненого стека
    int size;

    // конструктор класса
    // вызывается при создании экземпляра
    // например, Stack myStack = new Stack(100);
    // max_size - максимально возможный размер стека(граница)
    public Stack(int maxSize) {
        // создаём массив с размером, который мы получили в аргументах
        this.array = new int[maxSize];
        // при создании размер пуст
        this.size = 0;
    }

    // метод добавляет новый элемент в стека в хвост
    public void push(int value) {
        // проверяем, вдруг стек переполнен
        // если да, то делаем массив, в котором он лежит больше
        if (this.array.length <= this.size) {
            int[] array = new int[(int) (this.size * 1.4)];
            for (int i = 0; i < this.array.length; i++) {
                array[i] = this.array[i];
            }
            this.array = array;
        }

        this.array[size] = value;
        size++;
    }

    // возвращаем последний элемент
    public int peek() throws Exception {
        if (!isEmpty()) {
            return array[size - 1];
        } else {
            throw new Exception("Попытка получить элемент из пустого стека");
        }
    }

    // удаляем из стека последний элемент
    // то есть тот, который пришёл последний
    public int pop() throws Exception {
        if (!isEmpty()) {
            size--;
            return array[size];
        } else {
            throw new Exception("Попытка удалить элемент из пустого стека");
        }
    }

    // проверяем на пустоту
    public boolean isEmpty() {
        return size == 0;
    }


}


