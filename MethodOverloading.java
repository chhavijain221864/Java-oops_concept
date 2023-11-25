class Record
{
    int a,b,c;
    void getData()
    {
        a=0;b=0;c=0;
    } 
    void getData(int x)
    {
        a=x;
        b=x;
        c=x;
    }
    void getData(int x,int y,int z)
    {
        a=x;
        b=y;
        c=z;
    }
    void display()
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
    }
    class MethodOverloading
    {
        public static void main(String args[])
        {
            Record k=new Record();
            Record s=new Record();
            Record m=new Record();
            k.getData();
            s.getData(4);
            m.getData(12,11,13);
            k.display();
            s.display();
            m.display();
        }
    }