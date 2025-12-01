public class GenericMethods {

    public static void main(String[] args) {
        printData("hello");
        printData(123);

        GenericMethods obj = new GenericMethods();
        obj.doubeData(456);
    }

    //I want to make this method parameterized , I'm passing generics 'E' custom datatype
    //static <E> here --> <E> telling the compiler that this method 'printData' supports parameterized type of data 'E'.

    //'E' supports any type of data - String, Integer etc., --> I don't have to create separate methods / no method overloading is required here for different types of data printData
    static <E> void printData(E data){
        System.out.println(data);
    }

    <E> void doubeData(E data){
        System.out.println(data);
    }

}
