package com.dbmssema.monitorap.requests.responses;

import java.util.List;

public class ThingSpeakResponse {

    private ChannelResponse channel;

    private List<Feed> feeds;

    public ThingSpeakResponse(ChannelResponse channel, List<Feed> feeds) {
        this.channel = channel;
        this.feeds = feeds;
    }

    public ChannelResponse getChannel() {
        return channel;
    }

    public void setChannel(ChannelResponse channel) {
        this.channel = channel;
    }

    public List<Feed> getFeeds() {
        return feeds;
    }

    public void setFeeds(List<Feed> feeds) {
        this.feeds = feeds;
    }

    @Override
    public String toString() {
        return "ThingSpeakResponse{" +
                "channel=" + channel +
                ", feeds=" + feeds +
                '}';
    }
}
