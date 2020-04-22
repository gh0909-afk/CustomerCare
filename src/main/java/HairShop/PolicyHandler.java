package HairShop;

import HairShop.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReserved_문자발송(@Payload Reserved reserved){

        if(reserved.isMe()){
            System.out.println("##### listener 문자발송 : " + reserved.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverReservationCanceled_문자발송(@Payload ReservationCanceled reservationCanceled){

        if(reservationCanceled.isMe()){
            System.out.println("##### listener 문자발송 : " + reservationCanceled.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverTimeSelected_문자발송(@Payload TimeSelected timeSelected){

        if(timeSelected.isMe()){
            System.out.println("##### listener 문자발송 : " + timeSelected.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverTimeSelected_문자발송(@Payload TimeSelected timeSelected){

        if(timeSelected.isMe()){
            System.out.println("##### listener 문자발송 : " + timeSelected.toJson());
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverTimeSelected_문자발송(@Payload TimeSelected timeSelected){

        if(timeSelected.isMe()){
            System.out.println("##### listener 문자발송 : " + timeSelected.toJson());
        }
    }

}
