package sudhir;

public class BookAllocation {

    static int bookAllocation(int[] a, int size, int max,  int k)
    {


        int s = max;
        int ak = 0;
        int mid;
        int res = -1;

        for (int i = 0; i < size; i++)
        {
            ak = ak + a[i];
        }
        int e = ak;
        while (s <= e)
        {

           mid = s + (e - s) / 2;
            if (isValida(a, size, mid, k))
            {

                res = mid;
                e = mid - 1;
            }
            else
            {
                s = mid + 1;
            }

            mid = s + (e - s) / 2;
        }
        return res;
    }

 static boolean isValida(int[] a, int size, int mid, int k)
    {

        int s1 = 1;
        int sum = 0;
        for (int i = 0; i < size; i++)
        {
            if (sum + a[i] <= mid)
            {
                sum += a[i];
            }
            else
            {
                s1++;
                if (s1 > k || a[i] > mid)
                {
                    return false;
                }
                sum = a[i];
            }
        }

        return true;
    }



    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40};

        int size = 4;
        int max = 40;
        int sum = 0;




        int z = bookAllocation(a, size, 40, 2);
        System.out.println(z);

    }



}
