package org.coolimc.JTS3Bot.Events;

public class TS3BotClientDisconnectEvent extends TS3BotClientLeaveEvent
{
	public TS3BotClientDisconnectEvent(TS3BotClientLeaveEvent basicEvent)
	{
		super(basicEvent);
	}
}
