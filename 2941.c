#include<stdio.h>
#include<string.h>
int main(void) {
	int len, cnt=0;
	char str[8][4] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
	char input[1000];
	fgets(input,sizeof(input),stdin);
	len = strlen(input);
	input[len-1]='\0';
	for (int i=0;i<len-1;i++) {
		if(input[i]=='c') {
			if((input[i+1]=='=')||(input[i+1]=='-')) {
				i+=1;
				cnt++;
			} else cnt++;
		} else if(input[i]=='d') {
			if((input[i+1]=='z') && (input[i+2]=='=')) {
				i+=2;
				cnt++;
			} else if(input[i+1]=='-') {
				i+=1;
				cnt++;
			} else cnt++;
		} else if((input[i]=='n') && (input[i+1]=='j')) {
			i+=1;
			cnt++;
		} else if((input[i]=='s') && (input[i+1]=='=')) {
			i+=1;
			cnt++;
		} else if((input[i]=='l') && (input[i+1]=='j')) {
			i+=1;
			cnt++;
		} else if((input[i]=='z') && (input[i+1]=='=')) {
			i+=1;
			cnt++;
		} else cnt++;
	}
	printf("%d",cnt);
	return 0;
}
