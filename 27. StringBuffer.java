/* StringBuffer is mutable string
can be changed with setCharAt()
it cannot access with index like s[3]
default capacity is 16 and can be changed
capacity()
length()
charAt(index)
setCharAt(index,ch)
*/
class Main{
    public static void main(String args[]){
        StringBuffer str = new StringBuffer("abc");

        System.out.println(str.capacity());
        System.out.println(str.length());
        System.out.println(str);
    }
}