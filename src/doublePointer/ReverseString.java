package doublePointer;

public class ReverseString {

    public void reverseString(char[] s) {
        int slow = 0;
        int fast = s.length-1;
        while (slow<=fast){
            char temp = s[slow];
            s[slow] = s[fast];
            s[fast] = temp;
            slow++;
            fast--;
        }
    }
}
