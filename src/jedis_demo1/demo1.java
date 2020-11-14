package jedis_demo1;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class demo1 {
	   
       public static void main(String arg[])
       {
           Jedis jedis=new Jedis("192.168.126.129",6379);
           jedis.auth("123456");
           jedis.set("huanjun", "1234");
       }
}
