int Solution::power(string s) {
int num=0;
//if(s=="0" || s=="1")
//return 0;
for(int i=0;i<s.length();i++)
num=num*10+(s[i]-'0');
//cout<<num;
if((num&(num-1))==0)
return 1;
else
return 0;
}
