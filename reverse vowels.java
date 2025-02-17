class Solution {
    public String reverseVowels(String s) {
      char[] c=s.toCharArray();
      int l=0;
      int r=c.length-1;
       while(l<=r){
        if((Character.toLowerCase(c[l])=='a'||Character.toLowerCase(c[l])=='e'||Character.toLowerCase(c[l])=='i'||Character.toLowerCase(c[l])=='o'||Character.toLowerCase(c[l])=='u')&&(Character.toLowerCase(c[r])=='a'||Character.toLowerCase(c[r])=='e'||Character.toLowerCase(c[r])=='i'||Character.toLowerCase(c[r])=='o'||Character.toLowerCase(c[r])=='u')){

        
        char temp=c[l];
        c[l]=c[r];
        c[r]=temp;
        l++;
        r--;
       } 
     else if(Character.toLowerCase(c[l])=='a'||Character.toLowerCase(c[l])=='e'||Character.toLowerCase(c[l])=='i'||Character.toLowerCase(c[l])=='o'||Character.toLowerCase(c[l])=='u'){
        r--;
     }
     else if(Character.toLowerCase(c[r])=='a'||Character.toLowerCase(c[r])=='e'||Character.toLowerCase(c[r])=='i'||Character.toLowerCase(c[r])=='o'||Character.toLowerCase(c[r])=='u'){
       l++;
     }
     else{
        l++;
        r--;
     }
       }
       return new String(c);

    }
}