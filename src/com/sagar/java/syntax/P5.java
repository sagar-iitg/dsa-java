
class P5

{

    boolean [] arr = new boolean[3];

    int count = 0;



    void set(boolean [] a, int i)

    {

        a[i] = true;

        ++count;

    }

    public static void main(String [] args)

    {

        P5 g = new P5();

        g.set(g.arr, 0);

        g.set(g.arr, 2);

        g.run();

    }



    void run()

    {

        if ( arr[0] && arr[1] | arr[2] )

            count++;

        if ( arr[1] && arr[(++count - 2)] )

            count += 7;

        System.out.println("count = " + count);

    }

}
