
function connect(){
    var socket = new SockJS('gs-guide-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame){
        setConnected(true);
        console.log('Connected: '+ frame);
        stompClient.subscribe('/topic/greetings', function greaating(){
            showGreeting(JSON.parse(greeting.body).content)
        });
    });
}

function showGreeting(message){
    $("#greeting").append("<tr><td>" + message + "</td></tr>");
}