import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import java.util.Properties;

class SimpleKafkaProducer {
    private static KafkaProducer<String, String> producer;
    private final static String TOPIC = "Test";
    public SimpleKafkaProducer(){
        Properties props = new Properties();
        props.put("bootstrap.servers", "192.168.111.137:9092");
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("batch.size", 16384);
        props.put("linger.ms", 1);
        props.put("buffer.memory", 33554432);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        //设置分区类,根据key进行数据分区
        producer = new KafkaProducer<String, String>(props);
    }
    public void produce(){
        for (int i = 30;i<40;i++){
            String key = String.valueOf(i);
            String data = "hello kafka message："+key;
            producer.send(new ProducerRecord<String, String>(TOPIC,key,data));
            System.out.println(data);
        }
        producer.close();
    }

    public static void main(String[] args) {
        new SimpleKafkaProducer().produce();
    }
}
