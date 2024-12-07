class Parent{
    public void sayHello(){
        System.out.println("hellow from Parent");
    }
}

class Child extends Parent{
    @Override
    public void sayHello(){
        System.out.println("Hello from child");
    }
}

class main2{
    public static void main(String[] args){
    Parent p = new Child();
    p.sayHello();
}
}