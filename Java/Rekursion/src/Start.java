public class Start {

    static void countdown(int n){
        if (n == 0) {
            System.out.println("BOOOOOM!!!");
        } else {
            System.out.println(n);
        }
        if(n<1){
            return;
        }
        countdown(--n);
    }

    static int fak(int n){
        if(n<=1){
            return 1;
        } else {
            return n * fak(--n);
        }
    }

    public static void main(String[] args){

        int n = 19;
        System.out.println(fak(n));

        //countdown(n);

        /*while(true){
            System.out.println(n);
            n--;
            if(n<1){
                break;
            }
        }

         */

    }
}
