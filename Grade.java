import java.util.*;
public class Grade {
    public static void main(String [] args){
        Scanner x=new Scanner(System.in);
        System.out.println("enter number of Subject");
        int count=x.nextInt();
        int a[]=new int[count];
        double sum=0;
        for(int i=0;i<count;i++){
            System.out.println("enter "+(i+1)+"st subject marks");
            a[i]=x.nextInt();
            sum+=a[i];
        }
        double avg=sum/count;
        System.out.println("total mark is  "+sum);
        System.out.println("avg mark is  "+avg);
        if(avg>90){
            System.out.println("Grade is -->A+");
        }
        else if(avg>80){
            System.out.println("Grade is -->A");
        }
        else if(avg>70){
            System.out.println("Grade is -->B+");
        }
        else if(avg>60){
            System.out.println("Grade is -->B");
        }
        else if(avg>50){
            System.out.println("Grade is -->C+");
        }
        else{
            System.out.println("Fail");
        }
    }
}