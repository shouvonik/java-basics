public class HelloWorld {

    /*The main() method is a special method in Java Programming that serves as the externally exposed entrance point
    by which a Java program can be run. To compile a Java program, you doesn't really need a main() method in your program.
    But, while execution JVM ( Java Virtual Machine ) searches for the main() method and starts executing from it.*/

    /*public : It is an access specifier that means main() method is accessible globally available.
    This is necessary because this method is being called by the Java Runtime Environment (JRE) which is not located in your current class.
    It is important to note that if you make main() method non-public then it's not allowed to be executed by any program,
    there are some access restrictions applied.*/

    /*static : The main() method in Java must be static, because they can then be invoked by the runtime engine without having to
    instantiate any objects then the code in the body of main() method will do the rest.
    The main() method should be static because otherwise there would be ambiguity : which constructor should be called?
    If the main() is allowed to be non-static, then while calling the main() method JVM has to instantiate its class.
    While instantiating it has to call the constructor of that class, There will be ambiguity if the constructor of that class takes an argument.*/

    /*void : Java is a platform independent programming language and if it will return some value then the value may mean different
    things to different platforms. The "void" is a return type i.e it does not return any value.
    When the main() method terminates, the java program terminates too. Hence, it doesn't make any sense to return from main() method.
    If the main() method spawns new threads, then these threads can keep program running.
        The return type of main doesn't make much sense at this point. If you try to return something from the main method,
    it will give compilation error as an unexpected return value.*/

    /*main() : It's just the name of method or a function name.
    This name is fixed and as it's called by the JVM as entry point for an application. It's not a keyword.*/


    /*String args[] : These are the arguments of type String that your Java application accepts when you run it.
    Java main() method accepts only string type of argument and stores it in a string array.
    It is a collection of Strings , separated by a space, which can be typed into the program on the terminal.*/


    public static void main(String[] args) {
        System.out.println("Hello World");
    }

}
