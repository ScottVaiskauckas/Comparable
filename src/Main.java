class Main{
    public static void main(String[] args) {
        MyClass myClass = new MyClass(5);
        System.out.print(myClass.equals(new MyClass(5)));

        myClass = new MyClass(6);
        System.out.print(myClass.equals(new MyClass(5)));
    }
}