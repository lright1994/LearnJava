class StringLearn{
    public static void main(String[] args) {
        String str1 = "test";
        System.out.println("test".equals(str1));// all const string is a anonymous object of String. String is no basic type of data 
        String str2 = new String("test");
        System.out.println(str1==str2); //compare the address of str1 str2
        System.out.println(str1.equals(str2));

        String str11 = "test";
        System.out.println(str1 == str11); // point to the same heap memory  
        
        String strC1 = "www.";
        String strC2 = "www.";
        strC1 += "lright";
        // when String is "changed", actually it's point to a new String
        // a lot of garbage will be created
        System.out.println("String can be changed: " + (strC1 == strC2)); 

    }
}