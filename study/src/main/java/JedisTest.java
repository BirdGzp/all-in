import redis.clients.jedis.Jedis;

public class JedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.111.136");
        System.out.println(jedis.ping());
    }

}
