public class TryString {
    public static void main(String args[]) {
        String str1 = new String("This is really not immutable!!");
        String str2 = str1;
        boolean retVal;
        int length;
        double d = 102939939.939;
        retVal = str1.equals(str2);
        System.out.printf("\nReturned Value = " + retVal);
        System.out.printf("\nString Length is : " + str1.length());
        System.out.printf("\nString comparing is : " + str1.compareTo(str2));
        System.out.printf("\nString concat is : " + str1.concat(str2));
        System.out.printf("\nString replaceAll is : " + str1.replaceAll("is", "??"));
        System.out.printf("\nString substring is : " + str1.substring(10));
        System.out.printf("\nReturn Value : " + String.valueOf(d));
    }
}