import java.util.ArrayList;
import java.util.List;

public class MyStack {

    List<String> elements =new ArrayList<>();

    //create push, peek, pop method for MyStack
    public void push(String value){
        elements.add(value);
    }
    public String peek(){
        if(elements.isEmpty()){
            return null;
        }
        return elements.get(elements.size()-1);
    }
    public String pop(){
        if(elements.isEmpty()){
            return null;
        }
        String e=elements.remove(elements.size()-1);
        return e;
    }
    //create toString method
    @Override
    public String toString() {
        return "The Stack of employees is: \n"+elements;
    }
}

