package lesson7.demo;

public class Vietnamese extends Person{
    private String name;

    @Override
    public String saySomething() {
        return "Vietnam";
    }

    public String saySomething(String something){
        return "";
    }
}
