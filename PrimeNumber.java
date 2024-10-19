import java.util.Scanner;
class PrimeNumber{
    public static void main(String[]args){
Scanner sc = new Scanner(System.in);
        int i ,j,check;
System.out.println("start prime number printing ");
int start = sc.nextInt();
System.out.println("enter the last prime number ");
int last = sc.nextInt();
for(i = start;i<=last;i++){
    check =0;
    for(j = 2;j<i;j++){
        if(i%j==0){
            check++;
            break;
        }
    }
    if(check==0){
        System.out.print(i+" ");
    }
}
    }
}