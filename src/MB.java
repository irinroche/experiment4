

class GFG {


    public static void main(String[] args)
    {

        StringBuffer s = new StringBuffer("Mybirthday");


        int p = s.length();


        int q = s.capacity();


        System.out.println("Length of string Mybirthday="
                + p);
        System.out.println(
                "Capacity of string Mybirthday=" + q);
    }
}
