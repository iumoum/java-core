package javacore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringSpliting {

    public static void main(String[] args) throws IOException {
        String str = "Jiwan, JangSung, InSeok";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] names = str.split(",");

        for(int i = 0; i < names.length; i++){
            System.out.println(i + 1 + ": " + names[i]);
        }

        try{
            br.readLine();
        } catch (IOException e){
            e.printStackTrace();
        } finally{
            br.close();
        }
    }
}
