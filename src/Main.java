import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.ArrayList;
import java.util.List;

public class Main {
@Test
    public void  test(){
    List<String> list=new ArrayList<>();
    list.add("0000");
    list.add("1111");
    list.add("2222");
    JedisPool jedisPool=new JedisPool("192.168.30.160",6379);
    System.out.println(jedisPool);
    Jedis jedis=jedisPool.getResource();

    jedis.select(1);
    jedis.set("name","李四");
    System.out.println(jedis.get("name"));

jedis.close();
jedisPool.close();
/*   Jedis jedis=new Jedis("192.168.30.160",6379);
    jedis.select(1);
    jedis.set("name","李四");
    System.out.println(jedis.get("name"));
    jedis.close();*/

}
}
