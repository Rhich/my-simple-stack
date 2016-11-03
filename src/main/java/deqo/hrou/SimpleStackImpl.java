package deqo.hrou;

import java.util.Stack;

/**
 * Created by 21505775 on 03/11/2016.
 */
public class SimpleStackImpl implements SimpleStack {
    /**
     * un commentaire répondant à l'exigence 3
     */

    Stack<Object> wrappedStack = new Stack<Object>();
    public boolean isEmpty() {

        return wrappedStack.isEmpty();
    }
    public int getSize(){

        return wrappedStack.size();
    }
    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     */
    public void push(Item item){

        wrappedStack.push(item);
    }
    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    public Item peek() throws EmptyStackException {

        return (Item) wrappedStack.peek();
    }
    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     *
     *@throws EmptyStackException if this stack is empty.
     */
    public Item pop() throws EmptyStackException {

        return (Item) wrappedStack.pop();
    }
}
