var stompClient = {
    client: null,
    socket: null,
    connect: function () {
        this.socket = new SockJS('/websocket');
        this.client = Stomp.over(this.socket);
//            this.client.debug = null;
        this.client.connect({}, function (frame) {
            stompClient.client.subscribe('/topic/pingpong', function (events) {
                stompClient.consume(events);
            });
        });
    },
    consume: function (raw) {
       console.log(raw);
    },
    close: function () {
        if (this.client != null && this.client != undefined) {
            this.client.unsubscribe('/topic/pingpong');
            this.client.disconnect();
            this.client = null;
        }
    }
};

$("#ping").click(function() {
    stompClient.client.send("/app/ping", {}, "");
})

$("#disconnect").click(function() {
    stompClient.close();
});

$("#connect").click(function() {
    stompClient.connect();
});