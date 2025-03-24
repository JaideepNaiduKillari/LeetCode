class Solution {
    public boolean isValid(String s) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<s.length();++i){
            if(s.charAt(i) == '('){
                stack.push(1);
            }
            if(s.charAt(i) == ')'){
                if(stack.isEmpty()){return false;}
                if(stack.peek() == 1){stack.pop();}
                else{
                    stack.push(-1);
                }
            }
            if(s.charAt(i) == '['){
                stack.push(2);
            }
            if(s.charAt(i) == ']'){
                if(stack.isEmpty()){return false;}
                if(stack.peek() == 2){stack.pop();}
                else{
                    stack.push(-1);
                }
            }
            if(s.charAt(i) == '{'){
                stack.push(3);
            }
            if(s.charAt(i) == '}'){
                if(stack.isEmpty()){return false;}
                if(stack.peek() == 3){stack.pop();}
                else{
                    stack.push(-1);
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}