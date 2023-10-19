//to compile source code into byte code we have a command "javac<JavaFileName.java>"
//to convert byte code into machine code we have a command "java <ByteCodeFileName">
public  class New{
    public static void main(String[] args) {

        //Ques.1:-What is public here?
        //Ans:-public means scope.

        //Ques.2:-What is static here?
        //Ans:-static means the static  things are those which comes or get loaded first  and store in memory during class load.

        //Ques3:-What is main here?
        //Ans:-It's a name of method and is the entry point of every java program.

        //Ques.4:-What is void here?
        //Ans:-Null variable and does not return anything.
        //String[] args: This is parameter

        System.out.println("*");

        /*System:means class 
         * out:is object of printstream(Parent Class) class made/create  by/in system class
         * println:is a method 
         */
         
        main();//user-defined overloaded main method
    }

    //Ques:-Can there be more then one main method occurs?

    //Ans:-Yes,there can be more than one main method occues in a single programme but should be different parameters eg:
    public static void main(){
        System.out.println("Hii");
    };
}
