package Method;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x1,x2,res;
        int k=1;
        char ch,c;
        Operations o = new Operations();
        while(k==1){
            System.out.println("Enter first number: ");
            x1 = s.nextInt();
            System.out.println("Enter second number: ");
            x2 = s.nextInt();
            System.out.println("Choose the operation you want to perform:");
            System.out.println("1. +\n2. -\n3.*\n4. /");
            ch = s.next().charAt(0);
            if(ch=='+'){
                o.add(x1,x2);
            }
            else if(ch=='-'){
                o.sub(x1,x2);
            }
            else if(ch=='*'){
                o.mul(x1,x2);
            }
            else if(ch=='/'){
                o.div(x1,x2);
            }
            System.out.println("Do you want to continue(y/n)");
            c = s.next().charAt(0);
            if(c=='y'){
                k=1;
            }
            else{
                k=0;
            }
        }
    }
}
public class Operations extends calc{
    public void add(int x1, int x2){
        System.out.println("Sum="+(x1+x2));
    }
    public void sub(int x1, int x2){
        System.out.println("Difference="+(x1-x2));
    }
    public void mul(int x1, int x2){
        System.out.println("Product="+(x1*x2));
    }
    public void div(int x1, int x2){
        System.out.println("Quotient="+(x1/x2));
    }
}

