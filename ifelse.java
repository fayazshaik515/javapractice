import java.util.Scanner;
public class ifelse {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter student name");
        String name = in.next();
        System.out.println("enter roll number");
        int num = in.nextInt();
        System.out.println("enter marks");
        int n = in.nextInt();
        if(n<=35){
            System.out.println(" The below student is fail\n"+name+"\n"+num+"\n"+n);
        }
        else if(n>=35 && n<=50){
            System.out.println(" The below student is b grade\n"+name+"\n"+num+"\n"+n);

        }
        else{
            System.out.println(" The below student is a grade\n"+name+"\n"+num+"\n"+n);
        }
        
    }
}