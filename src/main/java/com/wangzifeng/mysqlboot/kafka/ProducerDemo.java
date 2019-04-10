package com.wangzifeng.mysqlboot.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

/*
卡夫卡   生产者
 */
import java.util.Properties;

public class ProducerDemo {
    public static void main(String[] agrs){
        Properties properties = new Properties();
        //ootstrap.servers是Kafka集群的IP地址，如果Broker数量超过1个，则使用逗号分隔，如"192.168.1.110:9092,192.168.1.110:9092"。其中，192.168.1.110是我的其中一台虚拟机的
        //           IP地址，9092是所监听的端口
        properties.put("bootstrap.servers", "localhost:9092");
        properties.put("acks", "all");
        properties.put("retries", 0);
        properties.put("batch.size", 16384);
        properties.put("linger.ms", 1);
        properties.put("buffer.memory", 33554432);
        //序列化类型。 Kafka消息是以键值对的形式发送到Kafka集群的，其中Key是可选的，Value可以是任意类型。但是在Message被发送到Kafka集群之前，Producer需要把不同类型的消
        //　　　息序列化为二进制类型。本例是发送文本消息到Kafka集群，所以使用的是StringSerializer
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        Producer<String, String> producer = null;
        try {
            producer = new KafkaProducer<String, String>(properties);
           // 发送Message到Kafka集群
            for (int i = 0; i < 100; i++) {
                String msg = "发送消息 第 " + i+"个";
                producer.send(new ProducerRecord<String, String>("HelloWorld", msg));
                System.out.println("发送消息:" + msg);
            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            producer.close();
        }

    }
}
