public class Main {

    public static void main(String[] args) {

        work(8,3,30);
        work(8,3,35);
        work(8,3,40);
        System.out.println();
        work(9,3,30);
        work(9,3,35);
        work(9,3,40);
        System.out.println();
        work(10,3,30);
        work(10,3,35);
        work(10,3,40);
        System.out.println();
        work(11,3,30);
        work(11,3,35);
        work(11,3,40);
        System.out.println();
        work(8,4,30);
        work(8,4,35);
        work(8,4,40);
        System.out.println();
        work(8,5,30);
        work(8,5,35);
        work(8,5,40);
        System.out.println();
        work(8,6,30);
        work(8,6,35);
        work(8,6,40);



    }

    public static void work(int devs, int weeks,int hours) {
        //8 3   9 3     10  3   11 3 8 4 8 5 8   6
        double scope = 1590;
        double Work = 100 * (scope)/(devs * weeks * hours);
        System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at" +
                " %d%% of capacity. %n",devs,weeks,hours,(int)Work);

    }
}
