
/*
给定一个字符串，问是否能通过添加一个字母将其变为回文串。

输入描述:
一行一个由小写字母构成的字符串，字符串长度小于等于10。

输出描述:
输出答案(YES\NO).
示例1
输入
coco
输出
YES
*/
package written_test0717;

import java.util.*;
//回文串
public class Test2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            int count = 0;
            for(int i = 0;i<s.length();i++){
                if(isPlindrome(s.substring(0,i)+s.substring(i+1))){

                    count ++;
                }
            }
            if(count == 0 ){
                System.out.println("NO");

            }else{
                System.out.println("YES");
            }
        }
    }
    public static boolean isPlindrome(String s){
        //判断是否为回文
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}