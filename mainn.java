// YAAAAAAAYYYYYYYYYYYYYYYY
class Main{
  public static void main(String[] args){

    System.out.println("A");
    System.out.print("  or ");
    System.out.printf("");
    
    int num; //whole numbers
    boolean trueFalse; //true or false
    String words; // strings of text
    char c; //single character
    double fractions; //doubles - fractional nums
    float decimalll; //funny things that keep decimals to a certain point
    
    //variable naming conventions: START WITH A LOWERCASE LETTERS, LETTERS, PLS
    //CLASSES NAMING START WITH A UPPERCASE
    //  if your variable has more than one word, it starts the second word with uppercase
    //camelCase <- like tis
    // variables should be obvious 
    // if its a radius NAME IT RADIUSSS
    
    num = 4;
    //num now stores the value 4
    //NOT NUM EQUAL FOUR
    
    words = "hellow worllddd";
    // double qoutes for strings

    trueFalse = true;
    //booleans in java is all lowercase
    
    fractions = 3.5;
    c = '!';
    //single qoute for char, stores one 

    // strings - escape characters
    // "\" alters meaning of the following code
    System.out.println("a\na");
    // \n new line
    // \t tab
    // \" changes double qoutes into a character instead of the line ending code.
    // \\ changes escape character into a normal backslash
    
    // variable - using variable at other points in the program
    // when variables are used anywhere except the left side of the equal side, it is a variable call

    System.out.println(words);

    
    num = num + 1;  // assignments always happen last 
    //rightside happen before leftside)
    // like num + 1 and then num = num +1
    num ++; //only adds one
    ++ num;
    num += 1; 
    
    // subtraction (-) multiplication (*) division (/) mod(%) <- remainders
    // -=, *=, /=, %=
    System.out.println(5/7);
    System.out.println(3.5+5/7);
    // because of order of operations it does 5/7 first then adds 3.5 which is 1+3.5 = 4.5

    num = 5;
    System.out.println(num++); //runs after the line of code runs
    num = 5;
    System.out.println(++num); // runs before the line of code runs

    System.out.println(10%3);
  }
}
