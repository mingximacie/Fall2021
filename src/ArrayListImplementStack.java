import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListImplementStack {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            //using Scanner method to read the file.
            File file = new File("/Users/mx/Desktop/cs401/lab/emp.txt");
            Scanner sc = new Scanner(file);

            //create an ArrayList object to store employees' information.
            List<String> employees = new ArrayList<>();
            while (sc.hasNextLine()) {    //read the names and IDs, then add them to ArrayList
                String line = sc.nextLine();
                employees.add(line);
            }
            System.out.println("The names and IDs of 30 employees are: \n" +employees);
            System.out.println("-----------------------------");

            //create new employee object to call the method from MyStack
            MyStack employee = new MyStack();
            for(int i = 0; i<employees.size();i++){
                //push the elements of ArrayList object employees to MyStack object employee.
                employee.push(employees.get(i));
            }
            System.out.println(employee);
            System.out.println("-----------------------------");
            System.out.println("The top element of the stack is: "+employee.peek());
            System.out.println("Pop two elements from the employees stack: "+employee.pop()+", "+employee.pop());
            System.out.println("The new top element of the stack is: "+employee.peek());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
