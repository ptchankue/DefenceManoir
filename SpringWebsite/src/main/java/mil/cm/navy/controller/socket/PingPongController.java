package mil.cm.navy.controller.socket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@EnableScheduling
class PingPongController {
 
    @Autowired
    SimpMessagingTemplate template;
 
    @Scheduled(fixedDelay = 20000L)
    @SendTo("/topic/pingpong")
    public void sendPong() {

        template.convertAndSend("/topic/pingpong", "pong (periodic)");
    }
 
    @MessageMapping("/ping")
    @SendTo("/topic/pingpong")
    public String sendPingResponse() {

        return "pong (response)";
    }

    @RequestMapping(value = "/socket1", method = RequestMethod.GET)
    public String testController(Model model) {
        return "socket/pingpong";
    }
}