class A
{
    void A()
    {
        int a ;
        int b ;
    }

    void swap(int a, int b)
    {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String args[])
    {
        A a1 = new A();
        a1.swap(2, 3);
        A b1 = new A();
        b1.swap(5, 6);
    }
}

