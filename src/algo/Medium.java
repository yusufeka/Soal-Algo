/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo;

/**
 *
 * @author blegoh
 */
public class Medium {
    
    public static int superDigit(int n) {
        String a = n + "";
        int jml = 0;
        for (int i = 0; i < a.length(); i++) {
            jml += Integer.parseInt(a.charAt(i) + "");
        }
        if (jml < 10) {
            return jml;
        } else {
            return superDigit(jml);
        }
    }
}