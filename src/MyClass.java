class MyClass extends AbstractClass{

    private int data;

    public MyClass(){
        data = 0;
    }

    public MyClass(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public int compareTo(Object o) {
    if(!(o instanceof MyClass))
        throw new ClassCastException();
    if(((MyClass)o).data < data)
        return 1;
    if(((MyClass)o).data > data)
        return -1;
    else return 0;
    }

    public String toString(){
        return "" + data;
    }//end overridden toString()

    public boolean equals(Object o){
    if(!(o instanceof MyClass))
        return false;
    if(((MyClass)o).data == data)
        return true;
    else return false;
    }
}