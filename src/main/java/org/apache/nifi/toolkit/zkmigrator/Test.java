package org.apache.nifi.toolkit.zkmigrator;

public class Test {

    public static void main(String s[]) {
        byte[] bytes = "abc".getBytes();
        bytes = null;
        String ss = new String(bytes);
        System.out.println(ss);

    }
}
