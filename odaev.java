// import java.util.Scanner;

class odaev{
    public static void main(String[] args) {
        // int n=new Scanner(System.in).nextInt();
        for(int i=1;i<=100;i++){
            boolean ch=true;
            if(i<2)continue;
            for(int j=2;j<=i/2;j++)if(i%j==0){ch=false;break;}
            if(ch)System.out.println(i);
        }
    }
}