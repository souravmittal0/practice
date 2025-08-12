package lambda.intro;

public class StringProcessorUsingLambda {

    public static void main(String[] args) {
        //Using ANONYMOUS INNER CLASS
        System.out.println(process("Hello", new Processor() {
            @Override
            public String process(String str) {
                return str.toUpperCase();
            }
        }));

        //Using LAMBDA EXPRESSION
        System.out.println(process("Hello", (s) -> s.toUpperCase()));

        //Using LAMBDA EXPRESSION + METHOD REFERENCE
        System.out.println(process("Hello", String::toUpperCase));
    }

    private static String process(String str, Processor processor) {
        return processor.process(str);
    }
}

interface Processor {
    String process(String str);
}
