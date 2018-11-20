

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class KafkaSendTest {
    private Properties kafkaProps = new Properties();
    private KafkaProducer producer ;

    public KafkaSendTest(){
        kafkaProps.put("bootstrap.servers", "192.168.232.131:9092");
        kafkaProps.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        kafkaProps.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        producer = new KafkaProducer<String, String>(kafkaProps);
    }
    public static void main(String[] args) {
        ProducerRecord<String, String> record = new ProducerRecord<String, String>("Test", "Precision Products", "France");
        KafkaSendTest kafkaTest  = new KafkaSendTest();
        try{
            kafkaTest.producer.send(record).get();
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
