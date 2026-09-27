import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map =new HashMap<>();
        map.put('}','{');
        map.put(')','(');
        map.put(']','[');

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                char topele= stack.isEmpty()?'#':stack.pop();
                if(topele != map.get(c)){
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();

    }
}