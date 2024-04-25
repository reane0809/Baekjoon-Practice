import java.util.Arrays;
import java.util.Scanner;

 
public class Main {
 
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
        
    	 String str= sc.nextLine();
    	 
    	 char arr[] = str.toCharArray();
    	 int cnt[]= new int[26];
    	 Arrays.fill(cnt, -1);
    	 for(int i=0;i<arr.length;i++){
    		 if(arr[i]=='a'){  if(cnt[0]==-1) cnt[0]=i;}
    		 else if(arr[i]=='b'){ if(cnt[1]==-1) cnt[1]=i;}
    		 else if(arr[i]=='c') {if(cnt[2]==-1) cnt[2]=i;}
    		 else if(arr[i]=='d') {if(cnt[3]==-1) cnt[3]=i;}
    		 else if(arr[i]=='e') {if(cnt[4]==-1) cnt[4]=i;}
    		 else if(arr[i]=='f') {if(cnt[5]==-1) cnt[5]=i;}
    		 else if(arr[i]=='g') {if(cnt[6]==-1) cnt[6]=i;}
    		 else if(arr[i]=='h'){ if(cnt[7]==-1) cnt[7]=i;}
    		 else if(arr[i]=='i') {if(cnt[8]==-1) cnt[8]=i;}
    		 else if(arr[i]=='j') {if(cnt[9]==-1) cnt[9]=i;}
    		 else if(arr[i]=='k'){ if(cnt[10]==-1) cnt[10]=i;}
    		 else if(arr[i]=='l'){ if(cnt[11]==-1) cnt[11]=i;}
    		 else if(arr[i]=='m') {if(cnt[12]==-1) cnt[12]=i;}
    		 else if(arr[i]=='n') {if(cnt[13]==-1) cnt[13]=i;}
    		 else if(arr[i]=='o') {if(cnt[14]==-1)  cnt[14]=i;}
    		 else if(arr[i]=='p'){if(cnt[15]==-1)  cnt[15]=i;}
    		 else if(arr[i]=='q') {if(cnt[16]==-1)  cnt[16]=i;}
    		 else if(arr[i]=='r'){ if(cnt[17]==-1) cnt[17]=i;}
    		 else  if(arr[i]=='s'){ if(cnt[18]==-1) cnt[18]=i;}
    		 else if(arr[i]=='t'){ if(cnt[19]==-1) cnt[19]=i;}
    		 else  if(arr[i]=='u'){ if(cnt[20]==-1) cnt[20]=i;}
    		 else  if(arr[i]=='v'){ if(cnt[21]==-1) cnt[21]=i;}
    		 else if(arr[i]=='w') {if(cnt[22]==-1) cnt[22]=i;}
    		 else if(arr[i]=='x') {if(cnt[23]==-1) cnt[23]=i;}
    		 else if(arr[i]=='y'){ if(cnt[24]==-1) cnt[24]=i;}
    		 else if(arr[i]=='z'){ if(cnt[25]==-1) cnt[25]=i;}
    	 } 
    	 for(int i=0;i<cnt.length;i++){
    		
    		 System.out.print(cnt[i]+" ");
    		
    	 }
    }
    
    
}


