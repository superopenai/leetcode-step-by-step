package yuewen.ti4;

import java.math.BigInteger;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;


public class Solution {
    /**
     * 计算token
     * @param querys string字符串ArrayList 输入参数，每个键值对用=分割
     * @return string字符串
     */
    public String createToken (ArrayList<String> querys) throws Exception{
        // write code here
        StringBuilder sb = new StringBuilder();
        TreeMap<String, String> map = new TreeMap<>();
        String res = null;
        for (String query : querys) {
            String[] split = query.split("=");
            String encode = URLEncoder.encode(split[1], StandardCharsets.UTF_8);
            map.put(split[0],encode);

        }
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            String key = next.getKey();
            String value = next.getValue();
            sb.append(key).append("=").append(value).append("&");
        }
        String mid = sb.substring(0, sb.length() - 1);
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(mid.getBytes());
            res =new BigInteger(1,md5.digest()).toString(16);
            return  res;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return  null;
        }

    }
}