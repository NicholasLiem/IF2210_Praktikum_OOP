package TemplatePattern;


public class ProcessorDriver {
    public static void main(String[] args){
        Processor pC = new ImplementorC();
        pC.check();
        pC.run();
    }
}
