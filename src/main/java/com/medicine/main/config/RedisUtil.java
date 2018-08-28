/*package com.medicine.main.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public enum RedisUtil {
    INSTANCE;

@Autowired
RedisTemplate<String, Object> redisTemplate;
    private final JedisPool pool;

    RedisUtil() {
        pool = new JedisPool(new JedisPoolConfig(), "localhost");
    }

    public void sadd(String key, String value) {
    	
        Jedis jedis = null;
        try{
            jedis = pool.getResource();
            jedis.sadd(key, value);
        } finally {
            if (jedis != null) 
            {
            jedis.expire(key, 50);
                jedis.close();
            }
        }
    }
    


    public boolean sismember(String key, String value) {
        Jedis jedis = null;
        try{
            jedis = pool.getResource();
            return jedis.sismember(key, value);
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }

    

}
*/