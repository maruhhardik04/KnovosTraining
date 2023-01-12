package CallByValueAndReference;



public class Example {




    private int data=50;

    public int getData() {
        return data;
    }


    public void callByValue(int data)
    {
       data += 100;
    }

    public void callByReference(int data)
    {
        this.data += data;
    }

    public void callByReferenceUsingObject(Example example)
    {
            example.data += 100;
    }



}
