/**
 * 
 */
package leetcode;

import java.util.Stack;

/**
 * @author I307658
 *
 */
public class EvalRPN {
 public static int evalRPN(String[] tokens) {
         Stack<Integer>  s=new Stack<Integer>();
         String operationString="+, -, *, /";
         for(String  item:tokens){
             if(!operationString.contains(item)){
                 s.push(Integer.valueOf(item));
                 continue;
             }
             int a=s.pop();
             int b=s.pop();
             switch (item) {
            case "+":
                s.push(a+b);
                break;
            case "-":
                s.push(b-a);
                break;
            case "*":
                s.push(a*b);
                break;
            case "/":
                if(a==0) s.push(0);
                else  s.push(b/a);
                break;
            default:
                break;
            }
         }
        
        return s.pop();
    }
}
