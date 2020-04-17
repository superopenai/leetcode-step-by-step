package wanmei.ti1;

import javax.sound.midi.MidiFileFormat;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/4/14 19:10
 * @Created by superning
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] str1 = s.split(" ");
        int[] weights = new int[str1.length];
        for (int i = 0; i < str1.length; i++) {
            weights[i] =Integer.parseInt(str1[i]);
        }
        int maxload =Integer.parseInt(br.readLine());
        int count =countLeastBoat(weights,maxload);
        System.out.println(count);

    }

    public static int countLeastBoat(int[] contant, int load){
        if (contant.length==0){
            return 0;
        }


        int res=0;
        Arrays.sort(contant);
        if (contant.length%2==0){
            for (int i = 0; i < contant.length; i+=2) {
                if (contant[i]+contant[i+1]<=load){
                    res++;
                }else {
                    res+=2;
                }
            }
        }else {
            for (int i = 0; i < contant.length-1; i+=2) {
                if (contant[i]+contant[i+1]<=load){
                    res++;
                }else {
                    res+=2;
                }
            }
            res++;
        }
        return res;
    }

}
