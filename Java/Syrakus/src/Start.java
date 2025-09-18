public class Start {

    static int syrakus(int n){

        System.out.println(n);
        if(n <= 1){
            return n;
        } else if (n%2 == 0){
            return syrakus(n/2);
        } else {
            return syrakus(3*n+1);
        }

    }

    public static void main(String[] args){

        syrakus(10);

    }
}
