package testing;

import classExamples.Stack;

class StackTest {
    public static void main(String[] args) throws Exception {
        {
            // организовываем мини-тестирование
            // assert выстреливает исключением, если выражение в скобках FALSE

            Stack stack = new Stack(3);
            // stack ->
            assert (stack.isEmpty() == true);
            stack.push(10);
            // stack -> 10
            assert stack.peek() == 10;
            stack.push(11);
            // stack -> 10 11
            assert stack.peek() == 11;
            stack.push(12);
            // stack -> 10 11 12
            assert stack.peek() == 12;
            stack.push(13);
            // stack -> 10 11 12 13
            assert (stack.peek() == 13);

            assert (stack.pop() == 13);
            // stack -> 10 11 12
            assert (stack.pop() == 12);
            // stack -> 10 11
            assert (stack.pop() == 11);
            // stack -> 10
            assert (stack.pop() == 10);
            // stack ->
        }
    }
}
