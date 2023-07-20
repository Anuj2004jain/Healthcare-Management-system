package com.wellbiing.wellbiinghealthcare;
import org.mindrot.jbcrypt.BCrypt;
    public class Credentials {
    String createHash(String password){
        return BCrypt.hashpw(password, BCrypt.gensalt(12));
    }

    Boolean checkHash(String candidate, String hashed) {
        if (BCrypt.checkpw(candidate, hashed)) {
            System.out.println("It matches");
            return true;
        } else {
            System.out.println("It does not match");
            return false;
        }
    }

//    public static void main(String[] args) {
//        String password = "pass123";
//        Credentials c = new Credentials();
//        String hash = c.createHash(password);
//        System.out.println(hash);
//
//        String candidate = "helloworld";
//        System.out.println(c.checkHash(candidate, hash));
//
//        System.out.println(c.checkHash(" yolo ", hash));
//    }
}
