/*import java.util.Scanner;
public class Marks {
public static void main(String args[]){
System.out.println("Enter Marks Of CBSE Students: ");
int[] marks= new int[5];
Scanner obj=new Scanner(System.in);
float sum=0;
for(int i=0; i<5; i++){
marks[i]= obj nextInt();
sum+=marks[i];
}        
float Percent=sum/5;
System.out.println("Percent: "+ Percent +"%");
}    
}
*/

import java.util.Scanner;
public class GPA{
    public static void main(String args[]){
        try (Scanner subject = new Scanner(System.in)) {
            float subject1=subject.nextFloat();
            
            float subject2=subject.nextFloat();
            
            float subject3=subject.nextFloat();
            float average =((subject1 + subject2+ subject3)*3);
            System.out.println("average:"+ average);
        }
    }
}